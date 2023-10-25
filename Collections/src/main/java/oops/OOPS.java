package oops;


class Pen{
    String color;
    String type; // ballPoint, gel

    public void write(){
        System.out.println("writing somthing");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}


class Student{
    String name;
    int age;

    Student() {
        System.out.println("Constructor called...");
    }

//    Constructor that initializes name and age.
    Student(String name , int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    // Copy constructor that copies values from another Student object.
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

}
public class OOPS {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Abhishek";
        s1.age = 22;

        Student s2 = new Student(s1);
        s2.printInfo();

//        Student  student = new Student("Raj", 23);
//        student.printInfo();

/*
        Student student1 = new Student();
        student1.name = "Abhishek";
        student1.age = 22;

        Student student2 = new Student();
        student2.name = "Abhi";
        student2.age = 23;

        student1.printInfo();
        student2.printInfo();
*/
/*
        Pen pen = new Pen();
        pen.color = "Blue";
        pen.type = "gel";


        Pen pen1 = new Pen();
        pen1.color = "Red";
        pen1.type = "ballPoint";

        pen.printColor();
        pen1.printColor();
*/
    }
}
