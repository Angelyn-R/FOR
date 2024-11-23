import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class Register extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setBounds(152, 189, 85, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setBounds(152, 290, 73, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setBounds(935, 290, 85, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Middle Name");
		lblNewLabel_3.setBounds(537, 290, 86, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Grade ");
		lblNewLabel_4.setBounds(537, 189, 84, 14);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Contact Number");
		lblNewLabel_5.setBounds(152, 377, 123, 14);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setBounds(537, 377, 46, 14);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(152, 214, 284, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(152, 315, 284, 43);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(537, 315, 284, 43);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(537, 214, 284, 43);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(935, 315, 284, 43);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(935, 214, 284, 43);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Section");
		lblNewLabel_7.setBounds(935, 189, 61, 14);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(152, 401, 284, 43);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(537, 401, 284, 43);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(624, 543, 141, 59);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("REGISTER AS A NEW BORROWER");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 70));
		lblNewLabel_8.setBounds(152, 37, 1088, 77);
		contentPane.add(lblNewLabel_8);
		
		JButton registerBackButton = new JButton("Back");
		registerBackButton.setBackground(new Color(255, 255, 255));
		registerBackButton.setBounds(10, 668, 92, 43);
		registerBackButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        MainFrame frame2 = new MainFrame();  
		        frame2.setVisible(true);
		        dispose();  
		    }
		});
		contentPane.add(registerBackButton);
	}
}
