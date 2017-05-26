package oreoStore.model;

/**
 * Created by dylan on 26-5-2017.
 */
public abstract class ProductModel {
    protected String name;
    protected double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
