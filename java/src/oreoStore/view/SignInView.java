package oreoStore.view;

import javax.swing.*;
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

    public String getUsernameFieldValue() {
        return usernameField.getText();
    }

    public String getPasswordFieldValue() {
        return String.copyValueOf(passwordField.getPassword());
    }

    public void clearPasswordField() {
        passwordField.setText(null);
    }

    public void addSignInListener(ActionListener listener) {
        signInBtn.addActionListener(listener);
    }

    public void addRegisterListener(ActionListener listener) {
        registerBtn.addActionListener(listener);
    }

    public void showError(String title, String message) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
    }

    public void close() {
        frame.dispose();
    }
}
