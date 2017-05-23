import javax.swing.*;

/**
 * Created by dylan on 23-5-2017.
 */
public class OreoStore {
    private JPanel mainPanel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton signInBtn;
    private JButton registerBtn;

    public static void main(String[] args) {
        JFrame frame = new JFrame("OreoStore");
        frame.setContentPane(new OreoStore().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
