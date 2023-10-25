package oops.polymorphism.coffee;

interface CoffeeDrink {
    void prepare() throws InterruptedException; // Add InterruptedException
    void serve();
    double getPrice();
    String getDescription();

    String Description();

    int getPreparationTime(); // New method for simulation
}
