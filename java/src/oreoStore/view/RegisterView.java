package oreoStore.view;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by dylan on 24-5-2017.
 */
public class RegisterView {
    private JFrame frame;
    private JTextField usernameField;
    private JPanel mainPanel;
    private JButton registerBtn;

    public void init() {
        frame = new JFrame("Oreo Store - Registreren");
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

    public void resetUsernameField() {
        usernameField.setText(null);
    }

    public void addRegisterListener(ActionListener listener) {
        registerBtn.addActionListener(listener);
    }

    public void confirmRegistration(String username, String password) {
        JOptionPane.showMessageDialog(null
                ,"<html><body>"
                        + "U bent gerigistreerd! "
                        + "<br><br> Username: " + username
                        + "<br>wachtwoord: " + password
                        + "<body></html>"
                , "U bent gerigistreerd!"
                , JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void showError(String title, String message) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
    }

    public void close() {
        frame.dispose();
    }
}
