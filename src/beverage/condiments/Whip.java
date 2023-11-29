package beverage.condiments;

public class Whip extends CondimentDecoretor {
    private double cost = 0.2;

    @Override
    public double getCost() {
       return beverage.getCost() + cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + "Whip";
    }
    
}
