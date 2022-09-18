package Exercise1;

public class Product {
    private float price, quantity;

    private String name, description;

    public Product(float price, float quantity, String name, String description) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getQuantity() {
        return quantity;
    }
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
}
