package oreoStore.model;

import java.util.List;

/**
 * Created by dylan on 26-5-2017.
 */
public class StoreModel {
    private CustomerModel customer;
    private List<StoreProductModel> products;
    private List<CustomerProductModel> orders;

    public StoreModel(CustomerModel customerModel) {
        customer = customerModel;
    }

    public String getUsername() {
        return customer.getUsername();
    }

    public double getBalance() {
        return customer.getBalance();
    }

    public void setBalance(double balance) {
        customer.setBalance(balance);
    }

    public List<StoreProductModel> getProducts() {
        return products;
    }

    public void setProducts(List<StoreProductModel> products) {
        this.products = products;
    }

    public List<CustomerProductModel> getOrders() {
        return orders;
    }

    public void setOrders(List<CustomerProductModel> orders) {
        this.orders = orders;
    }
}
