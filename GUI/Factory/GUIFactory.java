package GUI.Factory;

public class GUIFactory {
    // use getShape method to get object of type shape
    public GUI getGUI(String name) {
        if (name == null) {
            return null;
        }
        if (name.equalsIgnoreCase("User")) {
            return new MenuUI();

        } else if (name.equalsIgnoreCase("Register")) {
            return new RegUI();

        } else if (name.equalsIgnoreCase("Login")) {
            return new UserUI();
        } else if (name.equalsIgnoreCase("Admin")) {
            return new AdminUI();
        }

        return null;
    }
}
