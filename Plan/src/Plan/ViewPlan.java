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
		
		//로그인 패널 생성
		loginPanel = new JPanel();
		
		setContentPane(loginPanel);
		loginPanel.setLayout(null);
		
		
		//ID 입력 부분
		id = new JLabel("ID");
		id.setBounds(134, 38, 57, 15);
		loginPanel.add(id);
		
		
		inputId = new JTextField();
		inputId.setBounds(203, 35, 116, 21);
		loginPanel.add(inputId);
		inputId.setColumns(10);
		
		
		//PW 입력 부분
		pw = new JLabel("PW");
		pw.setBounds(134, 69, 57, 15);
		loginPanel.add(pw);
		
		inputPw = new JPasswordField();
		inputPw.setBounds(203, 66, 116, 21);
		loginPanel.add(inputPw);
		inputPw.setColumns(10);
		
		
		//로그인 버튼
		login = new JButton("login");
		login.setBounds(113, 117, 97, 23);
		loginPanel.add(login);
		
		
		//회원가입 버튼
		register = new JButton("register");
		register.setBounds(222, 117, 97, 23);
		loginPanel.add(register);
		
		//로그인 버튼을 누를 경우 동작
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sendId = inputId.getText();
				String sendPw = inputPw.getText();
				
				ModelPlan login_check = new ModelPlan();
				if(login_check.loginUser(sendId, sendPw) == true) {
					System.out.println("존재하는 유저입니다.");					
				}else {
					System.out.println("존재하는 유저가 아닙니다.");
				}

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
		
		/*
		//FlowLayout 사용 => 왼쪽에서 오른쪽으로 정렬
		setLayout(new FlowLayout());
		
		//로그인 패널
		loginPanel = new JPanel();
		
		//id, id입력 패널
		idPanel = new JPanel();
		
		//pw, pw입력 패널
		pwPanel = new JPanel();
		
		//id 입력 텍스트 칸
		id = new JLabel("ID");
		inputId = new JTextField(10);
		
		//pw 입력 텍스트 칸
		pw = new JLabel("PW");
		inputPw = new JPasswordField(10);
		
		
		
		//id패널에 id라벨, id입력창 추가
		idPanel.add(id);
		idPanel.add(inputId);
		
		//pw패널에 pw라벨, pw입력창 추가
		pwPanel.add(pw);
		pwPanel.add(inputPw);
		
  
		//로그인패널에 id패널, pw패널 추가		
		add(idPanel);
		
		add(pwPanel);
		
		//로그인 버튼
		login = new JButton("Sign in");
		//회원가입 버튼
		register = new JButton("Register");
		
		loginPanel.add(login);
		loginPanel.add(register);
		
		
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
		
		
		
		add(loginPanel);
		*/
		
		
		setTitle("계획 확인 프로그램");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
