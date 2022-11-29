// Author - Oliver Nagy
/* Concrete State
 * 
 * 
 */

package GUI.STATEDESIGN;

import java.io.IOException;

import GUI.Factory.GUI;
import GUI.Factory.GUIFactory;

public class StartMemberGUI implements State {

    @Override
    public void enterGUI() throws IOException {
       // We decided to use Factory method here 
        GUIFactory gui = new GUIFactory();
        GUI userMenu = gui.getGUI("User Menu");
        userMenu.Create();

    }

}
