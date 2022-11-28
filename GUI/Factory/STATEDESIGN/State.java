// Author - Oliver Nagy

package GUI.Factory.STATEDESIGN;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface State {

    public void enterGUI() throws FileNotFoundException, IOException;
}
