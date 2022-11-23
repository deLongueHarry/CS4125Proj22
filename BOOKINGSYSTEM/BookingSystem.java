package BOOKINGSYSTEM;

import java.io.FileNotFoundException;
import java.io.IOException;

import GUI.Factory.GUI;
import GUI.Factory.GUIFactory;


public class BookingSystem {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Factory
        GUIFactory gui = new GUIFactory();
        GUI login = gui.getGUI("Login");
        try {
            login.Create();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

    }

}
