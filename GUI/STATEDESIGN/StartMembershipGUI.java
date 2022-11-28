// Author -Emmet Browne
package GUI.STATEDESIGN;

import java.io.FileNotFoundException;
import java.io.IOException;

import GUI.FACTORY.GUI;
import GUI.FACTORY.GUIFactory;

public class StartMembershipGUI implements State {

    @Override
    public void enterGUI() throws FileNotFoundException, IOException {
        // factory method
        GUIFactory gui = new GUIFactory();
        GUI Membership = gui.getGUI("Membership");
        Membership.Create();

    }

}