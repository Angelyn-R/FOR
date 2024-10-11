import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BookIsbnReturn = new JTextField();
		BookIsbnReturn.setBounds(49, 108, 330, 20);
		contentPane.add(BookIsbnReturn);
		BookIsbnReturn.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Scan Bar Code for ISBN");
		lblNewLabel.setBounds(46, 75, 240, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnConfirmReturn = new JButton("RETURN");
		btnConfirmReturn.setBounds(174, 227, 89, 23);
		contentPane.add(btnConfirmReturn);
	}

}
