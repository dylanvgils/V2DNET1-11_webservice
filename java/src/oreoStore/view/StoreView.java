package oreoStore.view;

import oreoStore.model.CustomerProductModel;
import oreoStore.model.StoreProductModel;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Created by dylan on 24-5-2017.
 */
public class StoreView {
    private DefaultListModel<StoreProductModel> stockModel = new DefaultListModel();

    private JFrame frame;
    private JPanel mainPanel;
    private JTextArea orders;
    private JList stock;
    private JButton orderBtn;
    private JButton refreshBtn;
    private JLabel balance;
    private JTextField quantity;
    private JLabel user;

    public void init() {
        frame = new JFrame("Oreo Store");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        stock.setModel(stockModel);
    }

    public StoreProductModel getSelectedStockItem() {
        return stockModel.get(stock.getSelectedIndex());
    }

    public int getQuantity() {
        try {
            return Integer.parseInt(quantity.getText());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public void setUserValue(String user) {
        this.user.setText("Ingelogd als: " + user);
    }

    public void setBalanceValue(double balance) {
        this.balance.setText(String.format("€%1.2f", balance));
    }

    public void setOrdersValue(List<CustomerProductModel> products) {
        double totaal = 0;

        orders.setText(null);
        for (CustomerProductModel p : products) {
            orders.append(p.toString() + "\n");
            totaal += p.calcSubTotal();
        }

        orders.append(String.format("\n Totaal: €%1.2f", totaal));
    }

    public void setStockValue(List<StoreProductModel> products) {
        stockModel.clear();

        for (StoreProductModel p : products) {
            stockModel.addElement(p);
        }
    }

    public void showError(String title, String message) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
    }

    public void addRefreshListener(ActionListener listener) {
        refreshBtn.addActionListener(listener);
    }

    public void addOrderListener(ActionListener listener) {
        orderBtn.addActionListener(listener);
    }
}
