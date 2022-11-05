import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.util.Date;
import java.util.Iterator;  

public class TestPanels extends JFrame {
	MyLinkedList<Book> bookLinkedList = new MyLinkedList<Book> ();
	public JTextField ISBN = new JTextField(8);
	public JTextField Title = new JTextField(8);
	public JButton add = new JButton("Add");
	public JButton edit = new JButton("Edit");
	public JButton save = new JButton("Save");
	public JButton delete = new JButton("Delete");
	public JButton search = new JButton("Search");
	public JButton more = new JButton("More>>");
	public JButton load_test_data = new JButton("Load Test Data");
	public JButton display_all = new JButton("Display All");
	public JButton display_all_by_isbn = new JButton("Display All by ISBN");
	public JButton display_all_by_title = new JButton("Display All by Title");
	public JButton exit = new JButton("Exit");
	public String[][] rows = {};
	public String columns [] = {"ISBN","Title","Available"};
	public int size = bookLinkedList.size();
	public JTable table = new JTable() {
         public boolean editCellAt(int row, int column, java.util.EventObject e) {
            return false;
         }
      };
	public DefaultTableModel model = (DefaultTableModel)table.getModel();
	
	public TestPanels() {
		
		Date date = new Date(System.currentTimeMillis());
		
		//(INTRO)
		JTextArea text = new JTextArea("Student Name and ID: Cheng Tsz Him 20038277D \n" + "Student Name and ID: LYU Hao 20042543D \n" + date,5,1);
		add(text, BorderLayout.NORTH);
		
		//(TABLE)
		model.setColumnIdentifiers(columns);
		JScrollPane tableSP = new JScrollPane(table);
		add(tableSP, BorderLayout.CENTER);
		
		//(BUTTON)
		JPanel buttons = new JPanel(new GridLayout(3,1,1,1));
		JPanel layer1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		layer1.add(new JLabel("ISBN"));
		layer1.add(ISBN);
		layer1.add(new JLabel("Title"));
		layer1.add(Title);
		JPanel layer2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		layer2.add(add);
		layer2.add(edit);
		layer2.add(save);
		save.setEnabled(false);
		layer2.add(delete);
		layer2.add(search);
		layer2.add(more);
		JPanel layer3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		layer3.add(load_test_data);
		layer3.add(display_all);
		layer3.add(display_all_by_isbn);
		layer3.add(display_all_by_title);
		layer3.add(exit);
		buttons.add(layer1);
		buttons.add(layer2);
		buttons.add(layer3);
		add(buttons, BorderLayout.SOUTH);
		
		add.addActionListener (
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					add_book();
				}
			}
		);
		
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int i = table.getSelectedRow();
				ISBN.setText((String)model.getValueAt(i, 0));
				Title.setText((String)model.getValueAt(i, 1));
			}
		});
	}
	
	public void add_book() {
		String new_isbn = ISBN.getText();
		String new_title = Title.getText();
		Boolean exist = false;
		
		Iterator<Book> it = bookLinkedList.iterator();
        Book bk;
        while (it.hasNext()) {
        	bk=it.next();
        	if (bk.getISBN().equals(new_isbn))  {
        		exist = true;
        	}
        }
		
        if ( !(new_isbn.isEmpty()) && !(new_title.isEmpty()) && !(exist) ) {
			Book new_bk = new Book();
			new_bk.setISBN(ISBN.getText());
			new_bk.setTitle(Title.getText());
			new_bk.setAvailable(true);
			bookLinkedList.add(new_bk);
			size = bookLinkedList.size();
			model.addRow(new Object[]{ISBN.getText(), Title.getText(), "true"});
		} else {
			if (new_isbn.isEmpty() || new_title.isEmpty()) {
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame, "Please input valid ISBN and Title", "Error: Invalid Input", JOptionPane.ERROR_MESSAGE);
			} else {
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame, "The ISBN is already exist", "Error: ISBN already exist", JOptionPane.ERROR_MESSAGE);
			}
		}
		ISBN.setText("");
		Title.setText("");
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
