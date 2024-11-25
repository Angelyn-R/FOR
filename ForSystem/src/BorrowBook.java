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
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Color;

public class BorrowBook extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField BookIsbnBorrow;
	private JTextField textField;
	private JLabel BorrowedTime;

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
	
	public void clock() {
        Thread clock = new Thread() {
            public void run() {
                try {
                    for (;;) {
                        Calendar cal = new GregorianCalendar();
                        int day = cal.get(Calendar.DAY_OF_MONTH);
                        int month = cal.get(Calendar.MONTH) + 1;
                        int year = cal.get(Calendar.YEAR);
                        int second = cal.get(Calendar.SECOND);
                        int minute = cal.get(Calendar.MINUTE);
                        int hour = cal.get(Calendar.HOUR_OF_DAY);

                        BorrowedTime.setText("DATE: " + month + "/" + day + "/" + year + "    " + "TIME: " + hour + ":" + minute + ":" + second);
                        sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        clock.start();
    }

	/**
	 * Create the frame.
	 */
	public BorrowBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BookIsbnBorrow = new JTextField();
		BookIsbnBorrow.setBounds(446, 248, 466, 77);
		contentPane.add(BookIsbnBorrow);
		BookIsbnBorrow.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Scan Bar Code for ISBN");
		lblNewLabel.setBounds(446, 366, 275, 23);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		JButton btnConfirmBorrow = new JButton("BORROW");
		btnConfirmBorrow.setBounds(624, 543, 141, 59);
		btnConfirmBorrow.setBackground(new Color(192, 192, 192));
		contentPane.add(btnConfirmBorrow);
		
		JButton confirmBorrow = new JButton("Confirm");
		confirmBorrow.setBackground(new Color(255, 255, 255));
		confirmBorrow.setBounds(936, 257, 132, 59);
		contentPane.add(confirmBorrow);
		
		JButton borrowBackButton = new JButton("Back");
		borrowBackButton.setBackground(new Color(255, 255, 255));
		borrowBackButton.setBounds(26, 636, 92, 43);
		borrowBackButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        MainFrame frame2 = new MainFrame();  
		        frame2.setVisible(true);
		        dispose();  
		    }
		});
		contentPane.add(borrowBackButton);
		
		textField = new JTextField();
		textField.setBounds(446, 400, 466, 77);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Student ID Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(446, 214, 264, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BORROW");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 90));
		lblNewLabel_2.setBounds(510, 43, 390, 77);
		contentPane.add(lblNewLabel_2);
		
		// CLOCK
		BorrowedTime = new JLabel("Clock ");
		BorrowedTime.setBounds(1040, 11, 300, 18);
        contentPane.add(BorrowedTime);
        BorrowedTime.setForeground(new Color(0, 0, 0));
        BorrowedTime.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		
		
		clock();
	}

}
