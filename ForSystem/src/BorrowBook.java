import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class BorrowBook extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField BookIsbnBorrow;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorrowBook frame = new BorrowBook();
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
	public BorrowBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 812, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BookIsbnBorrow = new JTextField();
		BookIsbnBorrow.setBounds(123, 253, 359, 54);
		contentPane.add(BookIsbnBorrow);
		BookIsbnBorrow.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Scan Bar Code for ISBN");
		lblNewLabel.setBounds(123, 219, 275, 23);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		JButton btnConfirmBorrow = new JButton("BORROW");
		btnConfirmBorrow.setBounds(370, 370, 141, 43);
		btnConfirmBorrow.setBackground(new Color(192, 192, 192));
		contentPane.add(btnConfirmBorrow);
		
		JButton confirmBorrow = new JButton("Confirm");
		confirmBorrow.setBackground(new Color(255, 255, 255));
		confirmBorrow.setBounds(499, 259, 141, 43);
		contentPane.add(confirmBorrow);
		
		JButton borrowBackButton = new JButton("Back");
		borrowBackButton.setBackground(new Color(255, 255, 255));
		borrowBackButton.setBounds(10, 431, 89, 23);
		borrowBackButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        MainFrame frame2 = new MainFrame();  
		        frame2.setVisible(true);
		        dispose();  
		    }
		});
		contentPane.add(borrowBackButton);
		
		textField = new JTextField();
		textField.setBounds(123, 165, 359, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Student ID Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(123, 131, 264, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BORROW");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(383, 45, 154, 23);
		contentPane.add(lblNewLabel_2);
	}

}
