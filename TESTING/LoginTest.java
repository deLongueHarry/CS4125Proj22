package TESTING;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import GUI.FACTORY.UserUI;

public class LoginTest {
    static UserUI u;

    @Test
    public void test_JUnit() throws FileNotFoundException, IOException {

        u = new UserUI();
        u.Create();

        UserUI.userText.setText("Testing");
        UserUI.passwordText.setText("Testing");
        u.actionPerformed(null);

        assertEquals("Succesfull Login", UserUI.loginMessage);
    }
}