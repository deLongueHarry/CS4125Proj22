package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserUI implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JLabel success;
    private static JPasswordField passwordText;
    private static JButton logInButton;

    public static void main(String[] args) {

        // Creating the panel and frame for our system
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        // Creating the user text box
        panel.setLayout(null);
        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        // Creating the password text box
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        // Making the password invisible when typing
        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        // Adding the Log in button
        logInButton = new JButton("Log In");
        logInButton.setBounds(10, 80, 80, 25);
        logInButton.addActionListener(new UserUI());
        panel.add(logInButton);

        // Making a success notification
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();

        if (user.equals("Emmet") && password.equals("password")) {
            System.out.println("success!");
        } else {
            System.out.println("failed, try again!");
        }

    }

}
