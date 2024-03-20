package opps.part1_Inheritance.classesAndObjects.challenge1;

public class Employee extends Worker{
    private long employeeId;
    private  String hiredDate;

    public Employee(String name, String birthDate, long employeeId, String hiredDate) {
        super(name, birthDate);
        this.employeeId = employeeId;
        this.hiredDate = hiredDate;
    }




}
