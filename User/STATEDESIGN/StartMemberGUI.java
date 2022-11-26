// Author - Oliver Nagy

// Author -Oliver Nagy
package USER.STATEDESIGN;

import java.io.FileNotFoundException;
import java.io.IOException;

import GUI.Factory.GUI;
import GUI.Factory.GUIFactory;

public class StartMemberGUI implements State {

    @Override
    public void enterGUI() throws FileNotFoundException, IOException {
        // factory method
        GUIFactory gui = new GUIFactory();
        GUI userMenu = gui.getGUI("User Menu");
        userMenu.Create();

    }

}
