package oreoStore.view;

import oreoStore.model.CustomerModel;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by dylan on 23-5-2017.
 */
public class SignInView {
    private CustomerModel model;

    private JFrame frame;
    private JPanel mainPanel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton signInBtn;
    private JButton registerBtn;

    public SignInView(CustomerModel customer) {
        model = customer;
    }

    public void init() {
        frame = new JFrame("Oreo StoreView - Inloggen");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Change listiners
        usernameField.addPropertyChangeListener(e -> updateModel());
        passwordField.addActionListener(e -> updateModel());
    }

    private void updateModel() {
        model.setUsername(usernameField.getText());
        model.setPassword(String.valueOf(passwordField.getPassword()));
    }

    public void addSignInListener(ActionListener listener) {
        signInBtn.addActionListener(listener);
    }

    public void addRegisterListener(ActionListener listener) {
        registerBtn.addActionListener(listener);
    }

    public void close() {
        frame.dispose();
    }
}
