package instruments;

public class Guitar extends Instrument {

    public Guitar(String brand, double price, double sellPrice, String colour){
        super(brand, price, sellPrice, colour);
    }


    @Override
    public String canPlay() {
        return "guitar have six strings";
    }
}
