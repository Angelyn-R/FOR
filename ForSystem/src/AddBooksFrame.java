import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AddBooksFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField bookIsbn;
	private JTextField bookYear;
	private JTextField bookTitle;
	private JTextField bookAuthor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddBooksFrame frame = new AddBooksFrame();
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
	public AddBooksFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		bookIsbn = new JTextField();
		bookIsbn.setBounds(68, 89, 205, 20);
		contentPane.add(bookIsbn);
		bookIsbn.setColumns(10);
		
		bookYear = new JTextField();
		bookYear.setBounds(358, 89, 160, 20);
		contentPane.add(bookYear);
		bookYear.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ISBN");
		lblNewLabel.setBounds(68, 64, 106, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("YEAR");
		lblNewLabel_1.setBounds(358, 64, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		bookTitle = new JTextField();
		bookTitle.setBounds(68, 150, 450, 20);
		contentPane.add(bookTitle);
		bookTitle.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("BOOK TITLE");
		lblNewLabel_2.setBounds(68, 125, 122, 14);
		contentPane.add(lblNewLabel_2);
		
		bookAuthor = new JTextField();
		bookAuthor.setBounds(68, 204, 450, 20);
		contentPane.add(bookAuthor);
		bookAuthor.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("AUTHOR");
		lblNewLabel_3.setBounds(68, 181, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton buttonAddBooks = new JButton("ADD");
		buttonAddBooks.setBounds(101, 235, 89, 23);
		contentPane.add(buttonAddBooks);
		
		JButton buttonDeleteBooks = new JButton("DELETE");
		buttonDeleteBooks.setBounds(225, 235, 89, 23);
		contentPane.add(buttonDeleteBooks);
		
		JButton ButtonUpdateBooks = new JButton("UPDATE");
		ButtonUpdateBooks.setBounds(358, 235, 89, 23);
		contentPane.add(ButtonUpdateBooks);
	}

}
