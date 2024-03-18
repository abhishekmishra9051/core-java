package opps.part1_Inheritance.classesAndObjects;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Abhishek");
        person.setLastName("Mishra");
        person.setAge(25);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
    }
}

