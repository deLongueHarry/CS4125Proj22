package USER.STATEDESIGN;

import java.io.FileNotFoundException;
import java.io.IOException;

public class GUIStateTest {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        GUIContext context = new GUIContext();
        State startAdmin = new StartAdminGUI();
        State startMember = new StartMemberGUI();

        context.setState(startAdmin);
        context.enterGUI();
        ;

        context.setState(startMember);
        context.enterGUI();

    }
}
