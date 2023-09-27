package practics;

public class Logics {
    public static void main(String[] args) {
        int n = 10;
        for(int i=0; i<n; i++){
            System.out.print(fibonacci(i)+" ");
        }
        //printFibonacciSeries(n);

        int number = 123456789;
        int revNumber = reverseNumber(number);
        System.out.println(revNumber);
    }

    private static int reverseNumber(int number) {
        return 0;
    }

    private static int fibonacci(int n) {
        if(n == 0) return 0;
        else if (n==1)  return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static void printFibonacciSeries(int n) {
        int first = 0;
        int second = 1;
        System.out.print(first+" "+ second+ " ");
        for (int i=3; i<=n; i++){
            int third = first + second;
            System.out.print(third+" ");
            first = second;
            second = third;
        }

    }
}
