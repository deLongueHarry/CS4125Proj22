// Author - Oliver Nagy

package USER.STATEDESIGN;

import java.io.FileNotFoundException;
import java.io.IOException;

public class GUIStateTest {

    public static void CreateUI() throws FileNotFoundException, IOException {
        GUIContext context = new GUIContext();
        State startUser = new StartMemberGUI();

        context.setState(startUser);
        context.enterGUI();

    }
}
