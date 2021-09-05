package instruments;

public abstract class Instrument implements IPlay{

    private String brand;
    private double price;
    private double sellPrice;
    private String colour;


    public Instrument(String brand, double price, double sellPrice, String colour){
        this.brand = brand;
        this.price = price;
        this.sellPrice = sellPrice;
        this. colour = colour;


    }

    public String getBrand() {
        return brand;
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
