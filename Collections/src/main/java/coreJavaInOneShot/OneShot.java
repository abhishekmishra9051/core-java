package coreJavaInOneShot;

public class OneShot {


    public static void main(String[] args) {

/*
    1. Classes:
    Declaring members: fields and methods
 */
        Person person = new Person("Abhishek", 21, "2214, Sector 71, Mohali");
        person.greet();
        person.setAge(22);
        person.displayDetails();
        System.out.println(person.getName());

        Person[] people = {
                new Person("Abhishek " , 22,  "2214, Sector 71, Mohali"),
                new Person("Raj " , 23,  "2215, Sector 71, Mohali")
            };
        // Using a static method to calculate average age
        double averageAge = Person.calculateAverageAge(people);
        System.out.println("Average Age: " + averageAge);
    }
}

/*

*/