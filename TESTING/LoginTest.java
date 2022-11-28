package TESTING;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import GUI.Factory.UserUI;

public class LoginTest {
    static UserUI u;

    @Test
    public void test_JUnit() throws FileNotFoundException, IOException {

        u = new UserUI();
        u.Create();

        u.userText.setText("Testing");
        u.passwordText.setText("Testing");
        u.actionPerformed(null);

        assertEquals("Succesfull Login", UserUI.loginMessage);
    }
}