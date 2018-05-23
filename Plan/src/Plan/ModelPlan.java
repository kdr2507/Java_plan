package Plan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ModelPlan {
	
	Connection con;
    Statement stmt;
    ResultSet rs;
 
    String url = "jdbc:mysql://localhost:3306/java_plan?serverTimezone=UTC";
    //String url = "jdbc:mariadb://localhost:9999/java_plan?serverTimezone=UTC";
    String id = "root";
    String pw = "autoset";

    
    public ModelPlan() {
    	
    	//JDBC ������ ���� DB������ �ȵǴ� ��� ���� : http://developer-kylee.tistory.com/8
    	
    	try{
			//����̹� �ε� (Mysql �Ǵ� Oracle �߿� ����)
            Class.forName("com.mysql.cj.jdbc.Driver"); //mysql
            //Class.forName("oracle.jdbc.driver.OracleDriver"); //oracle
            //Class.forName("com.mariadb.cj.jdbc.Driver"); //mariadb
 
            
            //Ŀ�ؼ��� �����´�.
            con = DriverManager.getConnection(url, id, pw);
            
            
            stmt = con.createStatement();
        }catch(Exception e){
            
        }
		
	}
    
    //DB���� ����
    public void disConnection() {
    	try{
            //�ڿ� ��ȯ
            rs.close();
            stmt.close();
            con.close();
 
        }catch(Exception e){
            System.out.println("�ڿ� ��ȯ �Ұ�");
        }
    }
    
	//�α���
	public boolean loginUser(String ID, String PW){
		
		
		try {
			
            //�����͸� �����´�.
            rs = stmt.executeQuery("select * from user where userId = '"+ID+"' and password = '"+PW+"'");

            if(rs.isBeforeFirst()){
            	return true;
                
            }else {
            	return false;
            }
            
		}catch(Exception e) {
			System.out.println("������ �������� ����");
		}
		
		disConnection();
		
		return false;

	}
	
	//ȸ������
	public String registerUser(){
		
		return "ȸ������ ����";
	}
	
	//�׷� ����
	public void group_create(){
		
	}
	//�׷� ����
	public void group_join(){
		
	}
	//�׷� �ʴ�
	public void group_invite(){
		
	}
	
	//��ȹ ����
	public void inputPlanData(){
		
	}
	
	//��ȹ ����
	public void changePlanData(){
		
	}
	
}
