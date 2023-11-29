package beverage;

public class DarkRoast implements Beverage {

    private double cost = 12;
    private Size size;

    public DarkRoast() {
        size = Size.NORMAL;
    }

    public DarkRoast(Size size) {
        this.size = size;
    }

    @Override
    public double getCost() {
       return cost * size.getValue();
    }

    @Override
    public String getDescription() {
        return size.name() + " DarkRoast Drink:";
    }
    
}
