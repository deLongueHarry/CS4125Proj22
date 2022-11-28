// Author - Oliver Nagy

package GUI.STATEDESIGN;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface State {

    public void enterGUI() throws FileNotFoundException, IOException;
}
