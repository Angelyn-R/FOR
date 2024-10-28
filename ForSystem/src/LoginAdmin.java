import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class LoginAdmin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAdmin frame = new LoginAdmin();
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
	public LoginAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 252);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(41, 47, 81, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(41, 102, 70, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnLogIn = new JButton("LOG IN");
		btnLogIn.setBackground(new Color(255, 255, 255));
		btnLogIn.setBounds(289, 158, 93, 35);
		btnLogIn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        AdminMainFrame frame2 = new AdminMainFrame();  
		        frame2.setVisible(true);
		        dispose();  
		    }
		});
		contentPane.add(btnLogIn);
		
		textField = new JTextField();
		textField.setBounds(135, 37, 247, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(135, 93, 247, 35);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBackground(new Color(255, 255, 255));
		cancelButton.setBounds(135, 158, 93, 35);
		cancelButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        MainFrame frame2 = new MainFrame();  
		        frame2.setVisible(true);
		        dispose();  
		    }
		});
		contentPane.add(cancelButton);
	}

}
