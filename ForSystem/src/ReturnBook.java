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

public class ReturnBook extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField BookIsbnReturn;
	private JTextField textField;
	private JLabel ReturnedTime;

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

                        ReturnedTime.setText("DATE: " + month + "/" + day + "/" + year + "    " + "TIME: " + hour + ":" + minute + ":" + second);
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
	public ReturnBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		BookIsbnReturn = new JTextField();
		BookIsbnReturn.setBounds(446, 400, 466, 77);
		contentPane.add(BookIsbnReturn);
		BookIsbnReturn.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Scan Bar Code for ISBN");
		lblNewLabel.setBounds(446, 366, 275, 23);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		JButton btnConfirmReturn = new JButton("RETURN");
		btnConfirmReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfirmReturn.setBounds(624, 543, 141, 59);
		btnConfirmReturn.setBackground(new Color(192, 192, 192));
		contentPane.add(btnConfirmReturn);
		
		JButton confirmReturn = new JButton("Confirm");
		confirmReturn.setBounds(936, 257, 132, 59);
		confirmReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		confirmReturn.setBackground(new Color(255, 255, 255));
		contentPane.add(confirmReturn);
		
		JButton returnBackButton = new JButton("Back");
		returnBackButton.setBounds(10, 668, 92, 43);
		returnBackButton.setBackground(new Color(255, 255, 255));
		returnBackButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        MainFrame frame2 = new MainFrame();  
		        frame2.setVisible(true);
		        dispose();  
		    }
		});
		contentPane.add(returnBackButton);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Student ID Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(446, 214, 264, 23);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(446, 248, 466, 77);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("RETURN");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 90));
		lblNewLabel_2.setBounds(539, 43, 390, 77);
		contentPane.add(lblNewLabel_2);
		
		// CLOCK
				ReturnedTime = new JLabel("Clock ");
				ReturnedTime.setBounds(752, 161, 300, 18);
		        contentPane.add(ReturnedTime);
		        ReturnedTime.setForeground(new Color(0, 0, 0));
		        ReturnedTime.setFont(new Font("Verdana", Font.BOLD, 14));
				
				
				
				clock();
	}

}
