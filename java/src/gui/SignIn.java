package gui;

import javax.swing.*;

/**
 * Created by dylan on 23-5-2017.
 */
public class Signin {
    private JFrame frame;
    private JPanel mainPanel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton signInBtn;
    private JButton registerBtn;

    public Signin() {
        init();
    }

    private void init() {
        frame = new JFrame("Oreo Store - Inloggen");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Event handlers
        registerBtn.addActionListener(e -> performButtonAction(this::register));
        signInBtn.addActionListener(e -> performButtonAction(this::signin));
    }

    private void performButtonAction(Runnable func) {
        frame.dispose();
        func.run();
    }

    private void signin() {
        new Store();
    }

    private void register() {
        new Register();
    }
}
