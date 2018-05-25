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
    	
    	//JDBC 버전에 의해 DB접속이 안되는 경우 참고 : http://developer-kylee.tistory.com/8
    	
    	try{
			//드라이버 로딩 (Mysql 또는 Oracle 중에 선택)
            Class.forName("com.mysql.cj.jdbc.Driver"); //mysql
            //Class.forName("oracle.jdbc.driver.OracleDriver"); //oracle
            //Class.forName("com.mariadb.cj.jdbc.Driver"); //mariadb
 
            
            //커넥션을 가져온다.
            con = DriverManager.getConnection(url, id, pw);
            
            stmt = con.createStatement();
            
        }catch(Exception e){
            
        }
		
	}
    
    
    
	//로그인
	public boolean loginUser(String ID, String PW){
		
		
		try {
			
            //데이터를 가져온다.
            rs = stmt.executeQuery("select * from user where userId = '"+ID+"' and password = '"+PW+"'");

            if(rs.isBeforeFirst()){
            	return true;
                
            }else {
            	return false;
            }
            
		}catch(Exception e) {
			System.out.println("데이터 가져오지 못함");
		}
		
		//DB연결 종료
		try {
			
			rs.close();
	        stmt.close();
	        con.close();
		}catch(Exception e) {
			
		}
		return false;

	}
	
	//회원가입
	public boolean registerUser(String ID, String PW, String PW_Check){
		if(PW.equals(PW_Check)) {
			
			String sql = "insert into user(userId, password) values('"+ID+"', '"+PW+"');";
			
			try {
				
				stmt.executeUpdate(sql);
				
			}catch(Exception e) {
				//DB연결 종료
				try {
			        stmt.close();
			        con.close();
				}catch(Exception e_sub) {
					
				}
				
				return false;
			}
		}else {
			//PW와 PW_Check가 같지 않으면 회원가입 안됨
			
			//DB연결 종료
			try {
		        stmt.close();
		        con.close();
			}catch(Exception e_sub) {
				
			}
			
			return false;
		}
		
		//DB연결 종료
		try {
	        stmt.close();
	        con.close();
		}catch(Exception e) {
			
		}
		
		return true;
		
		
	}
	
	//ID 존재유무 확인
	public boolean ID_Check(String ID){
		
			try {
			
            //데이터를 가져온다.
			//ID가 존재하면 false 존재하지 않으면 true
            rs = stmt.executeQuery("select * from user where userId = '"+ID+"';");

            if(rs.isBeforeFirst()){
            	return false;
                
            }else {
            	return true;
            }
            
		}catch(Exception e) {
			System.out.println("데이터 가져오지 못함");
		}
		
		//DB연결 종료
		try {
			
			rs.close();
	        stmt.close();
	        con.close();
		}catch(Exception e) {
			
		}
		
		return false;
	}
	
	//그룹 생성
	public void group_create(){
		
	}
	//그룹 가입
	public void group_join(){
		
	}
	//그룹 초대
	public void group_invite(){
		
	}
	
	//계획 저장
	public void inputPlanData(){
		
	}
	
	//계획 수정
	public void changePlanData(){
		
	}
	
}
