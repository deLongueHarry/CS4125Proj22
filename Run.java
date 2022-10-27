import GUI.UserUI;

import javax.swing.SwingUtilities;

import GUI.RegUI;

public class Run {

    public static void callUI() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                UserUI userUI = new UserUI();
                RegUI registerUI = new RegUI();
            }
        });
    }
}
