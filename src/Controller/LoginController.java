package Controller;

import model.Cargo;
import repository.UserRepository;
import service.AutheticService;

import javax.swing.*;

import javax.swing.*;
import java.awt.*;

public class LoginController {

    AutheticService autheticService;

    public LoginController(UserRepository userReposity) {
        this.autheticService = new AutheticService(userReposity);
    }

    public Cargo loginInP() {

        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));

        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);

        int option = JOptionPane.showConfirmDialog(
                null,
                panel,
                "System Login",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );

        if (option == JOptionPane.OK_OPTION) {
            String nameInput = userField.getText();
            String passwordInput = new String(passField.getPassword());

            return autheticService.login(nameInput, passwordInput);
        }

        return null;
    }
}