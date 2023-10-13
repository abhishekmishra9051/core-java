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
NOTES
Objects:
        Class instantiation
        Refrence value
        References
        Objects vs Classes
        Instance Members
        Static Members

brief summary:

Class Instantiation: Creating an object (instance) of a class using the new keyword. It allocates memory and initializes instance variables.
Reference Value: It's a unique identifier (memory address) assigned to an object instance. References point to the object's location in memory.
References: Variables that hold reference values, allowing access to objects. Multiple references can point to the same object.
Objects vs Classes: Classes are blueprints defining object structure and behavior, while objects are instances of these classes, embodying specific properties and actions.
Instance Members: Characteristics (fields) and behaviors (methods) unique to each object instance, allowing them to have distinct properties and perform actions.
Static Members: Fields and methods shared across all instances of a class. They're associated with the class itself, not with individual objects.

-----------------------------------------------------------------------------------------------------------------------
JVM (Java Virtual Machine):
-- JVM is an abstract computing machine that provides the runtime environment in which Java bytecode can be executed.
   It interprets the compiled Java code (bytecode) at runtime and translates it into the machine-specific language for the operating system.
   JVM provides platform independence by allowing Java programs to run on any device or operating system that has a JVM implementation.

JRE (Java Runtime Environment):
-- JRE is the environment in which Java applications are executed.
   It includes the JVM, necessary libraries, and other components required for running Java applications.
   JRE does not contain the tools needed for Java development; it's purely for executing pre-compiled Java applications.

JDK (Java Development Kit):
-- JDK is a software development kit that includes tools and utilities to develop, compile, and run Java applications.
   It contains the JRE, compilers (javac), debuggers, development tools, and APIs needed for Java development.
   JDK is essential for Java developers to write, compile, and test their code before deploying it.

*/