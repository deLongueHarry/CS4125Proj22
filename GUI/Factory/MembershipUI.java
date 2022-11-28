package GUI.FACTORY;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import BOOKINGSYSTEM.PaymentHandler;
import GUI.STATEDESIGN.GUIContext;
import GUI.STATEDESIGN.StartMemberGUI;
import GUI.STATEDESIGN.State;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MembershipUI extends JPanel implements ActionListener, GUI {

    private static JLabel success;

    private static JButton threeMonthBasicButton;
    private static JButton threeMonthSilverButton;
    private static JButton threeMonthGoldButton;

    private static JButton sixMonthBasicButton;
    private static JButton sixMonthSilverButton;
    private static JButton sixMonthGoldButton;

    private static JButton twelveMonthBasicButton;
    private static JButton twelveMonthSilverButton;
    private static JButton twelveMonthGoldButton;

    public static void SetID(String id) {
        MenuUI.ID = id;

    }

    public void Create() throws FileNotFoundException, IOException {

        // InitUser();

        // Creating the panel and frame for our system
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        // Setting Title
        JLabel membershipMenuLabel = new JLabel("Membership Menu");
        membershipMenuLabel.setText("Membership Menu");
        membershipMenuLabel.setBounds(180, 5, 120, 25);
        membershipMenuLabel.setHorizontalAlignment(JLabel.CENTER);
        membershipMenuLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
        panel.add(membershipMenuLabel);

        // Setting threemonth label
        JLabel threeMonthLabel = new JLabel("Three Months");
        threeMonthLabel.setText("Three Months");
        threeMonthLabel.setBounds(50, 50, 120, 25);
        threeMonthLabel.setHorizontalAlignment(JLabel.CENTER);
        threeMonthLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
        panel.add(threeMonthLabel);

        // Setting sixMonth label
        JLabel sixMonthLabel = new JLabel("Six Months");
        sixMonthLabel.setText("Six Months");
        sixMonthLabel.setBounds(180, 50, 120, 25);
        sixMonthLabel.setHorizontalAlignment(JLabel.CENTER);
        sixMonthLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
        panel.add(sixMonthLabel);

        // Setting twelvemonth label
        JLabel twelveMonthLabel = new JLabel("Twelve Months");
        twelveMonthLabel.setText("Twelve Months");
        twelveMonthLabel.setBounds(310, 50, 120, 25);
        twelveMonthLabel.setHorizontalAlignment(JLabel.CENTER);
        twelveMonthLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
        panel.add(twelveMonthLabel);

        // Three Month Buttons

        // Adding the threeMonthBasic button
        threeMonthBasicButton = new JButton("Basic");
        threeMonthBasicButton.setBounds(50, 90, 120, 25);
        threeMonthBasicButton.addActionListener(new MembershipUI());
        panel.add(threeMonthBasicButton);

        // Adding the threeMonthSilver button
        threeMonthSilverButton = new JButton("Silver");
        threeMonthSilverButton.setBounds(50, 130, 120, 25);
        threeMonthSilverButton.addActionListener(new MembershipUI());
        panel.add(threeMonthSilverButton);

        // Adding the threeMonthGold button
        threeMonthGoldButton = new JButton("Gold");
        threeMonthGoldButton.setBounds(50, 170, 120, 25);
        threeMonthGoldButton.addActionListener(new MembershipUI());
        panel.add(threeMonthGoldButton);

        // Six Month Buttons

        // Adding the sixMonthBasic button
        sixMonthBasicButton = new JButton("Basic");
        sixMonthBasicButton.setBounds(180, 90, 120, 25);
        sixMonthBasicButton.addActionListener(new MembershipUI());
        panel.add(sixMonthBasicButton);

        // Adding the threeMonthSilver button
        sixMonthSilverButton = new JButton("Silver");
        sixMonthSilverButton.setBounds(180, 130, 120, 25);
        sixMonthSilverButton.addActionListener(new MembershipUI());
        panel.add(sixMonthSilverButton);

        // Adding the threeMonthGold button
        sixMonthGoldButton = new JButton("Gold");
        sixMonthGoldButton.setBounds(180, 170, 120, 25);
        sixMonthGoldButton.addActionListener(new MembershipUI());
        panel.add(sixMonthGoldButton);

        // Twelve Months Buttons

        // Adding the twelveMonthBasic button
        twelveMonthBasicButton = new JButton("Basic");
        twelveMonthBasicButton.setBounds(310, 90, 120, 25);
        twelveMonthBasicButton.addActionListener(new MembershipUI());
        panel.add(twelveMonthBasicButton);

        // Adding the threeMonthSilver button
        twelveMonthSilverButton = new JButton("Silver");
        twelveMonthSilverButton.setBounds(310, 130, 120, 25);
        twelveMonthSilverButton.addActionListener(new MembershipUI());
        panel.add(twelveMonthSilverButton);

        // Adding the threeMonthGold button
        twelveMonthGoldButton = new JButton("Gold");
        twelveMonthGoldButton.setBounds(310, 170, 120, 25);
        twelveMonthGoldButton.addActionListener(new MembershipUI());
        panel.add(twelveMonthGoldButton);

        // Adding the Back button
        JButton backButton = new JButton(new AbstractAction("Back") {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUIContext context = new GUIContext();
                State Menu = new StartMemberGUI();// uses factory
                context.setState(Menu);
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

        backButton.setBounds(180, 250, 120, 25);

        panel.add(backButton);

        // Making a success notification
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        PaymentHandler p = new PaymentHandler();
        p.Pay();
    }

}
