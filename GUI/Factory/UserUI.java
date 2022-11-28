package GUI.FACTORY;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;

import DATABASE.VerifyLoginDTO;
import GUI.STATEDESIGN.GUIContext;
import GUI.STATEDESIGN.StartAdminGUI;
import GUI.STATEDESIGN.StartMemberGUI;
import GUI.STATEDESIGN.State;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class UserUI extends JPanel implements ActionListener, GUI {

    private static JLabel userLabel;
    public static JTextField userText;
    private static JLabel passwordLabel;
    private static JLabel success;
    public static JTextField passwordText;
    private static JButton LogInButton;
    private static JPanel panel;
    private static JFrame frame;
    static GUIContext context;
    public static String loginMessage;
    State startUser;
    State startAdmin;

    public String userName;
    public String password;

    public void Create() {
        context = new GUIContext();
        // Creating the panel and frame for our system
        panel = new JPanel();
        frame = new JFrame();
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

        // Register Button
        JButton RegisterButton = new JButton(new AbstractAction("Not a member? Register Here") {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Factory
                GUIFactory gui = new GUIFactory();
                GUI reg = gui.getGUI("Register");
                try {
                    reg.Create();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                frame.setVisible(false); // you can't see me!
                panel.setVisible(false);
                frame.dispose();

            }
        });

        RegisterButton.setBounds(10, 120, 300, 25);
        panel.add(RegisterButton);

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

        VerifyLoginDTO rd = new VerifyLoginDTO();
        try {
            rd.Verify("LOGIN_DETAILS", password, userName);
            if (rd.found == true) {

                MenuUI.SetID(userName);
                if (userName.equals("Admin")) {

                    startAdmin = new StartAdminGUI();// uses factory
                    context.setState(startAdmin);
                    context.enterGUI();

                } else {

                    startUser = new StartMemberGUI();// uses factory
                    context.setState(startUser);
                    context.enterGUI();
                }

                frame.setVisible(false); // you can't see me!
                panel.setVisible(false);
                frame.dispose();

                loginMessage = "Succesfull Login";
                System.out.println(loginMessage);

            } else {
                loginMessage = "Unsuccessfull Login";
                System.out.println(loginMessage);
            }
        } catch (IOException e1) {

            e1.printStackTrace();
        }

    }

}
