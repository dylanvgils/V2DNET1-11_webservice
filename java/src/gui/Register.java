package gui;

import javax.swing.*;

/**
 * Created by dylan on 24-5-2017.
 */
public class Register {
    private JFrame frame;
    private JTextField usernameField;
    private JPanel mainPanel;
    private JButton registerBtn;

    public Register() {
        init();
    }

    public void init() {
        frame = new JFrame("Oreo Store - Registreren");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Event handlers
        registerBtn.addActionListener(e -> register());
    }

    private void register() {
        JOptionPane.showMessageDialog(null
                ,"<html><body>"
                        + "U bent gerigistreerd! "
                        + "<br><br> Username: " + usernameField.getText()
                        + "<br>wachtwoord: " + usernameField.getText()
                        + "<body></html>"
                , "U bent gerigistreerd!"
                , JOptionPane.INFORMATION_MESSAGE
        );

        frame.dispose();
        new SignIn();
    }
}
