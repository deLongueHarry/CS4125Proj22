package GUI;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DATABASE.Writer;
import USER.User;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MenuUI extends JPanel implements ActionListener {

    private static JTextField fNameText;
    private static JTextField sNameText;
    private static JTextField collegeIDText;
    private static JTextField DOBText;
    private static JLabel success;
    private static JButton bookClassButton;
    private static JButton logOutButton;
    private static JLabel mainMenuLabel;

    static String firstName;
    static String DOB;
    static String surName;
    static String ID;
    static String password;

    public static void Create() {

        // Creating the panel and frame for our system
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel mainMenuLabel = new JLabel("Main Menu");
        mainMenuLabel.setText("Main Menu");
        mainMenuLabel.setBounds(200, 10, 80, 25);
        mainMenuLabel.setHorizontalAlignment(JLabel.CENTER);
        mainMenuLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
        panel.add(mainMenuLabel);

        //
        // Adding the Book Class button
        bookClassButton = new JButton("Book Class");
        bookClassButton.setBounds(180, 70, 120, 25);
        bookClassButton.addActionListener(new RegUI());
        panel.add(bookClassButton);

        //

        // Adding the Logout butto
        JButton logOutButton = new JButton(new AbstractAction("Log Out") {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserUI userui = new UserUI();
                userui.Create();
            }
        });

        logOutButton.setBounds(180, 250, 120, 25);

        panel.add(logOutButton);

        // Making a success notification
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

        // firstName = fNameText.getText();
        // surName = sNameText.getText();
        // DOB = DOBText.getText();
        // ID = collegeIDText.getText();
        // password = passwordText.getText();
        LocalDate dob = LocalDate.parse(DOB, formatter);
        LocalDate Today = LocalDate.now();

        User u = new User(ID, firstName + " " + surName, Today, Today, dob, "User");
        LocalDate dateOfB = u.getDOB();
        LocalDate start = u.getstartDate();
        LocalDate end = u.getendDate();

        String[][] User = {
                { u.getUserName(), u.getUserID(), dateOfB.toString(), start.toString(), end.toString(),
                        u.getUserType() },
                {},

        };

        String[][] userAndPassword = {
                { u.getUserID(), password },
                {},

        };

        Writer wr2 = new Writer();

        try {
            wr2.Write(userAndPassword, "LOGIN_DETAILS");
        } catch (IOException e1) {

            e1.printStackTrace();
        }

        Writer wr = new Writer();

        try {

            wr.Write(User, "USERS");
        } catch (IOException e1) {

            e1.printStackTrace();
        }

    }

}
