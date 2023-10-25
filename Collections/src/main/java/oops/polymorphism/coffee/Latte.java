package oops.polymorphism.coffee;

import oops.polymorphism.coffee.CoffeeDrink;

class Latte implements CoffeeDrink {
    @Override
    public void prepare() throws InterruptedException { // Add InterruptedException
        System.out.println("Preparing a latte.");
        // Simulate preparation steps
        Thread.sleep(getPreparationTime() * 1000);
    }

    @Override
    public void serve() {
        System.out.println("Serving a latte.");
        // Specific serving method for a latte
    }

    @Override
    public double getPrice() {
        return 3.99; // Price for a latte
    }

    @Override
    public String getDescription() {
        return null;
    }


    @Override
    public String Description() {
        return "Latte with espresso and steamed milk";
    }

    @Override
    public int getPreparationTime() {
        return 5; // Estimated preparation time in seconds
    }
}
