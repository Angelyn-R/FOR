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

public class ReturnBook extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField BookIsbnReturn;

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
		BookIsbnReturn.setBounds(120, 119, 359, 54);
		contentPane.add(BookIsbnReturn);
		BookIsbnReturn.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Scan Bar Code for ISBN");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(297, 52, 275, 23);
		contentPane.add(lblNewLabel);
		
		JButton btnConfirmReturn = new JButton("RETURN");
		btnConfirmReturn.setBounds(370, 384, 141, 43);
		contentPane.add(btnConfirmReturn);
		
		JButton confirmReturn = new JButton("Confirm");
		confirmReturn.setBounds(530, 135, 89, 23);
		confirmReturn.setBounds(517, 125, 141, 43);
		contentPane.add(confirmReturn);
		
		JButton returnBackButton = new JButton("Back");
		returnBackButton.setBounds(10, 428, 89, 23);
		returnBackButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        MainFrame frame2 = new MainFrame();  
		        frame2.setVisible(true);
		        dispose();  
		    }
		});
		contentPane.add(returnBackButton);
	}

}
