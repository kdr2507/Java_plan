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
import javax.swing.border.EmptyBorder;

public class ViewPlan extends JFrame{
	
	JPanel loginPanel;
	JButton login, register;
	JLabel id, pw;
	JTextField inputId;
	JPasswordField inputPw;
	
	public ViewPlan() {
		super();
	}
	
	public void main_plan(){
		 login();
		
	}
	
	private void login(){
		
		//�α��� �г� ����
		loginPanel = new JPanel();
		
		setContentPane(loginPanel);
		loginPanel.setLayout(null);
		
		
		//ID �Է� �κ�
		id = new JLabel("ID");
		id.setBounds(134, 38, 57, 15);
		loginPanel.add(id);
		
		
		inputId = new JTextField();
		inputId.setBounds(203, 35, 116, 21);
		loginPanel.add(inputId);
		inputId.setColumns(10);
		
		
		//PW �Է� �κ�
		pw = new JLabel("PW");
		pw.setBounds(134, 69, 57, 15);
		loginPanel.add(pw);
		
		inputPw = new JPasswordField();
		inputPw.setBounds(203, 66, 116, 21);
		loginPanel.add(inputPw);
		inputPw.setColumns(10);
		
		
		//�α��� ��ư
		login = new JButton("login");
		login.setBounds(113, 117, 97, 23);
		loginPanel.add(login);
		
		
		//ȸ������ ��ư
		register = new JButton("register");
		register.setBounds(222, 117, 97, 23);
		loginPanel.add(register);
		
		//�α��� ��ư�� ���� ��� ����
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sendId = inputId.getText();
				String sendPw = inputPw.getText();
				
				ModelPlan login_check = new ModelPlan();
				if(login_check.loginUser(sendId, sendPw) == true) {
					System.out.println("�����ϴ� �����Դϴ�.");					
				}else {
					System.out.println("�����ϴ� ������ �ƴմϴ�.");
				}

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
		
		/*
		//FlowLayout ��� => ���ʿ��� ���������� ����
		setLayout(new FlowLayout());
		
		//�α��� �г�
		loginPanel = new JPanel();
		
		//id, id�Է� �г�
		idPanel = new JPanel();
		
		//pw, pw�Է� �г�
		pwPanel = new JPanel();
		
		//id �Է� �ؽ�Ʈ ĭ
		id = new JLabel("ID");
		inputId = new JTextField(10);
		
		//pw �Է� �ؽ�Ʈ ĭ
		pw = new JLabel("PW");
		inputPw = new JPasswordField(10);
		
		
		
		//id�гο� id��, id�Է�â �߰�
		idPanel.add(id);
		idPanel.add(inputId);
		
		//pw�гο� pw��, pw�Է�â �߰�
		pwPanel.add(pw);
		pwPanel.add(inputPw);
		
  
		//�α����гο� id�г�, pw�г� �߰�		
		add(idPanel);
		
		add(pwPanel);
		
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
		
		
		
		add(loginPanel);
		*/
		
		
		setTitle("��ȹ Ȯ�� ���α׷�");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
