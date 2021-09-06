import behaviours.ISell;

import java.util.ArrayList;

public class Shop implements ISell {

    private String name;
    private double till;
    private ArrayList<ISell> stock;

    public Shop(String name,double till){
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    @Override
    public double shopIncome() {
        return 0;
    }

}
