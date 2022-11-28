package BOOKINGSYSTEM;

import java.io.FileNotFoundException;
import java.io.IOException;

import GUI.Factory.STATEDESIGN.GUIContext;
import GUI.Factory.STATEDESIGN.StartLoginGUI;
import GUI.Factory.STATEDESIGN.State;

public class BookingSystem {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        GUIContext context = new GUIContext();
        State Login = new StartLoginGUI();// uses factory
        context.setState(Login);
        context.enterGUI();

    }

}
