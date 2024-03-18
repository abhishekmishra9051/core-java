package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int salary;
    private String designation;

    public Employee(String name, int salary, String designation) {
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 10, "Software Engineer"));
        employees.add(new Employee("Bob", 12, "Software Engineer"));
        employees.add(new Employee("Charlie", 10, "Designer"));
        employees.add(new Employee("David", 10, "Software Engineer"));

        List<Employee> softwareEngineersWithSalary10 = employees.stream()
                .filter(employee -> "Software Engineer".equals(employee.getDesignation()))
                .map(employee -> {
                    int incrementedSalary = (int) (employee.getSalary() * 1.10);
                    return new Employee(employee.getName(), incrementedSalary, employee.getDesignation());
                })
                .collect(Collectors.toList());

        softwareEngineersWithSalary10.forEach(System.out::println);
    }
}
