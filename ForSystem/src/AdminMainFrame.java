import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class AdminMainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMainFrame frame = new AdminMainFrame();
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
	public AdminMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddBooks = new JButton("Add Books");
		btnAddBooks.setBounds(116, 295, 141, 43);
		btnAddBooks.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        AddBooksFrame frame2 = new  AddBooksFrame();  
		        frame2.setVisible(true);
		        dispose();  
		    }
		});
		contentPane.add(btnAddBooks);
		
		JButton btnViewHistory = new JButton("Records");
		btnViewHistory.setBounds(529, 295, 141, 43);
		contentPane.add(btnViewHistory);
		
		JButton backButton = new JButton("Back");
		backButton.setBounds(10, 425, 89, 23);
		backButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        MainFrame frame2 = new MainFrame();  
		        frame2.setVisible(true);
		        dispose();  
		    }
		});
		contentPane.add(backButton);
	}

}
