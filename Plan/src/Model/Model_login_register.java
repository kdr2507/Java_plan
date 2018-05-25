package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Model_login_register {
	
	Connection con;
    Statement stmt;
    ResultSet rs;
 
    String url = "jdbc:mysql://localhost:3306/java_plan?serverTimezone=UTC";
    //String url = "jdbc:mariadb://localhost:9999/java_plan?serverTimezone=UTC";
    String id = "root";
    String pw = "autoset";

    
    public Model_login_register() {
    	
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
		
		//DB���� ����
		try {
			
			rs.close();
	        stmt.close();
	        con.close();
		}catch(Exception e) {
			
		}
		return false;

	}
	
	//ȸ������
	public boolean registerUser(String ID, String PW, String PW_Check){
		if(PW.equals(PW_Check)) {
			
			String sql = "insert into user(userId, password) values('"+ID+"', '"+PW+"');";
			
			try {
				
				stmt.executeUpdate(sql);
				
			}catch(Exception e) {
				//DB���� ����
				try {
			        stmt.close();
			        con.close();
				}catch(Exception e_sub) {
					
				}
				
				return false;
			}
		}else {
			//PW�� PW_Check�� ���� ������ ȸ������ �ȵ�
			
			//DB���� ����
			try {
		        stmt.close();
		        con.close();
			}catch(Exception e_sub) {
				
			}
			
			return false;
		}
		
		//DB���� ����
		try {
	        stmt.close();
	        con.close();
		}catch(Exception e) {
			
		}
		
		return true;
		
		
	}
	
	//ID �������� Ȯ��
	public boolean ID_Check(String ID){
		
			try {
			
            //�����͸� �����´�.
			//ID�� �����ϸ� false �������� ������ true
            rs = stmt.executeQuery("select * from user where userId = '"+ID+"';");

            if(rs.isBeforeFirst()){
            	return false;
                
            }else {
            	return true;
            }
            
		}catch(Exception e) {
			System.out.println("������ �������� ����");
		}
		
		//DB���� ����
		try {
			
			rs.close();
	        stmt.close();
	        con.close();
		}catch(Exception e) {
			
		}
		
		return false;
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
