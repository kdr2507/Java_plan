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
    	
    	//JDBC 버전에 의해 DB접속이 안되는 경우 참고 : http://developer-kylee.tistory.com/8
    	
    	try{
			//드라이버 로딩 (Mysql 또는 Oracle 중에 선택)
            Class.forName("com.mysql.cj.jdbc.Driver"); //mysql
            //Class.forName("oracle.jdbc.driver.OracleDriver"); //oracle
 
        }catch(Exception e){
            System.out.println("로딩 불가");
        }
		
		//------------------------------------------------------------------
		try {
          	//커넥션을 가져온다.
            con = DriverManager.getConnection(url, id, pw);

		}catch(Exception e) {
			System.out.println("커넥션을 가져오지 못한다.");
		}
		
		//------------------------------------------------------------------
		
		try {
			stmt = con.createStatement();
            
		}catch(Exception e) {
			System.out.println("stmt에서 오류 발생");
		}
		
		//------------------------------------------------------------------
	}
    
    //DB연결 종료
    public void disConnection() {
    	try{
            //자원 반환
            rs.close();
            stmt.close();
            con.close();
 
        }catch(Exception e){
            System.out.println("자원 반환 불가");
        }
    }
    
	//로그인
	public void loginUser(){
		
		try {
			
            //데이터를 가져온다.
            rs = stmt.executeQuery("select * from user");
 
            while(rs.next()){
                //출력
                System.out.println(rs.getString("userId"));

            }
		}catch(Exception e) {
			System.out.println("데이터 가져오지 못함");
		}
		
		disConnection();
		
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
