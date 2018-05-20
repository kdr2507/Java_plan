package Plan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ViewPlan extends JFrame{
	
	JFrame jframe;
	JPanel loginPanel;
	JButton login, register;
	public void main_plan(){
		 login();
		
	}
	
	private void login(){
		
		jframe = new JFrame();
		
		jframe.setTitle("계획 확인 프로그램");
		jframe.setSize(1000, 1000);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		loginPanel = new JPanel();
		//로그인 버튼
		login = new JButton("Sign in");
		//회원가입 버튼
		register = new JButton("Register");
		
		
		//로그인 버튼을 누를 경우 동작
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ModelPlan MP = new ModelPlan();
				MP.loginUser();
			}
		});
		
		//회원가입 버튼을 누를 경우 동작
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ModelPlan MP = new ModelPlan();
				String text = MP.registerUser();
				
				System.out.println(text);
			}
		});
		
		loginPanel.add(login);
		loginPanel.add(register);
		
		jframe.add(loginPanel);
	}
}
