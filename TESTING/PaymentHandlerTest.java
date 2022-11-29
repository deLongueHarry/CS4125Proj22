//Author - Oliver Nagy
//Test case 3

package TESTING;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import BOOKINGSYSTEM.PaymentHandler;

public class PaymentHandlerTest {

    @Test
    public void test_JUnit() throws FileNotFoundException, IOException {
        // In this testCase we are testing our payment handler and if it redirect the
        // user to our payment portal
        PaymentHandler p = new PaymentHandler();
        p.Pay();

        assertEquals("SuccesFully Opened Payment portal", p.paymentHandlerTest);
    }
}