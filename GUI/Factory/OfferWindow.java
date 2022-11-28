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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OfferWindow extends JPanel implements ActionListener, GUI {
    JPanel panel;
    JFrame frame;

    @Override
    public void Create() throws FileNotFoundException, IOException {
        // Creating the panel and frame for our system
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(200, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel mainMenuLabel = new JLabel("50%  off \n on all protein powder");
        mainMenuLabel.setText("<html>50% OFF <br/>On ALL PROTIEN!!!!</html>");
        mainMenuLabel.setBounds(0, 40, 200, 50);
        mainMenuLabel.setHorizontalAlignment(JLabel.CENTER);
        mainMenuLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
        panel.add(mainMenuLabel);

        // Adding the Logout button
        JButton backButton = new JButton(new AbstractAction("Close Offer") {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.setVisible(false); // you can't see me!
                panel.setVisible(false);
                frame.dispose();

            }

        });
        backButton.setBounds(35, 130, 120, 25);

        panel.add(backButton);

        // Adding the Logout button
        JButton View = new JButton(new AbstractAction("View Offer") {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.setVisible(false); // you can't see me!
                panel.setVisible(false);
                frame.dispose();

            }

        });
        View.setBounds(35, 160, 120, 25);

        panel.add(View);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
}
