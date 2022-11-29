//Author - Oliver Nagy
//Test case 1

package TESTING;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import GUI.FACTORY.LoginUI;

public class LoginTest {

    @Test
    public void test_JUnit() throws FileNotFoundException, IOException {
        // For this test case you need to comment out line 115&114 in LoginUI as the
        // input fields there would be empty
        // Here were are testing the if the login works
        // We entered a username and password combinition which is invalid and therefore
        // we are expecting "Unsuccessfull Login" as our result
        LoginUI u = new LoginUI();
        u.Create();

        u.userName = "Noone";
        u.password = "";
        u.actionPerformed(null);

        assertEquals("Unsuccessfull Login", u.testLoginMessage);
    }
}