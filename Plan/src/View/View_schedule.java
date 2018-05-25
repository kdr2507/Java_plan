package View;


import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.BoxLayout;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;

public class View_schedule extends JFrame {
	private JTable delay_table;
	private JTable now_table;
	private JTable next_table;
	private JTable check_delay_table;
	private JTable check_now_table;
	private JTable check_next_table;

	
	public View_schedule() {
		setSize(707, 381);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JList delay = new JList();
		delay.setLayoutOrientation(JList.VERTICAL_WRAP);
		delay.setBounds(12, 132, 200, 200);
		getContentPane().add(delay);
		
		delay_table = new JTable();
		delay_table.setBounds(0, 0, 1, 1);
		getContentPane().add(delay_table);
		
		JList now = new JList();
		now.setBounds(245, 132, 200, 200);
		getContentPane().add(now);
		
		now_table = new JTable();
		now_table.setBounds(0, 0, 1, 1);
		getContentPane().add(now_table);
		
		JList next = new JList();
		next.setBounds(479, 132, 200, 200);
		getContentPane().add(next);
		
		next_table = new JTable();
		next_table.setBounds(0, 0, 1, 1);
		getContentPane().add(next_table);
		
		JList check_delay = new JList();
		check_delay.setBounds(12, 60, 200, 72);
		getContentPane().add(check_delay);
		
		check_delay_table = new JTable();
		check_delay_table.setBounds(0, 0, 1, 1);
		getContentPane().add(check_delay_table);
		
		JList check_now = new JList();
		check_now.setBounds(245, 60, 200, 72);
		getContentPane().add(check_now);
		
		check_now_table = new JTable();
		check_now_table.setBounds(0, 0, 1, 1);
		getContentPane().add(check_now_table);
		
		JList check_next = new JList();
		check_next.setBounds(479, 60, 200, 72);
		getContentPane().add(check_next);
		
		check_next_table = new JTable();
		check_next_table.setBounds(0, 0, 1, 1);
		getContentPane().add(check_next_table);
		setVisible(true);
	}
}
