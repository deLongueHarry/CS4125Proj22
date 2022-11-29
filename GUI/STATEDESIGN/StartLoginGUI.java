// Author -Oliver Nagy
/* Concrete State
 * 
 * 
 */
package GUI.STATEDESIGN;

import java.io.IOException;

import GUI.FACTORY.GUI;
import GUI.FACTORY.GUIFactory;

public class StartLoginGUI implements State {

    @Override
    public void enterGUI() throws IOException {
        // We decided to use Factory method here 
        GUIFactory gui = new GUIFactory();
        GUI login = gui.getGUI("Login");
        login.Create();

    }

}