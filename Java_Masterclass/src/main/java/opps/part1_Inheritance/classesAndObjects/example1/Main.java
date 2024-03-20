package opps.part1_Inheritance.classesAndObjects.example1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 600);
        doAnimalStuff(animal,"Slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"Fast");

        Dog yerkie = new Dog("Yerkie",30);
        doAnimalStuff(yerkie, "Fast");

        Dog retriever = new Dog("Labrador Retriever", 67,"Floopy","Swimming");
        doAnimalStuff(retriever,"Slow");

        Fish goldie = new Fish("GoldFish", 0.24,2,3 );
        doAnimalStuff(goldie,"Fast");
    }

    public  static  void  doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("------------------");
    }
}
