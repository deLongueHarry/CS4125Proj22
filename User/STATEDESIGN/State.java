// Author - Oliver Nagy

package USER.StateDesign;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface State {

    public void enterGUI()throws FileNotFoundException, IOException;
}
