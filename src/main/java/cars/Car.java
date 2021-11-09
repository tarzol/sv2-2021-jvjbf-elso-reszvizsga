package cars;

public class Car {
    private String brand;
    private double engineSize;
    private int price;
    Color color;

    public Car(String brand, double engineSize, Color color, int price) {
        this.brand = brand;
        this.engineSize = engineSize;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public int getPrice() {
        return price;
    }

    public Color getColour() {
        return color;
    }

    public void decreasePrice(int percent) {
        price = (int)price*((100-percent)/100);
    }
}
