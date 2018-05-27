package View;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;

import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import javax.swing.Timer;
import javax.swing.JButton;

public class View_schedule extends JFrame implements Runnable {
	
	JList delay, now, next, check_delay, check_now, check_next;
	JLabel realTime;
	
	public View_schedule() {
		setTitle("스케줄");
		setSize(707, 381);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		Object []test_data = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,
				1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,
				1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,
				1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,
				1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,
				1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10
				};
		
		delay = new JList(test_data);
		delay.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		delay.setBounds(12, 132, 200, 200);
		getContentPane().add(delay);
		
		now = new JList();
		now.setBounds(245, 132, 200, 200);
		getContentPane().add(now);
		
		next = new JList();
		next.setBounds(479, 132, 200, 200);
		getContentPane().add(next);
		
		check_delay = new JList();
		check_delay.setBounds(12, 60, 200, 72);
		getContentPane().add(check_delay);
		
		check_now = new JList();
		check_now.setBounds(245, 60, 200, 72);
		getContentPane().add(check_now);
		
		check_next = new JList();
		check_next.setBounds(479, 60, 200, 72);
		getContentPane().add(check_next);
		setVisible(true);

		realTime = new JLabel("", JLabel.CENTER);
        realTime.setBounds(220, 10, 250, 40);
        getContentPane().add(realTime); 
        
        JButton add_group_button = new JButton("\uC77C\uC815 \uCD94\uAC00");
        add_group_button.setBounds(12, 10, 97, 23);
        getContentPane().add(add_group_button);
        
        JButton logout_button = new JButton("\uB85C\uADF8\uC544\uC6C3");
        logout_button.setBounds(582, 10, 97, 23);
        getContentPane().add(logout_button);
        
        JButton button = new JButton("\uC77C\uC815 \uC0AD\uC81C");
        button.setBounds(115, 10, 97, 23);
        getContentPane().add(button);
	}
	
	public void schedule_main() {
		Thread tr = new Thread(this);
		tr.start();
	}
	
	public void run() {
		//현재 시간 출력
		while(true) { 
			Calendar cal = Calendar.getInstance();
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH);
			int date = cal.get(Calendar.DATE);
			int hour = cal.get(Calendar.HOUR_OF_DAY);
			int min = cal.get(Calendar.MINUTE);
			int sec = cal.get(Calendar.SECOND);
			
			realTime.setText("현재 : " +year+"년 " + month + "월 " + date + "일 " + hour + "시 " + min + "분 " + sec + "초");
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}
