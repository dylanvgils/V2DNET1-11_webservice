package oreoStore.view;

import oreoStore.Controller.RegisterController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dylan on 23-5-2017.
 */
public class SignInView {
    private JFrame frame;
    private JPanel mainPanel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton signInBtn;
    private JButton registerBtn;

    public void init() {
        frame = new JFrame("Oreo StoreView - Inloggen");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
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
