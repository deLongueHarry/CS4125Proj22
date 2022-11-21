package GUI;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DATABASE.UserSearch;
import DATABASE.Writer;
import USER.User;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Member;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AdminUI extends JPanel implements ActionListener {

    private static JTextField fNameText;
    private static JTextField sNameText;
    private static JTextField collegeIDText;
    private static JTextField DOBText;
    private static JLabel success;
    private static JButton addClassButton;
    private static JButton manageMembersButton;
    private static JLabel mainMenuLabel;
    private static JLabel detailsLabel;
    private static JLabel IDLabel;
    private static JLabel userLabel;
    private static JLabel StartDate;
    private static JLabel DOB;
    private static JLabel EndDate;
    static User loggedIn;

    static String firstName;

    static String surName;
    static String DOB1;
    static String ID;
    static String password;

    public static void SetID(String id) {
        MenuUI.ID = id;

    }

    public static void Create() throws FileNotFoundException, IOException {

        InitUser();

        // Creating the panel and frame for our system
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel mainMenuLabel = new JLabel("Admin Menu");
        mainMenuLabel.setText("Admin Menu");
        mainMenuLabel.setBounds(200, 10, 80, 25);
        mainMenuLabel.setHorizontalAlignment(JLabel.CENTER);
        mainMenuLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
        panel.add(mainMenuLabel);

        // Adding the Add Classes button
        addClassButton = new JButton("Add Classes");
        addClassButton.setBounds(180, 180, 120, 25);
        addClassButton.addActionListener(new RegUI());
        panel.add(addClassButton);

        // Adding the Manage Members button
        manageMembersButton = new JButton("Manage Members");
        manageMembersButton.setBounds(180, 180, 120, 25);
        manageMembersButton.addActionListener(new RegUI());
        panel.add(manageMembersButton);

        // Making a success notification
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);

    }

    public static void InitUser() throws FileNotFoundException, IOException {

        UserSearch.Search("USERS", ID);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // convert String to LocalDate

        if (UserSearch.found == true) {
            String dob = UserSearch.DOB;
            String strt = UserSearch.startDate;
            String end = UserSearch.endDate;
            LocalDate localDateDOB = LocalDate.parse(dob, formatter);
            LocalDate localDatestrt = LocalDate.parse(strt, formatter);
            LocalDate localDateend = LocalDate.parse(end, formatter);

            loggedIn = new User(UserSearch.ID, UserSearch.UserName, localDatestrt, localDateend, localDateDOB,
                    UserSearch.userType);

        } else {

            System.out.println("Error Loading User Data");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

        // firstName = fNameText.getText();
        // surName = sNameText.getText();
        // DOB = DOBText.getText();
        // ID = collegeIDText.getText();
        // password = passwordText.getText();
        LocalDate dob = LocalDate.parse(DOB1, formatter);
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
            wr2.Write(userAndPassword, "LOGIN_DETAILS.txt");
        } catch (IOException e1) {

            e1.printStackTrace();
        }

        Writer wr = new Writer();

        try {

            wr.Write(User, "USERS.csv");
        } catch (IOException e1) {

            e1.printStackTrace();
        }

    }

}
