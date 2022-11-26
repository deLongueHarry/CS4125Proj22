package GUI.Factory;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import DATABASE.UserSearchDTO;
import DATABASE.WriterDTO;
import USER.User;
import USER.STATEDESIGN.GUIContext;
import USER.STATEDESIGN.StartAddClassGUI;

import USER.STATEDESIGN.StartLoginGUI;
import USER.STATEDESIGN.State;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AdminUI extends JPanel implements ActionListener, GUI {

    private static JLabel success;
    private static JButton addClassButton;
    private static JButton manageMembersButton;

    static User loggedIn;

    static String firstName;

    static String surName;
    static String DOB1;
    static String ID;
    static String password;

    public static void SetID(String id) {
        MenuUI.ID = id;

    }

    public void Create() throws FileNotFoundException, IOException {

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
        addClassButton = new JButton(new AbstractAction("Add new Class") {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUIContext context = new GUIContext();
                State Class = new StartAddClassGUI();// uses factory
                context.setState(Class);
                try {
                    context.enterGUI();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false); // you can't see me!
                panel.setVisible(false);
                frame.dispose();

            }
        });
        addClassButton.setBounds(180, 180, 120, 25);
        panel.add(addClassButton);

        // Adding the Manage Members button
        manageMembersButton = new JButton("Manage Members");
        manageMembersButton.setBounds(180, 210, 120, 25);
        manageMembersButton.addActionListener(new RegUI());
        panel.add(manageMembersButton);

        // Adding the Logout button
        JButton logOutButton = new JButton(new AbstractAction("Log Out") {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUIContext context = new GUIContext();
                State Login = new StartLoginGUI();// uses factory
                context.setState(Login);
                try {
                    context.enterGUI();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                frame.setVisible(false); // you can't see me!
                panel.setVisible(false);
                frame.dispose();

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

    public static void InitUser() throws FileNotFoundException, IOException {

        UserSearchDTO.Search("USERS", ID);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // convert String to LocalDate

        if (UserSearchDTO.found == true) {
            String dob = UserSearchDTO.DOB;
            String strt = UserSearchDTO.startDate;
            String end = UserSearchDTO.endDate;
            LocalDate localDateDOB = LocalDate.parse(dob, formatter);
            LocalDate localDatestrt = LocalDate.parse(strt, formatter);
            LocalDate localDateend = LocalDate.parse(end, formatter);

            loggedIn = new User(UserSearchDTO.ID, UserSearchDTO.UserName, localDatestrt, localDateend, localDateDOB,
                    UserSearchDTO.userType);

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

        WriterDTO wr2 = new WriterDTO();

        try {
            wr2.Write(userAndPassword, "LOGIN_DETAILS.txt");
        } catch (IOException e1) {

            e1.printStackTrace();
        }

        WriterDTO wr = new WriterDTO();

        try {

            wr.Write(User, "USERS.csv");
        } catch (IOException e1) {

            e1.printStackTrace();
        }

    }

}
