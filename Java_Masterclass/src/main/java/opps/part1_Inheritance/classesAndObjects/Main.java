package opps.part1_Inheritance.classesAndObjects;

public class Main extends Object {
    public static void main(String[] args) {
        Students max = new Students("Max", 23);
        System.out.println(max);

        PrimarySchoolStudent primarySchoolStudent =new PrimarySchoolStudent("Abhi", 34,"MR. U.Mishra");
        System.out.println(primarySchoolStudent);
    }
}

class Students{
   private String name;
   private int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class PrimarySchoolStudent extends Students{
    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName+"'s kid, "+super.toString();
    }
}
