// Author: Emmet Browne

package GUI.FACTORY;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import BOOKINGSYSTEM.Class;
import DATABASE.WriterDTO;
import GUI.STATEDESIGN.GUIContext;
import GUI.STATEDESIGN.StartAdminGUI;
import GUI.STATEDESIGN.State;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class AddClasses extends JPanel implements ActionListener, GUI {

    private static JLabel classTypeLabel;

    private static JLabel locationLabel;
    private static JLabel priceLabel;
    private static JLabel bookingNumLabel;
    private static JTextField classTypeText;

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

    public void Create() {

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

        // Creating the price text box
        priceLabel = new JLabel("Price");
        priceLabel.setBounds(10, 140, 80, 25);
        panel.add(priceLabel);

        priceText = new JTextField(20);
        priceText.setBounds(100, 140, 165, 25);
        panel.add(priceText);

        // Creating the Location text box
        locationLabel = new JLabel("Location");
        locationLabel.setBounds(10, 180, 115, 25);
        panel.add(locationLabel);

        locationText = new JTextField(20);
        locationText.setBounds(100, 180, 165, 25);
        panel.add(locationText);

        // Creating the c number text box
        bookingNumLabel = new JLabel("Booking Number");
        bookingNumLabel.setBounds(10, 210, 115, 25);
        panel.add(bookingNumLabel);

        bookingNumText = new JTextField(20);
        bookingNumText.setBounds(100, 210, 165, 25);
        panel.add(bookingNumText);

        // Adding the Logout button
        JButton logOutButton = new JButton(new AbstractAction("Back") {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUIContext context = new GUIContext();
                State AdminMenu = new StartAdminGUI();// uses factory
                context.setState(AdminMenu);
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

        // Save Button
        JButton saveButton = new JButton(new AbstractAction("Save") {
            @Override
            public void actionPerformed(ActionEvent e) {

                classType = classTypeText.getText();
                location = locationText.getText();
                bookingNum = bookingNumText.getText();
                price = priceText.getText();

                Class c = new Class(bookingNum, classType, price, location);

                String[][] Booking = {
                        { c.getBookingNum(), c.getClassType(), c.getPrice(), c.getLocation() }

                };

                WriterDTO wr = new WriterDTO();

                try {

                    wr.Write(Booking, "CLASSES");
                } catch (IOException e1) {

                    e1.printStackTrace();
                }

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

    }
}
