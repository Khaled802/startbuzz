package beverage.condiments;

import beverage.Beverage;

public abstract class CondimentDecoretor implements Beverage {
    protected Beverage beverage;

    public String getDescription() {
        return "Condiment->";
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
}
