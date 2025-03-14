package CoffeeShop;

import CoffeeShop.Coffee;
import CoffeeShop.CoffeeSize;

public class Espresso implements Coffee {
    private CoffeeSize size;

    public Espresso(CoffeeSize size) {
        this.size = size;
    }

    public double getCost() {
        return switch (size) {
            case SMALL -> 600;
            case MEDIUM -> 800;
            case LARGE -> 1200;
        };
    }

    public String getDescription() {
        return "Эспрессо (" + size + ")";
    }
}