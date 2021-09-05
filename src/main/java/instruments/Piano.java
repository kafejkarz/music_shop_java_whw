package instruments;



public class Piano extends Instrument {

    public Piano(String brand, double price, double sellPrice, String colour){
        super(brand, price, sellPrice, colour);
    }


    @Override
    public String canPlay() {
        return null;
    }
}
