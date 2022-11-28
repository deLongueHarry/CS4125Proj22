package GUI.Factory;

public class GUIFactory {

    public GUI getGUI(String name) {
        if (name == null) {
            return null;
        }
        if (name.equalsIgnoreCase("User Menu")) {
            return new MenuUI();

        } else if (name.equalsIgnoreCase("Register")) {
            return new RegUI();

        } else if (name.equalsIgnoreCase("Login")) {
            return new UserUI();
        } else if (name.equalsIgnoreCase("Admin")) {
            return new AdminUI();
        } else if (name.equalsIgnoreCase("Book Class")) {
            return new BookClassUI();
        } else if (name.equalsIgnoreCase("Add Class")) {
            return new AddClasses();
        } else if (name.equalsIgnoreCase("Membership")) {
            return new MembershipUI();
        } else if (name.equalsIgnoreCase("Offer")) {
            return new OfferWindow();

        }

        return null;
    }
}
