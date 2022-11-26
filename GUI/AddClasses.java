// Author: Emmet Browne

package GUI;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import BOOKINGSYSTEM.Booking;
import DATABASE.Writer;
import USER.User;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.lang.reflect.Member;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AddClasses extends JPanel implements ActionListener {

    private static JLabel classTypeLabel;
    private static JLabel startTimeLabel;
    private static JLabel endTimeLabel;
    private static JLabel locationLabel;
    private static JLabel priceLabel;
    private static JLabel bookingNumLabel;
    private static JTextField classTypeText;
    private static JTextField endTimeText;
    private static JTextField StartTimeText;
    private static JTextField priceText;
    private static JTextField locationText;
    private static JTextField bookingNumText;
    private static JLabel success;

    static String classType;
    static String startTime;
    static String endTime;
    static String price;
    static String location;
    static String bookingNum;

    public static void Create() {

        // Creating the panel and frame for our system
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        // Creating the Class Type text box
        panel.setLayout(null);
        classTypeLabel = new JLabel("Class Type");
        classTypeLabel.setBounds(10, 20, 80, 25);
        panel.add(classTypeLabel);

        classTypeText = new JTextField(20);
        classTypeText.setBounds(100, 20, 165, 25);
        panel.add(classTypeText);

        //

        // Creating the start time text box
        panel.setLayout(null);
        startTimeLabel = new JLabel("Start Time");
        startTimeLabel.setBounds(10, 60, 80, 25);
        panel.add(startTimeLabel);

        StartTimeText = new JTextField(20);
        StartTimeText.setBounds(100, 60, 165, 25);
        panel.add(StartTimeText);
        ;

        //

        // Creating the end time text box
        panel.setLayout(null);
        endTimeLabel = new JLabel("End Time");
        endTimeLabel.setBounds(10, 100, 80, 25);
        panel.add(endTimeLabel);

        endTimeText = new JTextField(20);
        endTimeText.setBounds(100, 100, 165, 25);
        panel.add(endTimeText);
        ;

        //

        // Creating the price text box
        priceLabel = new JLabel("Price");
        priceLabel.setBounds(10, 140, 80, 25);
        panel.add(priceLabel);

        priceText = new JTextField(20);
        priceText.setBounds(100, 140, 165, 25);
        panel.add(priceText);

        //

        // Creating the Location text box
        locationLabel = new JLabel("Location");
        locationLabel.setBounds(10, 180, 115, 25);
        panel.add(locationLabel);

        locationText = new JTextField(20);
        locationText.setBounds(100, 180, 165, 25);
        panel.add(locationText);

        // Creating the booking number text box
        bookingNumLabel = new JLabel("Booking Number");
        bookingNumLabel.setBounds(10, 210, 115, 25);
        panel.add(bookingNumLabel);

        bookingNumText = new JTextField(20);
        bookingNumText.setBounds(100, 210, 165, 25);
        panel.add(bookingNumText);

        // Adding the Logout button
        JButton logOutButton = new JButton(new AbstractAction("Log Out") {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserUI.Create();
                frame.setVisible(false); // you can't see me!
                panel.setVisible(false);
                frame.dispose();

            }
        });

        logOutButton.setBounds(180, 250, 120, 25);

        panel.add(logOutButton);

        // Save Button
        JButton saveButton = new JButton(new AbstractAction("Save") {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false); // you can't see me!
                panel.setVisible(false);
                frame.dispose();

            }
        });

        saveButton.setBounds(180, 280, 120, 25);
        panel.add(saveButton);

        // Making a success notification
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

        classType = classTypeText.getText();
        startTime = StartTimeText.getText();
        endTime = endTimeText.getText();
        location = locationText.getText();
        bookingNum = bookingNumText.getText();
        LocalDateTime start = LocalDateTime.parse(startTime, formatter);
        LocalDateTime end = LocalDateTime.parse(endTime, formatter);

        Booking booking = new Booking(classType, start, end, price, location, bookingNum);

        LocalDateTime startingTime = booking.getstartTime();
        LocalDateTime endingTime = booking.getendTime();

        String[][] Booking = {
                { booking.getClassType(), startingTime.toString(), endingTime.toString(), booking.getPrice(),
                        booking.getLocation(), booking.getBookingNum()
                }

        };

        Writer wr = new Writer();

        try {

            wr.Write(Booking, "CLASSES");
        } catch (IOException e1) {

            e1.printStackTrace();
        }

    }

}
