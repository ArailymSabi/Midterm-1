package CoffeeShop;

import CoffeeShop.Coffee;
import CoffeeShop.CoffeeSize;

public class Latte implements Coffee {
    private CoffeeSize size;

    public Latte(CoffeeSize size) {
        this.size = size;
    }

    public double getCost() {
        return switch (size) {
            case SMALL -> 800;
            case MEDIUM -> 100;
            case LARGE -> 1200;
        };
    }

    public String getDescription() {
        return "Латте (" + size + ")";
    }
}