package oops.polymorphism.coffee;

import oops.polymorphism.coffee.CoffeeDrink;

class Espresso implements CoffeeDrink {
    @Override
    public void prepare() throws InterruptedException { // Add InterruptedException
        System.out.println("Preparing an espresso.");
        // Simulate preparation steps
        Thread.sleep(getPreparationTime() * 1000);
    }

    @Override
    public void serve() {
        System.out.println("Serving an espresso.");
        // Specific serving method for an espresso
    }

    @Override
    public double getPrice() {
        return 2.49; // Price for an espresso
    }

    @Override
    public String getDescription() {
        return "Espresso shot, a concentrated coffee";
    }

    @Override
    public String Description() {
        return "Espresso is a concentrated coffee shot that is known for its intense and robust flavor. It is made by forcing hot water through finely-ground coffee beans, resulting in a small, strong, and aromatic coffee. Espresso is the base for many coffee drinks, and it's a quick and powerful way to enjoy the essence of coffee.";
    }


    @Override
    public int getPreparationTime() {
        return 3; // Estimated preparation time in seconds
    }
}
