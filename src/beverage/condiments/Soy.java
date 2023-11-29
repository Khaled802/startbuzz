package beverage.condiments;

import beverage.Beverage;

public class Soy extends CondimentDecoretor {
    private double cost = 0.1;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return beverage.getCost() + cost;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + "Soy";
    }
}
