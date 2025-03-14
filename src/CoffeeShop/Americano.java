package CoffeeShop;

import CoffeeShop.Coffee;
import CoffeeShop.CoffeeSize;

public class Americano implements Coffee {
    private CoffeeSize size;

    public Americano(CoffeeSize size) {
        this.size = size;
    }

    public double getCost() {
        return switch (size) {
            case SMALL -> 600;
            case MEDIUM -> 800;
            case LARGE -> 1000;
        };
    }

    public String getDescription() {
        return "Американо (" + size + ")";
    }
}
