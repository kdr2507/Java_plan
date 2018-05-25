package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JPasswordField;

public class PlanView extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlanView frame = new PlanView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PlanView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(102, 73, 70, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PW");
		lblNewLabel_1.setBounds(102, 98, 70, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PW Check");
		lblNewLabel_2.setBounds(102, 123, 70, 15);
		getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(184, 73, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("cancel");
		btnNewButton.setBounds(102, 154, 97, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("register");
		btnNewButton_1.setBounds(203, 154, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnIdCheck = new JButton("ID Check");
		btnIdCheck.setBounds(301, 72, 97, 23);
		getContentPane().add(btnIdCheck);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(305, 126, 57, 15);
		getContentPane().add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(184, 98, 116, 21);
		getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(184, 123, 116, 21);
		getContentPane().add(passwordField_1);
	}
}
