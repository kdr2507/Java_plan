package View;

import View.View_schedule;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Controller.ControllerPlan;

public class View_login_register extends JFrame{
	
	JPanel loginPanel, registerPanel;
	JButton login, register_button, cancel_button_register, button_register, id_check_button_register;
	JLabel id, pw, ID_register, PW_register, PW_check_register, pw_equal_check_register, result_label_register, result;
	JTextField inputId, input_id_register;
	JPasswordField inputPw, input_pw_register, input_pw_check_register;
	
	//회원가입시 ID, PW 체크
	boolean id_check, pw_check;
	
	public View_login_register() {
		super();
		this.id_check = false;
		this.pw_check = false;
	}
	
	
	public void login(){
		
		//로그인 패널 생성
		loginPanel = new JPanel();
		
		setContentPane(loginPanel);
		loginPanel.setLayout(null);
		
		
		//ID 입력 부분
		id = new JLabel("ID");
		id.setBounds(102, 73, 70, 15);
		loginPanel.add(id);
		
		
		inputId = new JTextField();
		inputId.setBounds(184, 73, 116, 21);
		loginPanel.add(inputId);
		inputId.setColumns(10);
		
		
		//PW 입력 부분
		pw = new JLabel("PW");
		pw.setBounds(102, 98, 70, 15);
		loginPanel.add(pw);
		
		inputPw = new JPasswordField();
		inputPw.setBounds(184, 98, 116, 21);
		loginPanel.add(inputPw);
		inputPw.setColumns(10);
		
		
		//로그인 버튼
		login = new JButton("login");
		login.setBounds(102, 154, 97, 23);
		loginPanel.add(login);
		
		
		//회원가입 버튼
		register_button = new JButton("register");
		register_button.setBounds(203, 154, 97, 23);
		loginPanel.add(register_button);
		
		//로그인 버튼을 누를 경우 동작
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sendId = inputId.getText();
				String sendPw = inputPw.getText();
				
				
				ControllerPlan CP = new ControllerPlan();
				if(CP.login_controller(sendId, sendPw)) {
					dispose();
					
					View_schedule VS = new View_schedule();
					VS.schedule_main();
					
				}else {
					result.setText("ID/PW가 맞지 않습니다.");
				};

			}
		});
		
		//회원가입 버튼을 누를 경우 동작 회원가입 페이지 이동
		register_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginPanel.removeAll();
				
				register();

			}
		});
		
		//로그인 결과 출력
		result = new JLabel("");
		result.setBounds(102, 200, 200, 15);
		loginPanel.add(result);
		
		setTitle("로그인");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	//회원가입 페이지
	public void register() {
		
		
		//로그인 패널 생성
		registerPanel = new JPanel();
		
		setContentPane(registerPanel);
		registerPanel.setLayout(null);
		
		//ID 입력 라벨
		ID_register = new JLabel("ID");
		ID_register.setBounds(102, 73, 70, 15);
		registerPanel.add(ID_register);
		
		//PW 입력 라벨		
		PW_register = new JLabel("PW");
		PW_register.setBounds(102, 98, 70, 15);
		registerPanel.add(PW_register);
		
		//PW재 입력 라벨
		PW_check_register = new JLabel("PW Check");
		PW_check_register.setBounds(102, 123, 70, 15);
		registerPanel.add(PW_check_register);
		

		//ID 입력창
		input_id_register = new JTextField();
		input_id_register.setBounds(184, 73, 116, 21);
		registerPanel.add(input_id_register);
		input_id_register.setColumns(10);
		
		input_id_register.addKeyListener(new KeyListener() {
			
			// 누른키를떼는순간 유니코드키가 입력된경우에만 실행
			public void keyTyped(KeyEvent e) {
				
			}
			
			// 키를 때는 순간 실행
			public void keyReleased(KeyEvent e) {
				id_check = false;
			}
			
			// 키를 누르는 순간 실행
			public void keyPressed(KeyEvent e) {
				
				
			}
		});
		
		
		//ID가 존재하는지 확인 하는 버튼
		id_check_button_register = new JButton("ID Check");
		id_check_button_register.setBounds(301, 72, 97, 23);
		registerPanel.add(id_check_button_register);
		
		//ID가 존재하는지 확인 이벤트
		id_check_button_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(input_id_register.getText().length() != 0) {
					ControllerPlan CP = new ControllerPlan();
					
					if(CP.id_check(input_id_register.getText())) {
						id_check = true;
						result_label_register.setText("사용 가능한 ID 입니다.");
					}else {
						id_check = false;
						result_label_register.setText("불가능한 ID 입니다.");
					}
				}else {
					result_label_register.setText("ID를 입력해 주세요");
				}
				
			}
		});
		
		
		//PW 입력창
		input_pw_register = new JPasswordField();
		input_pw_register.setBounds(184, 98, 116, 21);
		registerPanel.add(input_pw_register);
		
		//PW재 입력창		
		input_pw_check_register = new JPasswordField();
		input_pw_check_register.setBounds(184, 123, 116, 21);
		registerPanel.add(input_pw_check_register);
		
		//PW확인시 PW입력 2개가 모두 동일한지를 확인
		input_pw_check_register.addKeyListener(new KeyListener() {
			
			// 누른키를떼는순간 유니코드키가 입력된경우에만 실행
			public void keyTyped(KeyEvent e) {
				
			}
			
			// 키를 때는 순간 실행
			public void keyReleased(KeyEvent e) {
				ControllerPlan CP = new ControllerPlan();
				if(CP.text_equal_check(input_pw_register.getText(), input_pw_check_register.getText())) {
					pw_check = true;
					pw_equal_check_register.setText("O");
				}else{
					pw_check = false;
					pw_equal_check_register.setText("X");
				};
				
				
			}
			
			// 키를 누르는 순간 실행
			public void keyPressed(KeyEvent e) {
				
				
			}
		});
				

		//취소 버튼
		cancel_button_register = new JButton("cancel");
		cancel_button_register.setBounds(102, 154, 97, 23);
		registerPanel.add(cancel_button_register);
		
		//취소 버튼을 누를시 로그인창으로 돌아가기
		cancel_button_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerPanel.removeAll();
				
				login();
			}
		});
		
		//회원가입 버튼
		button_register = new JButton("register");
		button_register.setBounds(203, 154, 97, 23);
		registerPanel.add(button_register);
		
		//회원가입 이벤트
		button_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ControllerPlan CP = new ControllerPlan();
				
				if(id_check) {
					if(pw_check) {
						if(CP.register(input_id_register.getText(), input_pw_register.getText(), input_pw_check_register.getText())) {
							result_label_register.setText("회원가입이 완료되었습니다.");
						}else {
							result_label_register.setText("회원가입이 완료되지 않았습니다.");
						}
					}else {
						result_label_register.setText("PW를 다시 확인해 주세요");
					}
				}else {
					result_label_register.setText("ID를 다시 확인해 주세요");
				}

				
			}
		});
		
		
		
		//PW가 동일하면 O 틀리면 X
		pw_equal_check_register = new JLabel("");
		pw_equal_check_register.setBounds(305, 126, 57, 15);
		registerPanel.add(pw_equal_check_register);
		pw_equal_check_register.setSize(300, 20);
		
		
		//회원가입에 대한 결과출력 라벨
		result_label_register = new JLabel("");
		result_label_register.setBounds(102, 180, 57, 15);
		registerPanel.add(result_label_register);
		
		result_label_register.setSize(300, 20);
		
		setTitle("회원가입");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
