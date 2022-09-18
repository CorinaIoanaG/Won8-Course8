package Exercise1;

public class Main {
    public static void main(String[] args) {
        Cosmetics cosmetic1 = new Cosmetics(25, 22, "Face Cream", "moisture", "white",
                "100 gr");
        cosmetic1.setPrice(28);
        System.out.println(String.format("Cosmetics: %s %s, price: %f, quantity: %f", cosmetic1.getName(), cosmetic1.getWeight(),
                cosmetic1.getPrice(), cosmetic1.getQuantity()));
        Fridge fridge1 = new Fridge(1300, 10, "Arctic Fridge", "No Ice", "70 cm",
                "50 cm", "180 cm", "100 kg", "-27 grades");
        fridge1.setQuantity(fridge1.getQuantity() - 1);
        System.out.println(String.format("Fridges: %s %s %s %s, price: %f, quantity: %f", fridge1.getName(), fridge1.getDescription(),
                fridge1.getWeight(), fridge1.getTemperature(), fridge1.getPrice(), fridge1.getQuantity()));
    }
}
