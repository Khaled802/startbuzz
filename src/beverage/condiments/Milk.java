package beverage.condiments;

import beverage.Beverage;

public class Milk extends CondimentDecoretor {
    private double cost = 0.6;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return beverage.getCost() + cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + "Milk";
    }
    
}
