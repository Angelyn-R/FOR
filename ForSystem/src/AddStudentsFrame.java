import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;

public class AddStudentsFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField LastName;
	private JTextField FirstName;
	private JTextField Middle_Initials;
	private JTextField StudentNumber;
	private JTextField Contact;
	private JTextField qrCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudentsFrame frame = new AddStudentsFrame();
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
	public AddStudentsFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		LastName = new JTextField();
		LastName.setBounds(31, 61, 117, 20);
		contentPane.add(LastName);
		LastName.setColumns(10);
		
		FirstName = new JTextField();
		FirstName.setBounds(195, 61, 117, 20);
		contentPane.add(FirstName);
		FirstName.setColumns(10);
		
		Middle_Initials = new JTextField();
		Middle_Initials.setBounds(344, 61, 111, 20);
		contentPane.add(Middle_Initials);
		Middle_Initials.setColumns(10);
		
		StudentNumber = new JTextField();
		StudentNumber.setBounds(31, 115, 117, 20);
		contentPane.add(StudentNumber);
		StudentNumber.setColumns(10);
		
		Contact = new JTextField();
		Contact.setBounds(195, 115, 117, 20);
		contentPane.add(Contact);
		Contact.setColumns(10);
		
		qrCode = new JTextField();
		qrCode.setBounds(344, 115, 111, 20);
		contentPane.add(qrCode);
		qrCode.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Last Name");
		lblNewLabel.setBounds(31, 36, 81, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student Number");
		lblNewLabel_1.setBounds(31, 90, 111, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setBounds(196, 36, 81, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Contact");
		lblNewLabel_3.setBounds(195, 90, 66, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Middle Initials");
		lblNewLabel_4.setBounds(344, 36, 94, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("QR code");
		lblNewLabel_5.setBounds(344, 92, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton buttonAddStudent = new JButton("ADD");
		buttonAddStudent.setBounds(105, 161, 89, 23);
		contentPane.add(buttonAddStudent);
		
		JButton buttonDeleteStudent = new JButton("DELETE ");
		buttonDeleteStudent.setBounds(223, 161, 89, 23);
		contentPane.add(buttonDeleteStudent);
		
		JButton buttonUpdateStudent = new JButton("UPDATE");
		buttonUpdateStudent.setBounds(349, 161, 89, 23);
		contentPane.add(buttonUpdateStudent);
	}
}
