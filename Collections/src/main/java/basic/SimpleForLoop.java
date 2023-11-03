package basic;

public class SimpleForLoop {
    public static void main(String [] args){
        int count =0;
        int sum = 0;
        for(int i=1; i<=10; i++) {
            sum += i;
            count++;
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
