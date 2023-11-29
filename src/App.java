import beverage.Beverage;
import beverage.HouseBlend;
import beverage.Size;
import beverage.condiments.Milk;
import beverage.condiments.Mocha;

public class App {
    public static void main(String[] args) throws Exception {
        Beverage beverage = new HouseBlend(Size.NORMAL);
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage, true);
        System.out.println(beverage.getDescription());
        System.out.printf("Cost: %.2f$", beverage.getCost());
    }
}
