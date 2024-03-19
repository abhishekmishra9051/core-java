package opps.part1_Inheritance.classesAndObjects;

public class Student {
    private int id;
    private String name;
    private String dob;
    private String classList;

    public Student(int id, String name, String dob, String classList) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }
}
