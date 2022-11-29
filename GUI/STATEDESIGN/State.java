// Author - Oliver Nagy
/*  State interface and method enterGUI which will be implemented by other concrete states and the context class
 * 
 * 
 */

package GUI.STATEDESIGN;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface State {

    public void enterGUI() throws FileNotFoundException, IOException;
}
