# Java Learning Roadmap

This README provides an overview of topics to learn and explore in Java. Each topic is outlined briefly to guide your learning journey.

## Core Concepts

1. [**Classes**](#classes)
    - Declaring members: fields and methods

2. [**Objects**](#objects)
    - [Class instantiation](#class-instantiation)
    - [Reference value](#reference-value)
    - [References](#references)
    - [Objects vs Classes](#objects-vs-classes)
    - [Instance Members](#instance-members)
    - [Static Members](#static-members)

3. **Compile and Run Java Applications**
    - Using the command line

4. ## JVM, JRE, JDK

   1. [Overview](#overview)
   2. [JVM (Java Virtual Machine)](#jvm)
   3. [JRE (Java Runtime Environment)](#jre)
   4. [JDK (Java Development Kit)](#jdk)

5. **Java Platform Independence**
    - Bytecode and its role

## Language Elements

6. **Lexical Tokens**
    - Identifiers
    - Keywords
    - Separators

7. **Literals**
    - Integer, Floating point, Boolean, Character, String
    - String Class
    - Immutability
    - Pooling

8. **Primitive Data Types**
    - int, char, float, boolean
    - ASCII code and Unicode
    - Variable declaration and initialization
    - Default and initial values
    - Lifetime of variables
    - Operators and expressions
    - Boxing and unboxing conversions

9. **Control Flow**
    - if, else, for, while, do-while

10. **Class and Method Declarations**
    - Instance Methods
    - Object References
    - Method Overloading

11. **Constructors**
    - Default, overloaded

12. **Main Method**
    - Command line arguments
    - Keywords: public, static, void, main

13. **Arrays**
    - Declaring, constructing, and initializing
    - Accessing array elements
    - Multidimensional and jagged arrays
    - Sorting and searching

14. **Method Parameters**
    - Passing primitive and reference values
    - Arrays as parameters
    - Final parameters and the final keyword

15. **Variable Arity Methods**
    - Calling and differences from fixed arity methods

16. **Important Topics**
    - Packages
    - Enums
    - Access specifiers
    - Static and final members
    - Method overloading

17. **Inheritance**
    - Abstract Class
    - Super Keyword
    - Instance of Keyword
    - Runtime Polymorphism
    - Method Overriding
    - Difference between Overloading and Overriding
    - Multiple Inheritance

18. **Interfaces**
    - Extending an Interface
    - Default and Static Methods
    - Constants

19. **Exception Handling**
    - Categories of exceptions
    - Try Block, Catch and Finally Clauses
    - Try with Resource

20. **Object Lifetime and Garbage Collection**
    - Object Finalization
    - Garbage Collection invocation
    - Initializers and declaration order

21. **Object Class**
    - Wrapper Classes
    - Common constructors and utility methods
    - Numeric, Character, and Boolean Wrapper Classes
    - String Builder and String Buffer

22. **Inner Classes and Lambdas**
    - Anonymous and Nested Inner Classes
    - Lambdas and Functional Programming

23. **Advanced Topics**
    - Java Streams
    - Java Generics
    - Java Collections
    - Java I/O (File Handling)

24. **Multithreading**
    - Volatile
    - Atomic Integer
    - Locks
    - Runnable and Callable
    - Executor Service
    - Async Programming
    - Futures

Feel free to explore each topic in detail. Happy learning!



# Java Concepts Overview

This README provides a brief overview of key Java concepts related to objects, JVM, JRE, and JDK. For in-depth understanding and usage, refer to the relevant Java documentation and tutorials.
## Classes <a name="classes"></a>
    Declaring members: fields and methods

```
public class Person {
    // Fields (class variables)
    private String name;  
    private int age;      

    // Constructor 
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
```

## Objects <a name="objects"></a>

- [Class instantiation](#class-instantiation)
- [Reference value](#reference-value)
- [References](#references)
- [Objects vs Classes](#objects-vs-classes)
- [Instance Members](#instance-members)
- [Static Members](#static-members)

### Class instantiation <a name="class-instantiation"></a>
Creating an object (instance) of a class using the `new` keyword. It allocates memory and initializes instance variables.

### Reference value <a name="reference-value"></a>
A unique identifier (memory address) assigned to an object instance. References point to the object's location in memory.

### References <a name="references"></a>
Variables that hold reference values, allowing access to objects. Multiple references can point to the same object.

### Objects vs Classes <a name="objects-vs-classes"></a>
Classes are blueprints defining object structure and behavior, while objects are instances of these classes, embodying specific properties and actions.

### Instance Members <a name="instance-members"></a>
Characteristics (fields) and behaviors (methods) unique to each object instance, allowing them to have distinct properties and perform actions.

### Static Members <a name="static-members"></a>
Fields and methods shared across all instances of a class. They're associated with the class itself, not with individual objects.

### Overview {#overview}

### JVM (Java Virtual Machine) {#jvm}
JVM is an abstract computing machine that provides the runtime environment in which Java bytecode can be executed. It interprets the compiled Java code (bytecode) at runtime and translates it into the machine-specific language for the operating system. JVM provides platform independence by allowing Java programs to run on any device or operating system that has a JVM implementation.

### JRE (Java Runtime Environment) {#jre}
JRE is the environment in which Java applications are executed. It includes the JVM, necessary libraries, and other components required for running Java applications. JRE does not contain the tools needed for Java development; it's purely for executing pre-compiled Java applications.

### JDK (Java Development Kit) {#jdk}
JDK is a software development kit that includes tools and utilities to develop, compile, and run Java applications. It contains the JRE, compilers (javac), debuggers, development tools, and APIs needed for Java development. JDK is essential for Java developers to write, compile, and test their code before deploying it.

For detailed information on each concept and practical usage, refer to the official Java documentation and tutorials.

Feel free to modify and structure it further as needed for your specific project or documentation needs.
