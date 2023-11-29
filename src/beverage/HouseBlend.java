package beverage;

public class HouseBlend implements Beverage{
    private double cost = 10;
    private Size size;

    public HouseBlend() {
        size = Size.NORMAL;
    }

    public HouseBlend(Size size) {
        this.size = size;
    }

    @Override
    public double getCost() {
        return cost * size.getValue();
    }

    @Override
    public String getDescription() {
        return size.name() + " HouseBlend Drink:";
    }
    
}
