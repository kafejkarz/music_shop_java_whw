package instruments;

public class Violin extends Instrument{

    public Violin(String brand, double price, double sellPrice, String colour){
        super(brand, price, sellPrice, colour);
    }

    @Override
    public String canPlay() {
        return null;
    }
}
