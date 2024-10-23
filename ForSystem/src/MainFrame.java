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

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField SystemName;

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
		setBounds(100, 100, 700, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		SystemName = new JTextField();
		SystemName.setFont(new Font("Tahoma", Font.PLAIN, 40));
		SystemName.setText("BOOK BORROWING SYSTEM");
		SystemName.setBounds(62, 104, 540, 54);
		contentPane.add(SystemName);
		SystemName.setColumns(10);
		
		JButton borrowButton = new JButton("Borrow Book");
		borrowButton.setBounds(119, 232, 141, 23);
		borrowButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		borrowButton.setBackground(new Color(255, 250, 205));
		borrowButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        BorrowBook frame2 = new BorrowBook();  // Assuming this is the new frame for borrowing books
		        frame2.setVisible(true);
		        dispose();  // Close current frame
		    }
		});
		contentPane.add(borrowButton);
		
		JButton returnButton = new JButton("Return Book");
		returnButton.setBounds(394, 232, 141, 23);
		returnButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		returnButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        ReturnBook frame2 = new ReturnBook();  // Assuming this is the new frame for borrowing books
		        frame2.setVisible(true);
		        dispose();  // Close current frame
		    }
		});
		contentPane.add(returnButton);
		
		JButton registerButton = new JButton("Register");
		registerButton.setBounds(291, 335, 89, 23);
		contentPane.add(registerButton);
		
	}
}
