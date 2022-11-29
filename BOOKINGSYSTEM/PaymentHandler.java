// Author - Oliver Nagy and Emmet Browne 
// Class to redirect user to payment gateway
package BOOKINGSYSTEM;

import java.awt.Desktop;
import java.net.URI;

public class PaymentHandler {

    public String paymentHandlerTest;

    public void Pay() {
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://buy.stripe.com/test_9AQ03k6pI9c5h0Y3cc");
            desktop.browse(oURL);
            paymentHandlerTest = "SuccesFully Opened Payment portal";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
