/*
 * 
 * Author - Emmet
 * This class is for our subscriber, our members who are subscribed to our Activities Channel.
 * Once they are subscribed, they will be notified each time a class is added / removed from the channel.
 * 
 * 
 */

package User;

import USER.User;

public class Subscriber extends User {

    public int userID;
    public Channels channel = new Channels(); // What channels they are subscribed to

    /*
     * Everytime a new activity is added, this method will be called
     * This will notify all subscribers that a new activity has been added!
     */

    public void update() {

        System.out.println("activity has been added");

    }

    /*
     * When you subscribe to a channel (eg: activities channel), your subscribed
     * channel will be activies channel
     * This allows for more channels to be added in the future, (eg: UL Gym News)
     */

    public void subscribeChannel(Channel ch) {
        channel ch;
    }

}
