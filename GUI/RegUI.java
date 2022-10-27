package GUI;

//import necessary packages
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//** Author: Harry */
public class RegUI extends javax.swing.JFrame {

    // Variable Declaration
    private javax.swing.JButton backButton;
    private javax.swing.JLabel eLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fNameText;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel pLabel;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField phoneText;
    private javax.swing.JLabel sNameLabel;
    private javax.swing.JTextField sNameText;
    private javax.swing.JLabel uLabel;
    private javax.swing.JTextField usernameText;
    private javax.swing.JPanel jPanel1;

    public RegUI() {
        initRegUI();
    }

    public JLabel getFNameLabel() {
        return fNameLabel;
    }

    public void setFNameLabel(JLabel fNameLabel) {
        this.fNameLabel = fNameLabel;
    }

    public JTextField getFNameTextField() {
        return fNameText;
    }

    public void setFNameTextField(JTextField fNameText) {
        this.fNameText = fNameText;
    }

    public JLabel getSNameLabel() {
        return sNameLabel;
    }

    public void setSNameLabel(JLabel sNameLabel) {
        this.sNameLabel = sNameLabel;
    }

    public JTextField getSNameTextField() {
        return sNameText;
    }

    public void setSNameTextField(JTextField sNameText) {
        this.sNameText = sNameText;
    }

    public JLabel getELabel() {
        return eLabel;
    }

    public void setELabel(JLabel eLabel) {
        this.eLabel = eLabel;
    }

    private void initRegUI() {

    }
}
