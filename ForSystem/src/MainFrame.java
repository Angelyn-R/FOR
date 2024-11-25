import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class MainFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

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

    public MainFrame() {
        setTitle("Book Borrowing System with Barcode Technology");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1366, 768);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Admin Button
        JButton adminButton = new JButton("Admin");
        adminButton.setBackground(new Color(255, 255, 255));
        adminButton.setBounds(1233, 11, 107, 45);
        adminButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LoginAdmin frame2 = new LoginAdmin();
                frame2.setVisible(true);
            }
        });
        contentPane.add(adminButton);
        
        JLabel LogoIcon = new JLabel("");
        LogoIcon.setBounds(879, 79, 141, 125);
        contentPane.add(LogoIcon);  
        
        ImageIcon LogoIcon1 = new ImageIcon("src/images/LCANHS_Logo-removebg-preview.png"); // Path to your image
        Image LogoImage = LogoIcon1.getImage().getScaledInstance(LogoIcon.getWidth(), LogoIcon.getHeight(), Image.SCALE_SMOOTH); // Resize the image
        LogoIcon.setIcon(new ImageIcon(LogoImage)); // Set the icon
        
        
        // Borrow Book Button
        JButton borrowButton = new JButton("Borrow Book");
        borrowButton.setBounds(666, 403, 167, 59);
        contentPane.add(borrowButton);
        borrowButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        borrowButton.setBackground(new Color(255, 255, 255));
        
        JButton returnButton = new JButton("Return Book");
        returnButton.setBounds(1078, 403, 167, 59);
        contentPane.add(returnButton);
        returnButton.setBackground(new Color(255, 255, 255));
        returnButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        JLabel lblNewLabel_1 = new JLabel("Are you a new borrower? Register now!");
        lblNewLabel_1.setBounds(764, 551, 358, 24);
        contentPane.add(lblNewLabel_1);
        lblNewLabel_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(867, 602, 141, 35);
        contentPane.add(registerButton);
        registerButton.setBackground(new Color(192, 192, 192));
        registerButton.setFont(new Font("Tahoma", Font.BOLD, 14));                
        
        JLabel SystemName = new JLabel("   BOOK BORROWING SYSTEM ");
        SystemName.setForeground(new Color(216, 20, 10));
        SystemName.setBounds(653, 230, 608, 111);
        contentPane.add(SystemName);
        SystemName.setBackground(new Color(216, 20, 10));
        SystemName.setFont(new Font("Serif", Font.BOLD, 40));
        
        JLabel lblNewLabel = new JLabel("Aplaya National High School - Annex");
        lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 25));
        lblNewLabel.setBounds(772, 215, 417, 33);
        contentPane.add(lblNewLabel);
        
                registerButton.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                	Register frame2 = new Register();
                	frame2.setVisible(true);
                	dispose();
                	}
                	}); 
        
        
        
        returnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        ReturnBook frame2 = new ReturnBook();
        frame2.setVisible(true);
        dispose();
            }
        });
        
                borrowButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        BorrowBook frame2 = new BorrowBook();
                        frame2.setVisible(true);
                        dispose();
                    }
                });
        
        
        
    }
}
