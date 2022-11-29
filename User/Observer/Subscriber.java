/*
 * 
 * Author - Emmet
 * This class is for our subscriber, our members who are subscribed to our Activities Channel.
 * Once they are subscribed, they will be notified each time a class is added / removed from the channel.
 * 
 * 
 */

package User.Observer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.Channel;
import java.time.LocalDate;

import GUI.STATEDESIGN.GUIContext;
import GUI.STATEDESIGN.StartOfferGUI;
import GUI.STATEDESIGN.State;
import User.User;

public class Subscriber extends User {

    public Subscriber(String userID, String username, LocalDate startDate, LocalDate endDate, LocalDate DOB,
            String userType) {
        super(userID, username, startDate, endDate, DOB, userType);
    }

    public int userID;
    public Channels channel = new Channels(); // What channels they are subscribed to

    /*
     * Everytime a new activity is added, this method will be called
     * This will notify all subscribers that a new activity has been added!
     */

    public void update() throws FileNotFoundException, IOException {
        GUIContext context = new GUIContext();
        State Offer = new StartOfferGUI();// uses factory
        context.setState(Offer);
        context.enterGUI();

    }

    /*
     * When you subscribe to a channel (eg: activities channel), your subscribed
     * channel will be activies channel
     * This allows for more channels to be added in the future, (eg: UL Gym News)
     */

    public void subscribeChannel(Channel ch) {

    }

}
