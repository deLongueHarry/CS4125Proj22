// Author - Oliver Nagy

package GUI.STATEDESIGN;

import java.io.FileNotFoundException;
import java.io.IOException;

import GUI.FACTORY.GUI;
import GUI.FACTORY.GUIFactory;

public class StartAddClassGUI implements State {

    @Override
    public void enterGUI() throws FileNotFoundException, IOException {

        // factory method
        GUIFactory gui = new GUIFactory();
        GUI addClass = gui.getGUI("Add Class");
        addClass.Create();

    }

}