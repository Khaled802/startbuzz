package beverage;

public class Decaf implements Beverage {
    private double cost = 8;
    private Size size;

    public Decaf() {
        size = Size.NORMAL;
    }

    public Decaf(Size size) {
        this.size = size;
    }

    @Override
    public double getCost() {
        return cost * this.size.getValue();
    }

    @Override
    public String getDescription() {
        return this.size.name() + " Decaf Drink:";
    }
    
}
