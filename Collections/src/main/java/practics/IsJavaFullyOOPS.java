package practics;

public class IsJavaFullyOOPS {
    private static String message = "Abhishek";
    public static void main(String[] args) {
//    Calling message Instance variable without Creating object
        System.out.println(message);
//        Calling Demo() static method without object
        Demo();
    }

    private static void Demo() {
        System.out.println("Thia is a static method");
    }
}
