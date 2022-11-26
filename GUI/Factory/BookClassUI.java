// Author - Oliver Nagy

package GUI.Factory;

import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.AbstractAction;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import DATABASE.ClassSearchDTO;
import USER.STATEDESIGN.GUIContext;
import USER.STATEDESIGN.StartMemberGUI;
import USER.STATEDESIGN.State;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookClassUI extends JPanel implements ActionListener, GUI {
    JPanel panel;
    JFrame frame;

    @Override
    public void Create() throws FileNotFoundException, IOException {
        // Creating the panel and frame for our system
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel mainMenuLabel = new JLabel("Available Classes");
        mainMenuLabel.setText("Availabe Classes");
        mainMenuLabel.setBounds(200, 10, 120, 25);
        mainMenuLabel.setHorizontalAlignment(JLabel.CENTER);
        mainMenuLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
        panel.add(mainMenuLabel);
        int y_offset = 80;

        // Adding the Logout button
        JButton backButton = new JButton(new AbstractAction("Back") {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUIContext context = new GUIContext();
                State UserMenu = new StartMemberGUI();// uses factory
                context.setState(UserMenu);
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
        backButton.setBounds(400, 20, 80, 25);

        panel.add(backButton);

        // Add Classes from CSV file/database
        ClassSearchDTO.Search("CLASSES");
        for (int i = 0; i < ClassSearchDTO.Class.size(); i++) {

            JLabel class1 = new JLabel(ClassSearchDTO.Class.get(i));
            JButton bookButton = new JButton("Book");
            bookButton.setBounds(400, y_offset, 80, 25);

            class1.setBounds(0, y_offset, 700, 25);

            panel.add(class1);
            panel.add(bookButton);
            y_offset = y_offset + 60;

        }

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
}
