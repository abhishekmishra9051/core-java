package opps.part1_Inheritance.classesAndObjects.example1;

public class Dog extends Animal{
    private String earShape;
    private String tailShape;

    public Dog(){
        super("RAX", "Fast", 200);
    }

    public Dog(String type, double weight){
        this(type, weight,"Perky","Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type,weight < 15 ? "Small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
