package oreoStore.Service;

import oreoStore.model.CustomerModel;
import oreoStore.model.CustomerProductModel;
import oreoStore.model.StoreProductModel;
import org.datacontract.schemas._2004._07.storagelogiclibrary.CustomerProduct;
import org.datacontract.schemas._2004._07.storagelogiclibrary.StoreProduct;
import org.tempuri.IStoreService;
import org.tempuri.StoreService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dylan on 26-5-2017.
 */
public class Service {
    private final static IStoreService service = new StoreService().getBasicHttpBindingIStoreService();

    public static CustomerModel registerCustomer(CustomerModel c) {
        c.setPassword(service.register(c.getUsername()));
        if (!c.getPassword().equalsIgnoreCase("error")) return c;
        return null;
    }

    public static boolean checkLogin(CustomerModel c) {
        return service.checkLogin(c.getUsername(), c.getPassword());
    }

    public static List<StoreProductModel> getProducts() {
        List<StoreProductModel> products = new ArrayList<>();
        for (StoreProduct p : service.getProducts().getStoreProduct()) {
            StoreProductModel product = new StoreProductModel();
            product.setName(p.getName().getValue());
            product.setPrice(p.getPrice());
            product.setStock(p.getStock());
            products.add(product);
        }

        return products;
    }

    public static double getBalance(String username) {
        return service.getBalance(username);
    }

    public static List<CustomerProductModel> getOrders(String username) {
        List<CustomerProductModel> products = new ArrayList<>();
        for (CustomerProduct p : service.getAllOrders(username).getCustomerProduct()) {
            CustomerProductModel product = new CustomerProductModel();
            product.setName(p.getName().getValue());
            product.setPrice(p.getPrice());
            product.setQuantity(p.getQuantity());
            products.add(product);
        }

        return products;
    }

    public static boolean buyProduct(String username, String productName, int quantity) {
        return service.buyProduct(username, productName, quantity);
    }
}
