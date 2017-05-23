package gui;

import javax.swing.*;

/**
 * Created by dylan on 23-5-2017.
 */
public class SignIn {
    private JPanel mainPanel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton signInBtn;
    private JButton registerBtn;

    public SignIn() {
        init();
    }

    private void init() {
        JFrame frame = new JFrame("SignIn");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
