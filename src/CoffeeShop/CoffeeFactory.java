package CoffeeShop;

import CoffeeShop.Coffee;
import CoffeeShop.CoffeeSize;

public class CoffeeFactory {
    public static Coffee createCoffee(String type, CoffeeSize size) {
        return switch (type.toLowerCase()) {
            case "эспрессо" -> new Espresso(size);
            case "капучино" -> new Cappuccino(size);
            case "латте" -> new Latte(size);
            case "американо" -> new Americano(size);
            default -> throw new IllegalArgumentException("Неизвестный тип кофе: " + type);
        };
    }
}
