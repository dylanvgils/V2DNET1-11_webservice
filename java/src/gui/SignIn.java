package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by dylan on 23-5-2017.
 */
public class SignIn {
    private JFrame frame;
    private JPanel mainPanel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton signInBtn;
    private JButton registerBtn;

    public SignIn() {
        init();
    }

    private void init() {
        frame = new JFrame("Oreo Store - Inloggen");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Event handlers
        registerBtn.addActionListener(e -> performButtonAction(e, this::register));
        signInBtn.addActionListener(e -> performButtonAction(e, this::signIn));
    }

    private void performButtonAction(ActionEvent event, Runnable func) {
        frame.dispose();
        func.run();
    }

    private void signIn() {
        new Store();
    }

    private void register() {
        new Register();
    }
}
