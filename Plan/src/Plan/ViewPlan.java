package Plan;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ViewPlan extends JFrame{
	
	JFrame jframe;
	JPanel loginPanel, idPanel, pwPanel;
	JButton login, register;
	JLabel id, pw;
	JTextField inputId;
	JPasswordField inputPw;
	public void main_plan(){
		 login();
		
	}
	
	private void login(){
		
		jframe = new JFrame();
		
		//FlowLayout ��� => ���ʿ��� ���������� ����
		setLayout(new FlowLayout());
		
		//�α��� �г�
		loginPanel = new JPanel();
		
		//id, id�Է� �г�
		idPanel = new JPanel();
		
		//pw, pw�Է� �г�
		pwPanel = new JPanel();
		
		//id �Է� �ؽ�Ʈ ĭ
		inputId = new JTextField();
		id = new JLabel("ID");
		
		//pw �Է� �ؽ�Ʈ ĭ
		inputPw = new JPasswordField();
		pw = new JLabel("PW");
		
		
		
		//id�гο� id��, id�Է�â �߰�
		idPanel.add(id);
		idPanel.add(inputId);
		
		//pw�гο� pw��, pw�Է�â �߰�
		pwPanel.add(pw);
		pwPanel.add(inputPw);
		
		//�α����гο� id�г�, pw�г� �߰�  
		loginPanel.add(idPanel);
		loginPanel.add(pwPanel);
		
		//�α��� ��ư
		login = new JButton("Sign in");
		//ȸ������ ��ư
		register = new JButton("Register");
		
		loginPanel.add(login);
		loginPanel.add(register);
		
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
		
		
		
		
		jframe.add(loginPanel);
		
		jframe.setTitle("��ȹ Ȯ�� ���α׷�");
		jframe.setSize(500, 500);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
