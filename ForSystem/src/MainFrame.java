import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLayeredPane;
import javax.swing.JSplitPane;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 799, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton borrowButton = new JButton("Borrow Book");
		borrowButton.setBounds(102, 262, 141, 43);
		borrowButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		borrowButton.setBackground(new Color(255, 255, 255));
		borrowButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        BorrowBook frame2 = new BorrowBook();  
		        frame2.setVisible(true);
		        dispose();  
		    }
		});
		contentPane.setLayout(null);
		contentPane.add(borrowButton);
		
		JButton returnButton = new JButton("Return Book");
		returnButton.setBounds(530, 262, 141, 43);
		returnButton.setBackground(new Color(255, 255, 255));
		returnButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		returnButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        ReturnBook frame2 = new ReturnBook();  
		        frame2.setVisible(true);
		        dispose();  
		    }
		});
		contentPane.add(returnButton);
		
		JButton registerButton = new JButton("Register");
		registerButton.setBounds(337, 385, 113, 35);
		registerButton.setBackground(new Color(192, 192, 192));
		registerButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		registerButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        ReturnBook frame2 = new ReturnBook();  
		        frame2.setVisible(true);
		        dispose();  
		    }
		});
		
		contentPane.add(registerButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(102, 55, 569, 143);
		panel_1.setBackground(new Color(128, 128, 128));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOK BORROWING SYSTEM");
		lblNewLabel.setBounds(26, 44, 508, 49);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		JLabel lblNewLabel_1 = new JLabel("Are you a new borrower? Register now!");
		lblNewLabel_1.setBounds(270, 350, 247, 24);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1);
		
		JButton adminButton = new JButton("Admin");
		adminButton.setBackground(new Color(255, 255, 255));
		adminButton.setBounds(677, 11, 96, 35);
		adminButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        LoginAdmin frame2 = new LoginAdmin();  
		        frame2.setVisible(true);
		        //dispose();  
		    }
		});
		contentPane.add(adminButton);
		
		
	}
}
