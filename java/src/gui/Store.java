package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by dylan on 24-5-2017.
 */
public class Store {
    private JFrame frame;
    private JPanel mainPanel;
    private JTextArea textArea1;
    private JList list1;
    private JButton orderBtn;
    private JButton refreshBtn;

    public Store() {
        init();
    }

    private void init() {
        frame = new JFrame("Oreo Store");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Event handlers
        refreshBtn.addActionListener(e -> performButtonAction(e, this::refreshFrame));
        orderBtn.addActionListener(e -> performButtonAction(e, this::order));
    }

    private void performButtonAction(ActionEvent event, Runnable func) {
        func.run();
    }

    private void refreshFrame() {

    }

    private void order() {

    }
}
