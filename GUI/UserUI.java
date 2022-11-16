package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;

import DATABASE.LoginReader;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class UserUI extends JPanel implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JLabel success;
    private static JTextField passwordText;
    private static JButton LogInButton;

    String userName;
    String password;

    public void Create() {

        // Creating the panel and frame for our system
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        // Creating the user text box
        panel.setLayout(null);
        userLabel = new JLabel("ID");
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
        passwordText = new JTextField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        // Adding the Log in button
        LogInButton = new JButton("Log In");
        LogInButton.setBounds(10, 80, 80, 25);
        LogInButton.addActionListener(new UserUI());
        panel.add(LogInButton);

        // Making a success notification
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        userName = userText.getText();
        password = passwordText.getText();
        System.out.print(userName);

        LoginReader rd = new LoginReader();
        try {
            rd.Read("LOGIN_DETAILS", password, userName);
            if(rd.found == true){
                /// Go too Menu
            }
            else{

                System.out.println("Login Failed check password/username");
            }
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

    }

}
