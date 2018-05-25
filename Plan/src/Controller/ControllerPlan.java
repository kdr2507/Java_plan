package Controller;
import Model.ModelPlan;
import View.ViewPlan;


public class ControllerPlan {
	public void view(){
		ViewPlan TF = new ViewPlan();
		
		TF.main_plan();
	}
	
	//�α��� �޼���
	public void login_controller(String ID, String PW) {
		ModelPlan MP = new ModelPlan();
		if(MP.loginUser(ID, PW)) {
			System.out.println("�α��� �Ϸ�");
		}else{
			System.out.println("ID/PW�� ���� �ʽ��ϴ�.");
		};
	}
	
	//ȸ������ �޼���
	public boolean register(String ID, String PW, String PW_Check) {
		ModelPlan MP = new ModelPlan();
		
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
		ModelPlan MP = new ModelPlan();
		
		return MP.ID_Check(ID);
	}
	
}
