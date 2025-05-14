import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;

public class LoginGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cartoon Adda Login");
        frame.setSize(500, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Optional: Set background image
        JLabel background = new JLabel(new ImageIcon("pik.jpg"));
        background.setBounds(0, 0, 500, 400);
        frame.setContentPane(background);
        frame.setLayout(null);

        // Title
        JLabel title = new JLabel("🎉 Welcome to Cartoon Adda 🎉");
        title.setBounds(60, 20, 400, 40);
        title.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        title.setForeground(Color.MAGENTA);
        frame.add(title);

        // Labels
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(80, 90, 100, 30);
        userLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        frame.add(userLabel);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(80, 140, 100, 30);
        passLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        frame.add(passLabel);

        // Text Fields
        JTextField userField = new JTextField();
        userField.setBounds(180, 90, 200, 30);
        userField.setBackground(Color.WHITE);
        userField.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        frame.add(userField);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(180, 140, 200, 30);
        passField.setBackground(Color.WHITE);
        passField.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        frame.add(passField);

        // Button
        JButton loginButton = new JButton("✨ Login ✨");
        loginButton.setBounds(180, 200, 120, 40);
        loginButton.setBackground(new Color(255, 153, 51)); // Orange
        loginButton.setForeground(Color.WHITE);
        loginButton.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        loginButton.setFocusPainted(false);

        // Hover effect
        loginButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                loginButton.setBackground(new Color(255, 94, 98)); // Pink
            }

            public void mouseExited(MouseEvent evt) {
                loginButton.setBackground(new Color(255, 153, 51)); // Orange
            }
        });

        // Login Logic
        String correctUsername = "admin";
        String correctPassword = "1234";

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userText = userField.getText();
                String passText = new String(passField.getPassword());

                if (userText.equals(correctUsername) && passText.equals(correctPassword)) {
                    JOptionPane.showMessageDialog(frame, "✅ Login Successful! Redirecting to Cartoon Adda...");
                    try {
                        Desktop.getDesktop().browse(new URI("https://nikhil43-nik.github.io/cartoon_quiz_web/");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(frame, "⚠️ Failed to open browser.");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "❌ Invalid Username or Password");
                }
            }
        });

        frame.add(loginButton);
        frame.setVisible(true);
    }
}
