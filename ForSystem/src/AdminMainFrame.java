import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

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
		setBounds(100, 100, 780, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnAddBooks = new JButton("Add Books");
		btnAddBooks.setBackground(new Color(128, 128, 128));
		btnAddBooks.setBounds(166, 295, 141, 43);
		btnAddBooks.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        AddBooksFrame frame2 = new  AddBooksFrame();  
		        frame2.setVisible(true);
		        dispose();  
		    }
		});
		contentPane.setLayout(null);
		contentPane.add(btnAddBooks);
		
		JButton btnViewHistory = new JButton("Records");
		btnViewHistory.setBackground(new Color(128, 128, 128));
		btnViewHistory.setBounds(487, 295, 141, 43);
		btnViewHistory.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		       Record frame2 = new Record();  
		        frame2.setVisible(true);
		        dispose();  
		    }
		});
		contentPane.add(btnViewHistory);
		
		JButton LogOutButton = new JButton("Log out");
		LogOutButton.setBounds(658, 11, 96, 35);
		LogOutButton.setBackground(new Color(192, 192, 192));
		LogOutButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        MainFrame frame2 = new MainFrame();  
		        frame2.setVisible(true);
		        dispose();  
		    }
		});
		contentPane.add(LogOutButton);
	}

}
