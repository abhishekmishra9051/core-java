package oops.polymorphism.coffee;

class CoffeeOrder {
    public void prepareAndServe(CoffeeDrink drink) {
        try {
            drink.prepare();
            System.out.println("Waiting for " + drink.getPreparationTime() + " seconds...");
            drink.serve();
            System.out.println("Price: $" + drink.getPrice());
            System.out.println("Description: " + drink.getDescription());
        } catch (InterruptedException e) {
            System.out.println("Coffee preparation interrupted.");
        }
    }
}
