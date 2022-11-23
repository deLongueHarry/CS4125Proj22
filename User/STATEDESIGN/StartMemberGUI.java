// Author - Oliver Nagy

package USER.STATEDESIGN;

import java.io.FileNotFoundException;
import java.io.IOException;

import GUI.Factory.MenuUI;

public class StartMemberGUI implements State {

    @Override
    public void enterGUI() throws FileNotFoundException, IOException {
        MenuUI mu =new MenuUI();
        mu.Create();

    }

}
