// Author - Oliver Nagy

package GUI.Factory;

import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

import DATABASE.ClassSearchDTO;

public class BookClassUI extends JPanel implements GUI {

    @Override
    public void Create() throws FileNotFoundException, IOException {
        // Creating the panel and frame for our system
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel mainMenuLabel = new JLabel("Available Classes");
        mainMenuLabel.setText("Availabe Classes");
        mainMenuLabel.setBounds(200, 10, 120, 25);
        mainMenuLabel.setHorizontalAlignment(JLabel.CENTER);
        mainMenuLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
        panel.add(mainMenuLabel);
        int y_offset = 35;
        ClassSearchDTO.Search("CLASSES");
        for (int i = 0; i < ClassSearchDTO.Class.length; i++) {

            JLabel class1 = new JLabel(ClassSearchDTO.Class[i]);

            class1.setBounds(0, y_offset, 700, 25);

            panel.add(class1);
            y_offset = y_offset + 50;

        }

        frame.setVisible(true);
    }
}
