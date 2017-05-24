package oreoStore.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dylan on 24-5-2017.
 */
public class StoreView {
    private JFrame frame;
    private JPanel mainPanel;
    private JTextArea textArea1;
    private JList list1;
    private JButton orderBtn;
    private JButton refreshBtn;

    public void init() {
        frame = new JFrame("Oreo StoreView");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void addRefreshListener(ActionListener listener) {
        refreshBtn.addActionListener(listener);
    }

    public void addOrderListener(ActionListener listener) {
        orderBtn.addActionListener(listener);
    }
}
