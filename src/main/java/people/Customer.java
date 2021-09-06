package people;

import instruments.Guitar;
import instruments.Instrument;
import instruments.Piano;

import java.util.ArrayList;

public class Customer  {

    private String name;
    private double wallet;
    private ArrayList<Instrument> instruments;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.instruments = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public int getInstrumentsCount() {
        return this.instruments.size();
    }


    public void addInstrument(Piano piano) {
        this.instruments.add(piano);
    }

    public void buyInstrument(Piano piano) {
        addInstrument(piano);
//        if(piano.getSellPrice() < this.wallet);
        this.wallet -= piano.getSellPrice();
    }


}
