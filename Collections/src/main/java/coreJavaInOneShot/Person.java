package coreJavaInOneShot;

public class Person {
    // Fields
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(){}
    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }


    // Method
    public void displayDetails(){
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
        System.out.println("Address : "+address);
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void greet(){
        System.out.println("Namasta " + name + " Ji !");
    }

    public static double calculateAverageAge(Person[] people){
        int totalAge = 0;
        for(Person person : people){
            totalAge += person.age;
        }
        return (double) totalAge / people.length;
    }
}
