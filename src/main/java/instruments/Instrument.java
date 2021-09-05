package Items;

public abstract class Instrument {

    private String brand;
    private String name;
    private double price;
    private double sellPrice;
    private String colour;

    public Instrument(String brand, String name, double price, double sellPrice, String colour){
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.sellPrice = sellPrice;
        this. colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getColour() {
        return colour;
    }



}
