// Author -Oliver Nagy
package GUI.STATEDESIGN;

import java.io.IOException;

import GUI.FACTORY.GUI;
import GUI.FACTORY.GUIFactory;

public class StartLoginGUI implements State {

    @Override
    public void enterGUI() throws IOException {
        // factory method
        GUIFactory gui = new GUIFactory();
        GUI login = gui.getGUI("Login");
        login.Create();

    }

}