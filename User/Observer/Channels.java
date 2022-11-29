/*
 * 
 * Author - Emmet
 * This class is for our activities. This is where activities are created.
 * 
 * 
 */

package User.Observer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Channels {

    public List<Subscriber> subs = new ArrayList<>(); // the list of subscribers
    public String title; // the title of the activiy, ie: yoga class, zoomba
    public String dateTime; // the time and date of the activity

    /*
     * Adds the details of which subscriber has subscribed to subscribers
     * Attaches user to sub, they will now receive notifications for each class
     * added
     */

    public void attach(Subscriber sub) {

        subs.add(sub);

    }

    /*
     * Removes the details of which subscriber has unsubscribed
     * Detaches subscriber from channel, they will no longer receive notificaitons
     */

    public void detach(Subscriber sub) {
        subs.remove(sub);
    }

    /*
     * Sends update to all of the subscribers
     * 
     */

    public void notifySubscribers() throws FileNotFoundException, IOException {

        for (Subscriber sub : subs) {
            sub.update();
        }

    }

    /*
     * Assigns the details of the activity
     */
    public void updateActivities() throws FileNotFoundException, IOException {

        notifySubscribers();
    }
}
