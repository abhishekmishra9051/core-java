package oops.polymorphism.coffee;

import oops.polymorphism.coffee.CoffeeOrder;
import oops.polymorphism.coffee.Latte;
import oops.polymorphism.coffee.Cappuccino;
import oops.polymorphism.coffee.CoffeeDrink;
import oops.polymorphism.coffee.Espresso;

public class Starbucks {
    public static void main(String[] args) {
        CoffeeOrder order = new CoffeeOrder();

        CoffeeDrink latte = new Latte();
        CoffeeDrink cappuccino = new Cappuccino();
        CoffeeDrink espresso = new Espresso();

        order.prepareAndServe(latte);
        order.prepareAndServe(cappuccino);
        order.prepareAndServe(espresso);
    }
}
