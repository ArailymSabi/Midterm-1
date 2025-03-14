package CoffeeShop;

import CoffeeShop.Coffee;
import CoffeeShop.CoffeeSize;

public class Cappuccino implements Coffee {
    private CoffeeSize size;

    public Cappuccino(CoffeeSize size) {
        this.size = size;
    }

    public double getCost() {
        return switch (size) {
            case SMALL -> 700;
            case MEDIUM -> 900;
            case LARGE -> 1100;
        };
    }

    public String getDescription() {
        return "Капучино (" + size + ")";
    }
}
