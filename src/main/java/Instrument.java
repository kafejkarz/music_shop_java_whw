public abstract class Instrument {

    private String name;
    private double price;
    private double sellPrice;
    private String colour;

    public Instrument(String name, double price, double sellPrice, String colour){
        this.name = name;
        this.price = price;
        this.sellPrice = sellPrice;
        this. colour = colour;
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
