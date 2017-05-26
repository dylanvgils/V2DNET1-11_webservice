package oreoStore.model;

/**
 * Created by dylan on 26-5-2017.
 */
public class StoreProductModel extends ProductModel {
    private int stock;

    public StoreProductModel() {

    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return String.format("%s : %s : €%s", name, stock, price);
    }
}
