package Controller;
import Model.Model_login_register;
import View.View_login_register;


public class ControllerPlan {
	public void view(){
		View_login_register TF = new View_login_register();
		
		TF.login();
	}
	
	//�α��� �޼���
	public boolean login_controller(String ID, String PW) {
		Model_login_register MP = new Model_login_register();
		if(MP.loginUser(ID, PW)) {

			return true;
			
		}else{
			
			return false;
		}
	}
	
	//ȸ������ �޼���
	public boolean register(String ID, String PW, String PW_Check) {
		Model_login_register MP = new Model_login_register();
		
		return MP.registerUser(ID, PW, PW_Check);
	}
	
	//2���� �ؽ�Ʈ ������ �ٸ��� ���� �Ǵ�
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
