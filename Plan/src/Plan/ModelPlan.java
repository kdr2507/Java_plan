package Plan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ModelPlan {
	
	Connection con;
    Statement stmt;
    ResultSet rs;
 
    String url = "jdbc:mysql:127.0.0.1:3306/java_plan";
    String id = "root";
    String pw = "autoset";
	//----------------------------------------------------------
    public ModelPlan() {
    	try{
            //����̹� �ε� (Mysql �Ǵ� Oracle �߿� �����Ͻø� �˴ϴ�.)
            Class.forName("com.mysql.jdbc.Driver"); //mysql
            //Class.forName("oracle.jdbc.driver.OracleDriver"); //oracle
            
            //Ŀ�ؼ��� �����´�.
            con = DriverManager.getConnection(url, id, pw);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

 
    public void closeConnection(){
 
        try{
            //�ڿ� ��ȯ
            rs.close();
            stmt.close();
            con.close();
 
        }catch(Exception e){
            e.printStackTrace();
        }
 
    }
    
    
    
    //----------------------------------------------------------
	//�α���
	public void loginUser(){
		
		try{
            
            stmt = con.createStatement();
            //�����͸� �����´�.
            rs = stmt.executeQuery("select * from user");
 
            while(rs.next()){
                //���
                System.out.println(rs.getString("userId"));

 
            }
 
        }catch(Exception e){
            e.printStackTrace();
        }
		
		closeConnection();
		
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
