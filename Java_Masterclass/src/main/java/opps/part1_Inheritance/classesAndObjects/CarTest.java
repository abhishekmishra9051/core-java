package opps.part1_Inheritance.classesAndObjects;

public class CarTest {
    public static void main(String[] args) {

//        Car car = null;
//        car.setMake("Toyota"); // It will throw NullPointerException because car is null

        Car car = new Car();
//        car.make = "Tata";// Not Directly modifying the make field because it's private
        car.setMake("Honda");
        car.setModel("Honda X");
        car.setColor("Blue");
        car.setDoors(4);
        car.setConvertible(false);
        System.out.println("Make - " + car.getMake());
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getDoors());
        System.out.println(car.getColor());
        System.out.println(car.isConvertible());
        car.describeCar();

        Car car1 = new Car();

        car1.setMake("Toyota");
        car1.setModel("Toyota Y");
        car1.setColor("Red");
        car1.setDoors(4);
        car1.setConvertible(true);
        car1.describeCar();
    }
}
