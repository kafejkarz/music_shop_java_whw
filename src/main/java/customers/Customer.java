package customers;

import instruments.Instrument;
import instruments.Piano;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<Instrument> costam;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.costam = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public int getInstrumentsCount() {
        return this.costam.size();
    }
}
