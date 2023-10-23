package strings;

public class Demo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(5);
        String s = "";
        if(stringBuilder.equals(s))
            System.out.println("Match 1");
        else if(stringBuilder.toString().equals(s.toString()))
            System.out.println("Match 2"); // Match 2;
        else
            System.out.println("No Match");


        // Another one
        StringBuffer sb = new StringBuffer();
        String sb1 = sb.toString();
        String sb2 = sb1;
        System.out.println(sb1 == sb2);
    }
}
