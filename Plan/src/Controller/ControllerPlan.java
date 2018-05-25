package Controller;
import Model.Model_login_register;
import View.View_login_register;


public class ControllerPlan {
	public void view(){
		View_login_register TF = new View_login_register();
		
		TF.login();
	}
	
	//로그인 메서드
	public boolean login_controller(String ID, String PW) {
		Model_login_register MP = new Model_login_register();
		if(MP.loginUser(ID, PW)) {

			return true;
			
		}else{
			
			return false;
		}
	}
	
	//회원가입 메서드
	public boolean register(String ID, String PW, String PW_Check) {
		Model_login_register MP = new Model_login_register();
		
		return MP.registerUser(ID, PW, PW_Check);
	}
	
	//2개의 텍스트 같은지 다른지 여부 판단
	public boolean text_equal_check(String first_text, String second_text) {
		
		if(first_text.equals(second_text)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean id_check(String ID) {
		Model_login_register MP = new Model_login_register();
		
		return MP.ID_Check(ID);
	}
	
}
