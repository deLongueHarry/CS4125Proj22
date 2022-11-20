// Author - Oliver Nagy

package USER.StateDesign;

import java.io.FileNotFoundException;
import java.io.IOException;

public class GUIContext implements State {

    private State GUIState;

    public void setState(State state) {
        this.GUIState = state;

    }

    public State getState() {

        return this.GUIState;
    }

    @Override
    public void enterGUI() throws FileNotFoundException, IOException {
        this.GUIState.enterGUI();

    }

   

}
