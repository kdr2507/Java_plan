package View;

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

public class ViewPlan extends JFrame{
	
	JPanel loginPanel, registerPanel;
	JButton login, register_button, cancel_button_register, button_register, id_check_button_register;
	JLabel id, pw, ID_register, PW_register, PW_check_register, pw_equal_check_register, result_label_register;
	JTextField inputId, input_id_register;
	JPasswordField inputPw, input_pw_register, input_pw_check_register;
	
	//ȸ�����Խ� ID, PW üũ
	boolean id_check, pw_check;
	
	public ViewPlan() {
		super();
		this.id_check = false;
		this.pw_check = false;
	}
	
	public void main_plan(){
		 login();
		
	}
	
	public void login(){
		
		//�α��� �г� ����
		loginPanel = new JPanel();
		
		setContentPane(loginPanel);
		loginPanel.setLayout(null);
		
		
		//ID �Է� �κ�
		id = new JLabel("ID");
		id.setBounds(102, 73, 70, 15);
		loginPanel.add(id);
		
		
		inputId = new JTextField();
		inputId.setBounds(184, 73, 116, 21);
		loginPanel.add(inputId);
		inputId.setColumns(10);
		
		
		//PW �Է� �κ�
		pw = new JLabel("PW");
		pw.setBounds(102, 98, 70, 15);
		loginPanel.add(pw);
		
		inputPw = new JPasswordField();
		inputPw.setBounds(184, 98, 116, 21);
		loginPanel.add(inputPw);
		inputPw.setColumns(10);
		
		
		//�α��� ��ư
		login = new JButton("login");
		login.setBounds(102, 154, 97, 23);
		loginPanel.add(login);
		
		
		//ȸ������ ��ư
		register_button = new JButton("register");
		register_button.setBounds(203, 154, 97, 23);
		loginPanel.add(register_button);
		
		//�α��� ��ư�� ���� ��� ����
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sendId = inputId.getText();
				String sendPw = inputPw.getText();
				
				
				ControllerPlan CP = new ControllerPlan();
				CP.login_controller(sendId, sendPw);

			}
		});
		
		//ȸ������ ��ư�� ���� ��� ���� ȸ������ ������ �̵�
		register_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginPanel.removeAll();
				
				register();
				
				
				
			}
		});
		
		
		setTitle("�α���");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	//ȸ������ ������
	public void register() {
		
		
		//�α��� �г� ����
		registerPanel = new JPanel();
		
		setContentPane(registerPanel);
		registerPanel.setLayout(null);
		
		//ID �Է� ��
		ID_register = new JLabel("ID");
		ID_register.setBounds(102, 73, 70, 15);
		registerPanel.add(ID_register);
		
		//PW �Է� ��		
		PW_register = new JLabel("PW");
		PW_register.setBounds(102, 98, 70, 15);
		registerPanel.add(PW_register);
		
		//PW�� �Է� ��
		PW_check_register = new JLabel("PW Check");
		PW_check_register.setBounds(102, 123, 70, 15);
		registerPanel.add(PW_check_register);
		

		//ID �Է�â
		input_id_register = new JTextField();
		input_id_register.setBounds(184, 73, 116, 21);
		registerPanel.add(input_id_register);
		input_id_register.setColumns(10);
		
		input_id_register.addKeyListener(new KeyListener() {
			
			// ����Ű�����¼��� �����ڵ�Ű�� �ԷµȰ�쿡�� ����
			public void keyTyped(KeyEvent e) {
				
			}
			
			// Ű�� ���� ���� ����
			public void keyReleased(KeyEvent e) {
				id_check = false;
			}
			
			// Ű�� ������ ���� ����
			public void keyPressed(KeyEvent e) {
				
				
			}
		});
		
		
		//ID�� �����ϴ��� Ȯ�� �ϴ� ��ư
		id_check_button_register = new JButton("ID Check");
		id_check_button_register.setBounds(301, 72, 97, 23);
		registerPanel.add(id_check_button_register);
		
		//ID�� �����ϴ��� Ȯ�� �̺�Ʈ
		id_check_button_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(input_id_register.getText().length() != 0) {
					ControllerPlan CP = new ControllerPlan();
					
					if(CP.id_check(input_id_register.getText())) {
						id_check = true;
						result_label_register.setText("��� ������ ID �Դϴ�.");
					}else {
						id_check = false;
						result_label_register.setText("�Ұ����� ID �Դϴ�.");
					}
				}else {
					result_label_register.setText("ID�� �Է��� �ּ���");
				}
				
			}
		});
		
		
		//PW �Է�â
		input_pw_register = new JPasswordField();
		input_pw_register.setBounds(184, 98, 116, 21);
		registerPanel.add(input_pw_register);
		
		//PW�� �Է�â		
		input_pw_check_register = new JPasswordField();
		input_pw_check_register.setBounds(184, 123, 116, 21);
		registerPanel.add(input_pw_check_register);
		
		//PWȮ�ν� PW�Է� 2���� ��� ���������� Ȯ��
		input_pw_check_register.addKeyListener(new KeyListener() {
			
			// ����Ű�����¼��� �����ڵ�Ű�� �ԷµȰ�쿡�� ����
			public void keyTyped(KeyEvent e) {
				
			}
			
			// Ű�� ���� ���� ����
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
			
			// Ű�� ������ ���� ����
			public void keyPressed(KeyEvent e) {
				
				
			}
		});
				

		//��� ��ư
		cancel_button_register = new JButton("cancel");
		cancel_button_register.setBounds(102, 154, 97, 23);
		registerPanel.add(cancel_button_register);
		
		//��� ��ư�� ������ �α���â���� ���ư���
		cancel_button_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerPanel.removeAll();
				
				login();
			}
		});
		
		//ȸ������ ��ư
		button_register = new JButton("register");
		button_register.setBounds(203, 154, 97, 23);
		registerPanel.add(button_register);
		
		//ȸ������ �̺�Ʈ
		button_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ControllerPlan CP = new ControllerPlan();
				
				if(id_check) {
					if(pw_check) {
						if(CP.register(input_id_register.getText(), input_pw_register.getText(), input_pw_check_register.getText())) {
							result_label_register.setText("ȸ�������� �Ϸ�Ǿ����ϴ�.");
						}else {
							result_label_register.setText("ȸ�������� �Ϸ���� �ʾҽ��ϴ�.");
						}
					}else {
						result_label_register.setText("PW�� �ٽ� Ȯ���� �ּ���");
					}
				}else {
					result_label_register.setText("ID�� �ٽ� Ȯ���� �ּ���");
				}

				
			}
		});
		
		
		
		//PW�� �����ϸ� O Ʋ���� X
		pw_equal_check_register = new JLabel("");
		pw_equal_check_register.setBounds(305, 126, 57, 15);
		registerPanel.add(pw_equal_check_register);
		pw_equal_check_register.setSize(300, 20);
		
		
		//ȸ�����Կ� ���� ������ ��
		result_label_register = new JLabel("");
		result_label_register.setBounds(102, 180, 57, 15);
		registerPanel.add(result_label_register);
		
		result_label_register.setSize(300, 20);
		
		setTitle("ȸ������");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}