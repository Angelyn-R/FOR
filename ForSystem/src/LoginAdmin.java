import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class LoginAdmin extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                LoginAdmin frame = new LoginAdmin();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public LoginAdmin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 449, 252);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setForeground(new Color(139, 0, 0));
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblUsername.setBounds(41, 47, 81, 14);
        contentPane.add(lblUsername);
        
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblPassword.setBounds(41, 102, 70, 14);
        contentPane.add(lblPassword);
        
        JButton btnLogIn = new JButton("LOG IN");
        btnLogIn.setBackground(new Color(192, 192, 192));
        btnLogIn.setBounds(289, 158, 93, 35);
        btnLogIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbs_db", "root", "");

                    
                    String sql = "SELECT * FROM admin WHERE Username = ? AND Password = ?";
                    PreparedStatement pstmt = c.prepareStatement(sql);
                    pstmt.setString(1, textField.getText());
                    pstmt.setString(2, passwordField.getText());
                    ResultSet rs = pstmt.executeQuery();

                    if (rs.next()) {
                        dispose();
                        AdminMainFrame frame2 = new AdminMainFrame();
                        frame2.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Username/Password Error", "ERROR", JOptionPane.ERROR_MESSAGE);
                        textField.setText(null);
                        passwordField.setText(null);
                        textField.requestFocus();
                    }
                    rs.close();
                    pstmt.close();
                    c.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        contentPane.add(btnLogIn);
        
        textField = new JTextField();
        textField.setBounds(135, 37, 247, 37);
        contentPane.add(textField);
        textField.setColumns(10);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(135, 93, 247, 35);
        contentPane.add(passwordField);
        passwordField.setColumns(10);
        
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBackground(new Color(255, 255, 255));
        cancelButton.setBounds(135, 158, 93, 35);
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MainFrame frame2 = new MainFrame();  
                frame2.setVisible(true);
                dispose();  
            }
        });
        contentPane.add(cancelButton);
    }
}
