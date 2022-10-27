package GUI;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UserUI extends javax.swing.JPanel {
    // Variable declaration .. open to discussion
    private JButton loginButton;
    private JPanel jPanel1;
    private JPasswordField passwordField;
    private JLabel passwordLabel;
    private JTextField usernameTextField;
    private JButton regButton;
    private JLabel usernameLabel;

    public JPanel getJPanel1() {
        return jPanel1;
    }

    public void setJPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JLabel getPasswordLabel() {
        return passwordLabel;
    }

    public void setPasswordLabel(JLabel passwordLabel) {
        this.passwordLabel = passwordLabel;
    }

    public JTextField getUsernameTextField() {
        return usernameTextField;
    }

    public void setUsernameTextField(JTextField usernameTextField) {
        this.usernameTextField = usernameTextField;
    }

    public JLabel getUsernamelabel() {
        return usernameLabel;

    }

    public void setUsernameLabel(JLabel usernameLabel) {
        this.usernameLabel = usernameLabel;
    }

    public JButton getRegButton() {
        return regButton;
    }

    public void setRegButton(JButton regButton) {
        this.regButton = regButton;
    }

    /*
     * Creates new form UserUI
     * Author: Harry
     */

    public UserUI() {
        initUserUI();
    }

    private void initUserUI() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setLayout(null);
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        regButton = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));

        usernameLabel.setText("Username: ");
        usernameLabel.setBounds(100, 8, 70, 20);
        jPanel1.add(usernameLabel);

        usernameTextField.setText("");
        usernameTextField.setBounds(100, 27, 190, 28);
        jPanel1.add(usernameTextField);

        passwordLabel.setText("Password: ");
        passwordLabel.setBounds(100, 55, 70, 20);
        jPanel1.add(passwordLabel);

        passwordField.setText("");
        passwordField.setBounds(100, 75, 193, 28);
        jPanel1.add(passwordField);

        loginButton.setText("Login");
        loginButton.setBounds(100, 110, 90, 25);
        loginButton.setForeground(Color.white);
        loginButton.setBackground(Color.black);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtionActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton);

        regButton.setText("Register: ");
        regButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regButtonActionPerformed(evt);
            }
        });

    }

    private void loginButtionActionPerformed(java.awt.event.ActionEvent evt) {
        String username = usernameTextField.getText();
        String password = passwordField.getText();
    }

    private void regButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String username = usernameTextField.getText();
        String password = passwordField.getText();
    }

}
