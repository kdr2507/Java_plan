package Plan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ModelPlan {
	
	Connection con;
    Statement stmt;
    ResultSet rs;
 
    String url = "jdbc:mysql://localhost:3306/java_plan?serverTimezone=UTC";
    String id = "root";
    String pw = "autoset";

    public ModelPlan() {
    	
    	//JDBC ������ ���� DB������ �ȵǴ� ��� ���� : http://developer-kylee.tistory.com/8
    	
    	try{
			//����̹� �ε� (Mysql �Ǵ� Oracle �߿� ����)
            Class.forName("com.mysql.cj.jdbc.Driver"); //mysql
            //Class.forName("oracle.jdbc.driver.OracleDriver"); //oracle
 
        }catch(Exception e){
            System.out.println("�ε� �Ұ�");
        }
		
		//------------------------------------------------------------------
		try {
          	//Ŀ�ؼ��� �����´�.
            con = DriverManager.getConnection(url, id, pw);

		}catch(Exception e) {
			System.out.println("Ŀ�ؼ��� �������� ���Ѵ�.");
		}
		
		//------------------------------------------------------------------
		
		try {
			stmt = con.createStatement();
            
		}catch(Exception e) {
			System.out.println("stmt���� ���� �߻�");
		}
		
		//------------------------------------------------------------------
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
	public void loginUser(){
		
		try {
			
            //�����͸� �����´�.
            rs = stmt.executeQuery("select * from user");
 
            while(rs.next()){
                //���
                System.out.println(rs.getString("userId"));

            }
		}catch(Exception e) {
			System.out.println("������ �������� ����");
		}
		
		disConnection();
		
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
