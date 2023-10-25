package oops.polymorphism.coffee;

class Cappuccino implements CoffeeDrink {
    @Override
    public void prepare() throws InterruptedException { // Add InterruptedException
        System.out.println("Preparing a cappuccino.");
        // Simulate preparation steps
        Thread.sleep(getPreparationTime() * 1000);
    }

    @Override
    public void serve() {
        System.out.println("Serving a cappuccino.");
        // Specific serving method for a cappuccino
    }

    @Override
    public double getPrice() {
        return 4.49; // Price for a cappuccino
    }

    @Override
    public String getDescription() {
        return "Cappuccino with espresso, steamed milk, and frothy foam";
    }

    @Override
    public String Description() {
        return "A cappuccino is an espresso-based coffee drink that consists of espresso, steamed milk, and frothy foam. It is well-known for its rich and bold coffee flavor combined with the creamy texture of steamed milk and the light, airy foam on top. Cappuccinos are typically served in smaller cups and are favored by those who appreciate a strong coffee taste with a delightful mix of milk and foam.";
    }


    @Override
    public int getPreparationTime() {
        return 7; // Estimated preparation time in seconds
    }
}
