package USER.STATEDESIGN;

import java.io.FileNotFoundException;
import java.io.IOException;

import GUI.MenuUI;

public class EnterGUI {

    private String userType = "";

    public void setState(String userType) {
        this.userType = userType;
    }

    public void doAction() throws FileNotFoundException, IOException {
        if (userType.equals("Member")) {
            MenuUI.Create();// creates menu for User
        } else if (userType.equalsIgnoreCase("Admin")) {
            // AdminUI.Create() - yet to implement creates menu for Admin
        }
    }

}
