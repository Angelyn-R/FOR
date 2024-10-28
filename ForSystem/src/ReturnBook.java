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

public class ReturnBook extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField BookIsbnReturn;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReturnBook frame = new ReturnBook();
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
	public ReturnBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BookIsbnReturn = new JTextField();
		BookIsbnReturn.setBounds(115, 251, 359, 54);
		contentPane.add(BookIsbnReturn);
		BookIsbnReturn.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Scan Bar Code for ISBN");
		lblNewLabel.setBounds(115, 217, 275, 23);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		JButton btnConfirmReturn = new JButton("RETURN");
		btnConfirmReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfirmReturn.setBounds(365, 363, 141, 43);
		btnConfirmReturn.setBackground(new Color(192, 192, 192));
		contentPane.add(btnConfirmReturn);
		
		JButton confirmReturn = new JButton("Confirm");
		confirmReturn.setBounds(488, 257, 141, 43);
		confirmReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		confirmReturn.setBackground(new Color(255, 255, 255));
		contentPane.add(confirmReturn);
		
		JButton returnBackButton = new JButton("Back");
		returnBackButton.setBounds(10, 428, 89, 23);
		returnBackButton.setBackground(new Color(255, 255, 255));
		returnBackButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        MainFrame frame2 = new MainFrame();  
		        frame2.setVisible(true);
		        dispose();  
		    }
		});
		contentPane.add(returnBackButton);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Student ID Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(115, 124, 243, 34);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(115, 163, 359, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("RETURN");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(372, 49, 134, 23);
		contentPane.add(lblNewLabel_2);
	}

}
