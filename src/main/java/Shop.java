import java.util.ArrayList;

public class Shop {

    private String name;
    private double till;
    private ArrayList<Isell> stock;

    public Shop(String name,double till){
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<Isell>();
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }
}
