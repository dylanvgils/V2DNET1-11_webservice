package oreoStore.model;

/**
 * Created by dylan on 26-5-2017.
 */
public class CustomerProductModel extends ProductModel {
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calcSubTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("%sx : %s : €%3.2f", quantity, name, calcSubTotal());
    }
}
