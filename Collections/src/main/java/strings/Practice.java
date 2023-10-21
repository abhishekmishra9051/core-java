package strings;

public class Practice {
    public static void main(String[] args) {

//        After Using final  it's mutable -> Ever StringBuffer is final still the content is modified
        final StringBuffer stringBuffer = new StringBuffer("Coder");
        stringBuffer.append("LetsCode");
        System.out.println(stringBuffer); //CoderLetsCode

//        stringBuffer = new StringBuffer(" And be Pro"); // Cannot assign a value to final variable 'stringBuffer'

        System.out.println("Example ----");
        String s1 = "A"; // A
        s1 = s1.concat("B"); //AB
        String s2 = "C"; // C
        s1 = s1.concat(s2); //ABC
        s1.replace("C","D");// AB+D -> ABC
        s1 = s1.concat(s2); // ABC+C
        System.out.println(s1); // ABCC

        String str = " ";
        str.trim();
        System.out.println(str.equals("")+"..."+str.isEmpty()); // false...false

        String s = "Abhishek  Mishra"; // 2 space there 8 + 2 + 5 = 16
        int len = s.trim().length();
        System.out.println(len); // 16

        String s3 = "Coder LetsCode"; // 5th index
        s3.trim();
        int index = s3.indexOf(" ");
        System.out.println(index);

        String s4 = "Coder";
        String s5 = new String("coder");
        if(s4.equalsIgnoreCase(s5))
            System.out.println("Equal"); // Equal
        else
            System.out.println("Not Equal");

    }
}
