/*
 * 
 * Author - Emmet
 * This class is for our activities. This is where activities are created.
 * 
 * 
 */

package User;

import java.util.ArrayList;
import java.util.List;

public class Channels {

    public List<Subscriber> subs = new ArrayList<>(); // the list of subscribers
    public String title; // the title of the activiy, ie: yoga class, zoomba
    public String dateTime; // the time and date of the activity

    /*
     * Adds the details of which subscriber has subscribed to subscribers
     */

    public void subscribe(Subscriber sub) {

        subs.add(sub);
    }

    /*
     * Removes the details of which subscriber has unsubscribed
     */

    public void unsubscribe(Subscriber sub) {

        subs.remove(sub);
    }

    /*
     * Sends update to all of the subscribers
     */

    public void notifySubscribers() {

        for (Subscriber sub : subs) {
            sub.update();
        }

    }

    /*
     * Assigns the details of the activity
     */
    public void updateActivities() {

        this.title = title;
        this.dateTime = dateTime;
        notifySubscribers();
    }
}
