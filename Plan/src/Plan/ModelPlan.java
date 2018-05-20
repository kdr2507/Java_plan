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
            //드라이버 로딩 (Mysql 또는 Oracle 중에 선택하시면 됩니다.)
            Class.forName("com.mysql.jdbc.Driver"); //mysql
            //Class.forName("oracle.jdbc.driver.OracleDriver"); //oracle
            
            //커넥션을 가져온다.
            con = DriverManager.getConnection(url, id, pw);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

 
    public void closeConnection(){
 
        try{
            //자원 반환
            rs.close();
            stmt.close();
            con.close();
 
        }catch(Exception e){
            e.printStackTrace();
        }
 
    }
    
    
    
    //----------------------------------------------------------
	//로그인
	public void loginUser(){
		
		try{
            
            stmt = con.createStatement();
            //데이터를 가져온다.
            rs = stmt.executeQuery("select * from user");
 
            while(rs.next()){
                //출력
                System.out.println(rs.getString("userId"));

 
            }
 
        }catch(Exception e){
            e.printStackTrace();
        }
		
		closeConnection();
		
	}
	
	//회원가입
	public String registerUser(){
		
		return "회원가입 시작";
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
