package TESTING;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import GUI.FACTORY.LoginUI;

public class LoginTest {
    static LoginUI u;

    @Test
    public void test_JUnit() throws FileNotFoundException, IOException {

        u = new LoginUI();
        u.Create();

        LoginUI.userText.setText("Testing");
        LoginUI.passwordText.setText("Testing");
        u.actionPerformed(null);

        assertEquals("Succesfull Login", LoginUI.loginMessage);
    }
}