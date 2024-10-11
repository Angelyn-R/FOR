import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class BorrowBook extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField BookIsbnBorrow;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BookIsbnBorrow = new JTextField();
		BookIsbnBorrow.setBounds(44, 112, 329, 20);
		contentPane.add(BookIsbnBorrow);
		BookIsbnBorrow.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Scan Bar Code for ISBN");
		lblNewLabel.setBounds(45, 87, 159, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnConfirmBorrow = new JButton("BORROW");
		btnConfirmBorrow.setBounds(169, 227, 89, 23);
		contentPane.add(btnConfirmBorrow);
	}

}
