package Exercise1;

public class Electronics extends Product {
    private String length, width, height, weight;

    public Electronics(float price, float quantity, String name, String description, String length, String width, String height, String weight) {
        super(price, quantity, name, description);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String getLength() {
        return length;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }
}
