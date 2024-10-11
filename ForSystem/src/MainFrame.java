import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLayeredPane;
import javax.swing.JSplitPane;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField SystemName;
	private JTextField studenQrCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		SystemName = new JTextField();
		SystemName.setFont(new Font("Tahoma", Font.PLAIN, 40));
		SystemName.setText("BOOK BORROWING SYSTEM");
		SystemName.setBounds(62, 104, 540, 54);
		contentPane.add(SystemName);
		SystemName.setColumns(10);
		
		studenQrCode = new JTextField();
		studenQrCode.setText("Please scan your QR here");
		studenQrCode.setBounds(258, 226, 159, 118);
		contentPane.add(studenQrCode);
		studenQrCode.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBounds(300, 381, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnAdmin = new JButton("ADMIN");
		btnAdmin.setBounds(569, 28, 89, 23);
		contentPane.add(btnAdmin);
	}
}
