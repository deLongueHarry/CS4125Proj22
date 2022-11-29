/* Author - Oliver Nagy
 *  Factory method interface with the Create() method used to create UI.
 * 
 */

package GUI.Factory;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface GUI {
     void Create() throws FileNotFoundException, IOException;
}
