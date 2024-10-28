import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Record extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Record frame = new Record();
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
	public Record() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FILTER BY LAST NAME ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(47, 105, 152, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("GENERATE REPORT");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(384, 102, 127, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(187, 103, 187, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Total Visitor");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(608, 105, 91, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("RECORDS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(356, 44, 172, 23);
		contentPane.add(lblNewLabel_2);
		
		JButton recordBackButton = new JButton("Back");
		recordBackButton.setBackground(new Color(255, 255, 255));
		recordBackButton.setBounds(10, 437, 89, 23);
		recordBackButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        AdminMainFrame frame2 = new AdminMainFrame();  
		        frame2.setVisible(true);
		        dispose();  
		    }
		});
		contentPane.add(recordBackButton);
	}

}
