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
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fNameText;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel sNameLabel;
    private javax.swing.JTextField sNameText;
    private javax.swing.JLabel uLabel;
    private javax.swing.JTextField usernameText;
    private javax.swing.JPanel jPanel1;

    public RegUI() {
        initRegUI();
    }

    public JPanel getJPanel1() {
        return jPanel1;
    }

    public void setJPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setloginButton(JButton loginButton) {
        this.loginButton = loginButton;
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

    public JLabel getPassLabel() {
        return passLabel;
    }

    public void setPassLabel(JLabel passLabel) {
        this.passLabel = passLabel;
    }

    public JPasswordField getPasswordText() {
        return passwordText;
    }

    public void setPasswordText(JPasswordField passwordText) {
        this.passwordText = passwordText;
    }

    public JLabel getULabel() {
        return uLabel;
    }

    public void setULabel(JLabel uLabel) {
        this.uLabel = uLabel;
    }

    public JTextField getUsernameText() {
        return usernameText;
    }

    public void setUsernameText(JTextField usernameText) {
        this.usernameText = usernameText;
    }

    private void initRegUI() {

        jPanel1 = new javax.swing.JPanel();
        fNameLabel = new javax.swing.JLabel();
        sNameLabel = new javax.swing.JLabel();
        uLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        fNameText = new javax.swing.JTextField();
        sNameText = new javax.swing.JTextField();
        usernameText = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        passwordText = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Register"));

        fNameLabel.setText("First Name: ");
        fNameLabel.setBounds(100, 10, 60, 20);

        sNameLabel.setText("Surname: ");

        uLabel.setText("Username: ");

        passLabel.setText("Password: ");

        fNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTextActionPerformed(evt);
            }
        });

        sNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sNameTextActionPerformed(evt);
            }
        });

        loginButton.setText("Register!");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        passwordText.setText("");

    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void fNameTextActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO: add handling code for actionEvent
    }

    private void sNameTextActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO: add handling code for actionEvent
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO: add handling code for actionEvent
    }

    public static void main(String[] args) {
        // set look and feel of UI - Nimbus
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            // Exceptions in case Nimbus is unavailable, stick with default look and feel
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Create and display form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegUI().setVisible(true);
            }
        });
    }

}
