package Exercise1;

public class Fridge extends Electronics{
    private String temperature;

    public Fridge(float price, float quantity, String name, String description, String length, String width, String height, String weight, String temperature) {
        super(price, quantity, name, description, length, width, height, weight);
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }
}
