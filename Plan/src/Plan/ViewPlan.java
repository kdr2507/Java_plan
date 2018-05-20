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
		
		jframe.setTitle("��ȹ Ȯ�� ���α׷�");
		jframe.setSize(1000, 1000);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		loginPanel = new JPanel();
		//�α��� ��ư
		login = new JButton("Sign in");
		//ȸ������ ��ư
		register = new JButton("Register");
		
		
		//�α��� ��ư�� ���� ��� ����
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ModelPlan MP = new ModelPlan();
				MP.loginUser();
			}
		});
		
		//ȸ������ ��ư�� ���� ��� ����
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
