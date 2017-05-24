package gui;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

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
        registerBtn.addActionListener(e -> register());
        signInBtn.addActionListener(e -> signin());
    }

    private void signin() {
        showMessageDialog(null, "You clicked me!");
    }

    private void register() {
        frame.dispose();
        new Register();
    }
}
