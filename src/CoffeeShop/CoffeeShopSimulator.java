package CoffeeShop;

import java.util.Scanner;

public class CoffeeShopSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип кофе: эспрессо, капучино, латте, американо");
        String coffeeType = scanner.nextLine().toLowerCase();

        System.out.println("Выберите размер: SMALL, MEDIUM, LARGE");
        CoffeeSize size = CoffeeSize.valueOf(scanner.nextLine().toUpperCase());

        Coffee coffee = CoffeeFactory.createCoffee(coffeeType, size);

        boolean adding = true;
        while (adding) {
            System.out.println("Добавить добавку? (milk, caramel, whippedcream, chocolate, ice, marshmallow, нет)");
            String addOn = scanner.nextLine().toLowerCase();

            switch (addOn) {
                case "milk" -> coffee = new AddOns.Milk(coffee);
                case "caramel" -> coffee = new AddOns.Caramel(coffee);
                case "whippedcream" -> coffee = new AddOns.WhippedCream(coffee);
                case "chocolate" -> coffee = new AddOns.Chocolate(coffee);
                case "ice" -> coffee = new AddOns.Ice(coffee);
                case "marshmallow" -> coffee = new AddOns.Marshmallow(coffee);
                case "нет" -> adding = false;
                default -> System.out.println("Такой добавки нет, выберите другой.");
            }
        }

        System.out.println("\nВаш заказ: " + coffee.getDescription());
        System.out.println("Итоговая стоимость: " + coffee.getCost() + " тенге");

        scanner.close();
    }
}
