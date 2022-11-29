//Author - Oliver Nagy
//Test case 2

package TESTING;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import GUI.Factory.AddClasses;

public class AddClassTest {

    @Test
    public void test_JUnit() throws FileNotFoundException, IOException {
        // To run test comment out line 147-150 in AddClasses.java
        // In this test case we test the AddClasses function of our system and expect
        // the class to be succefully added and written into our .csv file
        AddClasses a = new AddClasses();
        a.Create();
        a.classType = "Yoga";
        a.location = "Room1";
        a.bookingNum = "0101";
        a.price = "12 euro";
        a.addClass();

        assertEquals("Succesfully added class", a.testAddClassMessage);
    }
}