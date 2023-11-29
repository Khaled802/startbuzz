package beverage.condiments;

import beverage.Beverage;

public class Mocha extends CondimentDecoretor {
    private double cost = 0.3;
    private boolean doubleSize;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        doubleSize = false;
    }

    public Mocha(Beverage beverage, boolean doubleSize) {
        this.beverage = beverage;
        this.doubleSize = doubleSize;
    }

    @Override
    public double getCost() {
        return beverage.getCost() + (doubleSize?cost*2:cost);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + (doubleSize?" double ": " ") + "Mocha";
    }
}
