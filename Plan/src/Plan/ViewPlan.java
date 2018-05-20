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
		
		//FlowLayout 사용 => 왼쪽에서 오른쪽으로 정렬
		setLayout(new FlowLayout());
		
		//로그인 패널
		loginPanel = new JPanel();
		
		//id, id입력 패널
		idPanel = new JPanel();
		
		//pw, pw입력 패널
		pwPanel = new JPanel();
		
		//id 입력 텍스트 칸
		inputId = new JTextField();
		id = new JLabel("ID");
		
		//pw 입력 텍스트 칸
		inputPw = new JPasswordField();
		pw = new JLabel("PW");
		
		
		
		//id패널에 id라벨, id입력창 추가
		idPanel.add(id);
		idPanel.add(inputId);
		
		//pw패널에 pw라벨, pw입력창 추가
		pwPanel.add(pw);
		pwPanel.add(inputPw);
		
		//로그인패널에 id패널, pw패널 추가  
		loginPanel.add(idPanel);
		loginPanel.add(pwPanel);
		
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
		
		
		
		
		jframe.add(loginPanel);
		
		jframe.setTitle("계획 확인 프로그램");
		jframe.setSize(500, 500);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
