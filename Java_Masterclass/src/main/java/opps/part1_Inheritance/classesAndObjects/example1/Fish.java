package opps.part1_Inheritance.classesAndObjects.example1;

public class Fish extends Animal{

    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type,"small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    public void moveMuscles(){
        System.out.println("Muscles moving..!");
    }

    public void moveBackFin(){
        System.out.println("Backfin moving..!");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "fast"){
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
