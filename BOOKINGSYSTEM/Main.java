package BOOKINGSYSTEM;

import java.io.FileNotFoundException;
import java.io.IOException;

import GUI.Factory.UserUI;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        UserUI u = new UserUI();
        u.Create();

    }

}