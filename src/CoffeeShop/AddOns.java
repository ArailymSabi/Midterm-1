package CoffeeShop;

import CoffeeShop.Coffee;

public class AddOns {

    public static class Milk extends CoffeeDecorator {
        public Milk(Coffee coffee) { super(coffee); }
        public double getCost() { return super.getCost() + 60; }
        public String getDescription() { return super.getDescription() + ", Молоко"; }
    }

    public static class Caramel extends CoffeeDecorator {
        public Caramel(Coffee coffee) { super(coffee); }
        public double getCost() { return super.getCost() + 50; }
        public String getDescription() { return super.getDescription() + ", Карамельный сироп"; }
    }

    public static class WhippedCream extends CoffeeDecorator {
        public WhippedCream(Coffee coffee) { super(coffee); }
        public double getCost() { return super.getCost() + 100; }
        public String getDescription() { return super.getDescription() + ", Взбитые сливки"; }
    }

    public static class Chocolate extends CoffeeDecorator {
        public Chocolate(Coffee coffee) { super(coffee); }
        public double getCost() { return super.getCost() + 50; }
        public String getDescription() { return super.getDescription() + ", Шоколадный сироп"; }
    }

    public static class Ice extends CoffeeDecorator {
        public Ice(Coffee coffee) { super(coffee); }
        public double getCost() { return super.getCost() + 50; }
        public String getDescription() { return super.getDescription() + ", Лед"; }
    }

    public static class Marshmallow extends CoffeeDecorator {
        public Marshmallow(Coffee coffee) { super(coffee); }
        public double getCost() { return super.getCost() + 200; }
        public String getDescription() { return super.getDescription() + ", Маршмеллоу"; }
    }
}
