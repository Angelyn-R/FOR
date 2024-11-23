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
import java.awt.SystemColor;
import javax.swing.JInternalFrame;

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
		//setBounds(100, 100, 819, 513);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		bookIsbn = new JTextField();
		bookIsbn.setBounds(169, 129, 208, 43);
		contentPane.add(bookIsbn);
		bookIsbn.setColumns(10);
		
		bookYear = new JTextField();
		bookYear.setBounds(458, 129, 161, 43);
		contentPane.add(bookYear);
		bookYear.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ISBN");
		lblNewLabel.setBounds(169, 104, 106, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("YEAR");
		lblNewLabel_1.setBounds(460, 104, 46, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_1);
		
		bookTitle = new JTextField();
		bookTitle.setBounds(169, 208, 450, 43);
		contentPane.add(bookTitle);
		bookTitle.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("BOOK TITLE");
		lblNewLabel_2.setBounds(169, 183, 122, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_2);
		
		bookAuthor = new JTextField();
		bookAuthor.setBounds(169, 289, 450, 43);
		contentPane.add(bookAuthor);
		bookAuthor.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("AUTHOR");
		lblNewLabel_3.setBounds(169, 262, 66, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_3);
		
		JButton buttonAddBooks = new JButton("ADD");
		buttonAddBooks.setBounds(169, 365, 141, 43);
		contentPane.add(buttonAddBooks);
		
		JButton buttonDeleteBooks = new JButton("DELETE");
		buttonDeleteBooks.setBounds(476, 365, 141, 43);
		contentPane.add(buttonDeleteBooks);
		
		JButton ButtonUpdateBooks = new JButton("UPDATE");
		ButtonUpdateBooks.setBounds(325, 365, 141, 43);
		contentPane.add(ButtonUpdateBooks);
		
		JButton backAddBooks = new JButton("Back");
		backAddBooks.setBounds(34, 609, 89, 23);
		backAddBooks.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        AdminMainFrame frame2 = new AdminMainFrame();  
		        frame2.setVisible(true);
		        dispose();  
		    }
		});
		contentPane.add(backAddBooks);
		
		JLabel lblNewLabel_4 = new JLabel("ADD DELETE UPDATE BOOKS");
		lblNewLabel_4.setBounds(463, 25, 324, 54);
		contentPane.add(lblNewLabel_4);
		
		JPanel panel = new JPanel();
		panel.setBounds(139, 68, 567, 411);
		panel.setBackground(SystemColor.activeCaption);
		contentPane.add(panel);
		
		// Create and configure the JInternalFrame
		JInternalFrame internalFrame = new JInternalFrame("Generate Barcode");
		internalFrame.setBounds(762, 104, 360, 244);
		contentPane.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		internalFrame.setVisible(false); // Initially hidden

		// Add an "Exit" button inside the JInternalFrame
		JButton exitButton = new JButton("Exit");
		exitButton.setBounds(120, 180, 100, 30); // Position inside the JInternalFrame
		exitButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        internalFrame.setVisible(false); // Hide the JInternalFrame
		    }
		});
		internalFrame.getContentPane().add(exitButton);

		
		// Add ActionListener to the "Generate Barcode" button
		JButton btnNewButton = new JButton("Generate Barcode");
		btnNewButton.setBounds(770, 41, 177, 23);
		btnNewButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        internalFrame.setVisible(true); // Show the JInternalFrame when the button is clicked
		    }
		});
		contentPane.add(btnNewButton);

	}
}
