import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Register extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Student_LRN;
	private JTextField Last_Name;
	private JTextField Middle_Name;
	private JTextField Grade;
	private JTextField First_Name;
	private JTextField Section;
	private JTextField Contact_Number;
	private JTextField Email;

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
		
		JLabel lblNewLabel = new JLabel("Student LRN");
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
		
		Student_LRN = new JTextField();
		Student_LRN.setBounds(152, 214, 284, 43);
		contentPane.add(Student_LRN);
		Student_LRN.setColumns(10);
		
		Last_Name = new JTextField();
		Last_Name.setBounds(152, 315, 284, 43);
		contentPane.add(Last_Name);
		Last_Name.setColumns(10);
		
		Middle_Name = new JTextField();
		Middle_Name.setBounds(537, 315, 284, 43);
		contentPane.add(Middle_Name);
		Middle_Name.setColumns(10);
		
		Grade = new JTextField();
		Grade.setBounds(537, 214, 284, 43);
		contentPane.add(Grade);
		Grade.setColumns(10);
		
		First_Name = new JTextField();
		First_Name.setBounds(935, 315, 284, 43);
		contentPane.add(First_Name);
		First_Name.setColumns(10);
		
		Section = new JTextField();
		Section.setBounds(935, 214, 284, 43);
		contentPane.add(Section);
		Section.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Section");
		lblNewLabel_7.setBounds(935, 189, 61, 14);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_7);
		
		Contact_Number = new JTextField();
		Contact_Number.setBounds(152, 401, 284, 43);
		contentPane.add(Contact_Number);
		Contact_Number.setColumns(10);
		
		Email = new JTextField();
		Email.setBounds(537, 401, 284, 43);
		contentPane.add(Email);
		Email.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			Connection con = null;
			PreparedStatement pst= null;
			
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "INSERT INTO `student_info`(`Student_ID`, `Last_Name`, `First_Name`, `Middle_Name`, `Grade`, `Section`, `Contact_Number`, `Email`) VALUES (?,?,?,?,?,?,?,?)";
					con = DriverManager.getConnection("jdbc:mysql://localhost/bbs_db", "root", "");
					pst=con.prepareStatement(query);
					pst.setString(1, Student_LRN.getText());
					pst.setString(2, Last_Name.getText());
					pst.setString(3, First_Name.getText());
					pst.setString(4, Middle_Name.getText());
					pst.setString(5, Grade.getText());
					pst.setString(6, Section.getText());
					pst.setString(7, Contact_Number.getText());
					pst.setString(8, Email.getText());
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Registration Successful");
					
					
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
					
				}
				
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(624, 543, 141, 59);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("REGISTER AS A NEW BORROWER");
		lblNewLabel_8.setForeground(new Color(139, 0, 0));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblNewLabel_8.setBounds(211, 53, 1088, 77);
		contentPane.add(lblNewLabel_8);
		
		JButton registerBackButton = new JButton("Back");
		registerBackButton.setBackground(new Color(255, 255, 255));
		registerBackButton.setBounds(24, 636, 92, 43);
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
