import java.awt.*;
import javax.swing.*;
import java.util.Date;  

public class TestPanels extends JFrame {

	public TestPanels() {
		
		Date date = new Date(System.currentTimeMillis());
		
		//P1(INTRO)
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 1,1));
		p1.add(new JTextArea("Student Name and ID: Cheng Tsz Him 20038277D \n" + "Student Name and ID: LYU Hao 20042543D \n" + date,5,20));

		
		//P2(TABLE)
		String[][] rows = {};
		String columns [] = {"ID","NAME","SALARY"};
		JTable table = new JTable(rows, columns);
		JPanel p2 = new JPanel();
		p2.add(new JScrollPane(table));
		
		//P3(BUTTON)
		JPanel p3 = new JPanel(new GridLayout(3,1,3,3));
		p3.add(new JLabel("ISBN"));
		p3.add(new JTextField(10));
		p3.add(new JLabel("Title"));
		p3.add(new JTextField(20));
		p3.add(new JButton("Add"));
		p3.add(new JButton("Edit"));
		p3.add(new JButton("Save"));
		p3.add(new JButton("Delete"));
		p3.add(new JButton("Search"));
		p3.add(new JButton("More>>"));
		p3.add(new JButton("Load Test Data"));
		p3.add(new JButton("Display All"));
		p3.add(new JButton("Display All by ISBN"));
		p3.add(new JButton("Display All by Title"));
		p3.add(new JButton("Exit"));
//		JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 20));
//		p4.add(p3);
		
		
//		P0(TOTAL TABLE)
		JPanel p0 = new JPanel(new BorderLayout(5,10));
		p0.add(p1, BorderLayout.NORTH);
		p0.add(p2, BorderLayout.CENTER);
		p0.add(p3, BorderLayout.SOUTH);
		setLayout(new BorderLayout());
		add(p0, BorderLayout.CENTER);
//		JPanel p0 = new JPanel(new GridLayout(3,1,3,3));
//		p0.add(p1);
//		p0.add(p2);
//		p0.add(p3);
//		setLayout(new GridLayout());
//		add(p0);
	}
	
	
	
	
		
	
	public static void main(String[] args) {
		TestPanels frame = new TestPanels();
		frame.setTitle("Library Admin System");
		frame.setSize(900,600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
		
	}
	
	
}
