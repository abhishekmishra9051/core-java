package oops.polymorphism;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    }

    public String add(String a, String b){
        return a + b;
    }
}
public class CompileTimePolymorphism {
    public static void main(String[] args) {

        MathOperations math = new MathOperations();

        int result1 = math.add(3, 5);
        double result2 = math.add(3.5, 2.5);
        int result3 = math.add(1, 2, 3);
        String result4 = math.add("Hello, ", "World!");

        System.out.println("Result 1: " + result1); // Output: 8
        System.out.println("Result 2: " + result2); // Output: 6.0
        System.out.println("Result 3: " + result3); // Output: 6
        System.out.println("Result 4: " + result4); // Output: Hello, World!

    }

}
