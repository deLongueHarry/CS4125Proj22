// Main Class
package BOOKINGSYSTEM;

import java.io.IOException;

import GUI.STATEDESIGN.GUIContext;
import GUI.STATEDESIGN.StartLoginGUI;
import GUI.STATEDESIGN.State;

public class BookingSystem {

    public static void main(String[] args) throws IOException {
        GUIContext context = new GUIContext();
        State login = new StartLoginGUI(); // uses factory
        context.setState(login);
        context.enterGUI();

    }

}
