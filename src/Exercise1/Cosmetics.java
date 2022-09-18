package Exercise1;

public class Cosmetics extends Product {
    private String color, weight;

    public Cosmetics(float price, float quantity, String name, String description, String color, String weight) {
        super(price, quantity, name, description);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public String getWeight() {
        return weight;
    }
}

