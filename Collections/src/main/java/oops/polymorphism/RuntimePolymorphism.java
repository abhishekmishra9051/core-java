package oops.polymorphism;

class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark"); // Dog-specific sound
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow"); // Cat-specific sound
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Polymorphism: Dog treated as an Animal
        Animal animal2 = new Cat(); // Polymorphism: Cat treated as an Animal

        animal1.makeSound(); // Bark (specific to Dog)
        animal2.makeSound(); // Meow (specific to Cat)
    }
}

