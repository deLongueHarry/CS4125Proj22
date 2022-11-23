// Author - Oliver Nagy

package USER.STATEDESIGN;

import java.io.FileNotFoundException;
import java.io.IOException;

import GUI.Factory.AdminUI;

public class StartAdminGUI implements State {

    @Override
    public void enterGUI() throws FileNotFoundException, IOException {
        AdminUI u = new AdminUI();
        u.Create();

    }

}
