import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class AdminMainFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblclock;
    private JTextField IsbnOfBooks;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminMainFrame frame = new AdminMainFrame();
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

                        lblclock.setText("DATE: " + month + "/" + day + "/" + year + "    " + "TIME: " + hour + ":" + minute + ":" + second);
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
    public AdminMainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1366, 768);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);

        // INTERNAL FRAMES
        JInternalFrame AddBooksInternalFrame = new JInternalFrame("Add Books");
        AddBooksInternalFrame.setBounds(260, 76, 992, 600);
        AddBooksInternalFrame.setClosable(true);
        AddBooksInternalFrame.getContentPane().setLayout(null);
        contentPane.add(AddBooksInternalFrame);
        
        JButton btnNewButton = new JButton("Add Books");
        btnNewButton.setBounds(49, 62, 150, 23);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddBooksInternalFrame.setVisible(true);
            }
        });
        contentPane.add(btnNewButton);
        
        // Add Books Icon
        JLabel AddBooksIcon = new JLabel("");
        AddBooksIcon.setBounds(89, 83, 68, 59); // Set the size of the JLabel (this size can be smaller or bigger)
        contentPane.add(AddBooksIcon);

        ImageIcon addBooksImageIcon = new ImageIcon("src/images/addbooks.png"); // Path to your image
        Image addBooksImage = addBooksImageIcon.getImage(); // Convert to Image object

        // Get the original dimensions of the image
        int originalWidth = addBooksImage.getWidth(null);
        int originalHeight = addBooksImage.getHeight(null);

        // Calculate the scaling factor while maintaining the aspect ratio
        double widthRatio = (double) AddBooksIcon.getWidth() / originalWidth;
        double heightRatio = (double) AddBooksIcon.getHeight() / originalHeight;
        double scaleFactor = Math.min(widthRatio, heightRatio); // Choose the smaller scale factor to avoid cropping

        // Scale the image with the calculated factor
        int newWidth = (int) (originalWidth * scaleFactor);
        int newHeight = (int) (originalHeight * scaleFactor);
        Image scaledImage = addBooksImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH); // Smooth scaling

        AddBooksIcon.setIcon(new ImageIcon(scaledImage)); // Set the scaled image as an icon

        // Add mouse click functionality
        AddBooksIcon.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Show the AddBooksInternalFrame on click
                AddBooksInternalFrame.setVisible(true);
                try {
                    // Bring the frame to the front
                    AddBooksInternalFrame.setSelected(true);
                } catch (java.beans.PropertyVetoException ex) {
                    ex.printStackTrace();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                AddBooksIcon.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Change cursor on hover
            }
        });


          

        JInternalFrame UpdateBooksInternalFrame = new JInternalFrame("Update Books");
        UpdateBooksInternalFrame.setBounds(260, 76, 992, 600);
        UpdateBooksInternalFrame.setClosable(true);
        UpdateBooksInternalFrame.getContentPane().setLayout(null);
        UpdateBooksInternalFrame.setVisible(false);
        contentPane.add(UpdateBooksInternalFrame);

        JInternalFrame DeleteBooksInternalFrame = new JInternalFrame("Delete Books");
        DeleteBooksInternalFrame.setBounds(260, 76, 992, 600);
        DeleteBooksInternalFrame.setClosable(true);
        DeleteBooksInternalFrame.getContentPane().setLayout(null);
        DeleteBooksInternalFrame.setVisible(false);
        contentPane.add(DeleteBooksInternalFrame);

        JInternalFrame GenerateBarcodeInternalFrame = new JInternalFrame("Generate Barcode");
        GenerateBarcodeInternalFrame.setBounds(260, 76, 992, 600);
        GenerateBarcodeInternalFrame.setClosable(true);
        GenerateBarcodeInternalFrame.getContentPane().setLayout(null);
        GenerateBarcodeInternalFrame.setVisible(false);

        JLabel lblNewLabel = new JLabel("Barcode");
        lblNewLabel.setFont(new Font("Serif", Font.BOLD, 30));
        lblNewLabel.setBounds(417, 96, 117, 27);
        GenerateBarcodeInternalFrame.getContentPane().add(lblNewLabel);
        
        JLabel GeneratedBarcode = new JLabel("");
        GeneratedBarcode.setFont(new Font("Tahoma", Font.PLAIN, 33));
        GeneratedBarcode.setBounds(293, 154, 369, 96);
        GenerateBarcodeInternalFrame.getContentPane().add(GeneratedBarcode);
        
        IsbnOfBooks = new JTextField();
        IsbnOfBooks.setFont(new Font("Tahoma", Font.PLAIN, 15));
        IsbnOfBooks.setBounds(374, 290, 288, 30);
        GenerateBarcodeInternalFrame.getContentPane().add(IsbnOfBooks);
        IsbnOfBooks.setColumns(10);
        
        JLabel ISBNlabel = new JLabel("ISBN:");
        ISBNlabel.setFont(new Font("Serif", Font.PLAIN, 25));
        ISBNlabel.setBounds(306, 293, 70, 27);
        GenerateBarcodeInternalFrame.getContentPane().add(ISBNlabel);
        
        JButton GenerateButton = new JButton("Generate ");
        GenerateButton.setFont(new Font("Serif", Font.PLAIN, 15));
        GenerateButton.setBounds(293, 385, 117, 23);
        GenerateBarcodeInternalFrame.getContentPane().add(GenerateButton);
        
        JButton SaveBarcodeButton = new JButton("Save");
        SaveBarcodeButton.setFont(new Font("Serif", Font.PLAIN, 15));
        SaveBarcodeButton.setBounds(573, 385, 89, 23);
        GenerateBarcodeInternalFrame.getContentPane().add(SaveBarcodeButton);
        
        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.textHighlight);
        panel.setBounds(196, 62, 552, 385);
        GenerateBarcodeInternalFrame.getContentPane().add(panel);
        GenerateBarcodeInternalFrame.setVisible(false);
        contentPane.setLayout(null);
        
        contentPane.add(GenerateBarcodeInternalFrame);

        JInternalFrame ViewBooksInternalFrame = new JInternalFrame("View Books");
        ViewBooksInternalFrame.setBounds(260, 76, 992, 600);
        ViewBooksInternalFrame.setClosable(true);
        ViewBooksInternalFrame.getContentPane().setLayout(null);
        ViewBooksInternalFrame.setVisible(false);
        contentPane.add(ViewBooksInternalFrame);

        JInternalFrame ViewStudentInternalFrame = new JInternalFrame("View Student");
        ViewStudentInternalFrame.setBounds(260, 76, 992, 600);
        ViewStudentInternalFrame.setClosable(true);
        ViewStudentInternalFrame.getContentPane().setLayout(null);
        ViewStudentInternalFrame.setVisible(false);
        contentPane.add(ViewStudentInternalFrame);
        
        JButton ViewStudentButton = new JButton("View Student");
        ViewStudentButton.setBounds(49, 570, 150, 23);
        ViewStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewStudentInternalFrame.setVisible(true);
            }
        });
        contentPane.add(ViewStudentButton);
        
        JLabel viewstudenticon = new JLabel("");
        viewstudenticon.setBounds(89, 509, 59, 50);
        contentPane.add(viewstudenticon);
        
        

        // Existing RecordsInternalFrame that will be shown on icon click
        JInternalFrame RecordsInternalFrame = new JInternalFrame("Records");
        RecordsInternalFrame.setBounds(260, 76, 992, 600);
        RecordsInternalFrame.setClosable(true);
        RecordsInternalFrame.getContentPane().setLayout(null);
        RecordsInternalFrame.setVisible(false); // Initially not visible
        contentPane.add(RecordsInternalFrame);
        
        JButton RecordsButton = new JButton("Records");
        RecordsButton.setBounds(49, 695, 150, 23);
        RecordsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RecordsInternalFrame.setVisible(true);
            }
        });
        contentPane.add(RecordsButton);
        
     //RECORD ICON
        JLabel recordIcon1 = new JLabel("");
        recordIcon1.setBounds(89, 598, 59, 50); // Set the size of the JLabel (this size can be smaller or bigger)
        contentPane.add(recordIcon1);

        ImageIcon recordImageIcon = new ImageIcon("src/images/records.png"); // Path to your image
        Image recordImage = recordImageIcon.getImage(); // Convert to Image object

        // Get the original dimensions of the image
        int originalWidth1 = recordImage.getWidth(null);
        int originalHeight1 = recordImage.getHeight(null);

        // Calculate the scaling factor while maintaining the aspect ratio
        double widthRatio1 = (double) recordIcon1.getWidth() / originalWidth1;
        double heightRatio1 = (double) recordIcon1.getHeight() / originalHeight1;
        double scaleFactor1 = Math.min(widthRatio1, heightRatio1); // Choose the smaller scale factor to avoid cropping

        // Scale the image with the calculated factor
        int newWidth1 = (int) (originalWidth1 * scaleFactor1);
        int newHeight1 = (int) (originalHeight1 * scaleFactor1);
        Image scaledImage1 = recordImage.getScaledInstance(newWidth1, newHeight1, Image.SCALE_SMOOTH); // Smooth scaling

        // Set the scaled image as an icon for the JLabel
        recordIcon1.setIcon(new ImageIcon(scaledImage1));

        // Add mouse click functionality for record icon
        recordIcon1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Show the RecordsInternalFrame on click
                RecordsInternalFrame.setVisible(true);
                try {
                    // Bring the frame to the front
                    RecordsInternalFrame.setSelected(true);
                } catch (java.beans.PropertyVetoException ex) {
                    ex.printStackTrace();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                recordIcon1.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Change cursor on hover
            }
        });

        // Change cursor when hovering over the icon
        recordIcon1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
      
        
        
        
        
        
        
        
      
        
        

        // BUTTONS
        

        JButton btnNewButton_1 = new JButton("Update Books");
        btnNewButton_1.setBounds(49, 167, 150, 23);
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateBooksInternalFrame.setVisible(true);
            }
        });
        contentPane.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Delete Books");
        btnNewButton_2.setBounds(49, 265, 150, 23);
        btnNewButton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeleteBooksInternalFrame.setVisible(true);
            }
        });
        contentPane.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Generate Barcode");
        btnNewButton_3.setBounds(49, 372, 150, 23);
        btnNewButton_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GenerateBarcodeInternalFrame.setVisible(true);
            }
        });
        contentPane.add(btnNewButton_3);

        JButton ViewBooksButton_4 = new JButton("View Books");
        ViewBooksButton_4.setBounds(49, 474, 150, 23);
        ViewBooksButton_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewBooksInternalFrame.setVisible(true);
            }
        });
        contentPane.add(ViewBooksButton_4);

       

        // LOG OUT
        JButton LogOutButton = new JButton("Log out");
        LogOutButton.setBackground(Color.WHITE);
        LogOutButton.setBounds(1233, 11, 107, 45);
        contentPane.add(LogOutButton);
        LogOutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MainFrame frame2 = new MainFrame();
                frame2.setVisible(true);
                dispose();
            }
        });

        // CLOCK
        lblclock = new JLabel("Clock ");
        lblclock.setBounds(887, 32, 300, 18);
        contentPane.add(lblclock);
        lblclock.setForeground(new Color(0, 0, 0));
        lblclock.setFont(new Font("Verdana", Font.BOLD, 14));
        
        
       
      
        
   
        clock(); // Start clock function
    }
}
