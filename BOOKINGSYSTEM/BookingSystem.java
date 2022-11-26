package BOOKINGSYSTEM;

import java.io.FileNotFoundException;
import java.io.IOException;

import GUI.Factory.AddClasses;
import GUI.Factory.BookClassUI;
import USER.STATEDESIGN.GUIContext;
import USER.STATEDESIGN.StartLoginGUI;
import USER.STATEDESIGN.State;

public class BookingSystem {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // GUIContext context = new GUIContext();
        // State Login = new StartLoginGUI();// uses factory
        // context.setState(Login);
        // context.enterGUI();

        BookClassUI a = new BookClassUI();
        a.Create();

    }

}
