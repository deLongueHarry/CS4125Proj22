/* UI for the main menu for user/member
 * 
 * Author - Emmet Browne
 */

package GUI.FACTORY;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import DATABASE.UserSearchDTO;

import DATABASE.WriterDTO;
import GUI.STATEDESIGN.GUIContext;
import GUI.STATEDESIGN.StartLoginGUI;
import GUI.STATEDESIGN.State;
import USER.User;
import USER.Observer.Channels;
import USER.Observer.Subscriber;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MenuUI extends JPanel implements ActionListener, GUI {

    private static JLabel success;
    private static JButton bookClassButton;
    private static JButton buyMembershipButton;

    private static JLabel detailsLabel;
    private static JLabel IDLabel;
    private static JLabel userLabel;
    private static JLabel StartDate;
    private static JLabel DOB;
    private static JLabel EndDate;
    static User loggedIn;
    public static Channels ch;

    static String firstName;

    static String surName;
    static String DOB1;
    public static String ID;
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

        JLabel mainMenuLabel = new JLabel("Main Menu");
        mainMenuLabel.setText("Main Menu");
        mainMenuLabel.setBounds(200, 10, 80, 25);
        mainMenuLabel.setHorizontalAlignment(JLabel.CENTER);
        mainMenuLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
        panel.add(mainMenuLabel);

        //
        bookClassButton = new JButton(new AbstractAction("Book Class") {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Factory
                GUIFactory gui = new GUIFactory();
                GUI book = gui.getGUI("Book Class");
                try {
                    BookClassUI.setID(ID);
                    book.Create();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                frame.setVisible(false); // you can't see me!
                panel.setVisible(false);
                frame.dispose();

            }
        });
        bookClassButton.setBounds(180, 180, 120, 25);
        panel.add(bookClassButton);

        buyMembershipButton = new JButton(new AbstractAction("Buy Membership") {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Factory
                GUIFactory gui = new GUIFactory();
                GUI buy = gui.getGUI("Membership");
                try {
                    buy.Create();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                frame.setVisible(false); // you can't see me!
                panel.setVisible(false);
                frame.dispose();

            }
        });

        buyMembershipButton.setBounds(150, 215, 180, 25);
        panel.add(buyMembershipButton);

        // Adding the Logout button
        JButton logOutButton = new JButton(new AbstractAction("Log Out") {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUIContext context = new GUIContext();
                State logOut = new StartLoginGUI();// uses factory
                context.setState(logOut);
                try {
                    context.enterGUI();
                } catch (IOException e1) {
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

        // Look for Logged in user
        detailsLabel = new JLabel("Membership Details");
        detailsLabel.setBounds(10, 30, 120, 25);
        panel.add(detailsLabel);

        IDLabel = new JLabel("ID: " + ID);
        IDLabel.setBounds(10, 50, 80, 25);
        panel.add(IDLabel);

        userLabel = new JLabel("Username: " + loggedIn.getUserName());
        userLabel.setBounds(10, 70, 140, 25);
        panel.add(userLabel);

        DOB = new JLabel("DOB: " + loggedIn.getDOB());
        DOB.setBounds(10, 90, 140, 25);
        panel.add(DOB);

        StartDate = new JLabel("MemberShip Start:  " + loggedIn.getstartDate());
        StartDate.setBounds(10, 110, 200, 25);
        panel.add(StartDate);

        EndDate = new JLabel("MemberShip End:  " + loggedIn.getendDate());
        EndDate.setBounds(10, 130, 200, 25);
        panel.add(EndDate);

    }

    public static void InitUser() throws FileNotFoundException, IOException {

        UserSearchDTO.Search("USERS", ID);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        if (UserSearchDTO.found == true) {
            String dob = UserSearchDTO.DOB;
            String strt = UserSearchDTO.startDate;
            String end = UserSearchDTO.endDate;
            LocalDate localDateDOB = LocalDate.parse(dob, formatter);
            LocalDate localDatestrt = LocalDate.parse(strt, formatter);
            LocalDate localDateend = LocalDate.parse(end, formatter);

            loggedIn = new User(UserSearchDTO.ID, UserSearchDTO.UserName, localDatestrt, localDateend, localDateDOB,
                    UserSearchDTO.userType);

            Subscriber sb = new Subscriber(UserSearchDTO.ID, UserSearchDTO.UserName, localDatestrt, localDateend,
                    localDateDOB,
                    UserSearchDTO.userType);
            ch = new Channels();
            ch.attach(sb);
            ch.notifySubscribers();

        } else {

            System.out.println("Error Loading User Data");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

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
