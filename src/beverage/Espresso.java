package beverage;

public class Espresso implements Beverage {
    private double cost = 7;
    private Size size;

    public Espresso() {
        size = Size.NORMAL;
    }

    public Espresso(Size size) {
        this.size = size;
    }

    @Override
    public double getCost() {
        return cost * size.getValue();
    }

    @Override
    public String getDescription() {
        return size.name() +" Espresso Drink:";
    }
    
}
