package instruments;


import behaviours.IPlay;

public class Piano extends Instrument  implements IPlay {

    public Piano(String brand, double price, double sellPrice, String colour){
        super(brand, price, sellPrice, colour);
    }

    @Override
    public String canPlay() {
        return "nice sound";
    }
}
