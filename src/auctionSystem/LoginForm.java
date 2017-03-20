package auctionSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Elliot on 20/03/2017.
 */
public class LoginForm {
    private JPanel panel1;
    private JTextField UsernameField;
    private JPasswordField passwordField;
    private JButton logInButton;

    public LoginForm() {
        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userNameInput = UsernameField.getText();
                String passwordInput = passwordField.getText();
                JOptionPane.showMessageDialog(null,userNameInput+"|"+passwordInput);
            }
        });
    }
}
