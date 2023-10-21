package strings;


import java.awt.*;

public class LearnString {
    public static void main(String[] args){
        String str = "Abhishek";
        String str1 = new String("Abhishek");
        String str3 = str1.concat("Mishra");
        System.out.println( str +" : "+str.hashCode()); //Abhishek @hachCode of str and str1 is same
        System.out.println( str1 +" : "+str1.hashCode()); // Abhishek
        System.out.println( str3 +" : "+str3.hashCode()); // AbhishekMishra

        System.out.println(str.equals(str3)); // false
        System.out.println(str.equals(str1)); // true
        System.out.println(str1.equals(str3)); // false

//        Immutable and Mutable

        String s = new String("Coder");
        s.concat(s);
        System.out.println("String is Immutable"+" : "+ s); // Coder

        StringBuilder sb = new StringBuilder("Coder");
        sb.append("LetsCode");
        System.out.println("StringBuilder is Mutable"+" : "+sb);  // CoderLetsCode

        StringBuffer stringBuffer = new StringBuffer("Coder");
        stringBuffer.append("LetsCode");
        System.out.println("StringBuffer is Mutable"+" : "+stringBuffer);  // CoderLetsCode

//        == and .equals() method

        String s1 = new String("Coder");
        String s2 = new String("Coder");
        System.out.println(s1 == s2); // false
        System.out.println(s1+" : "+s1.hashCode());
        System.out.println(s2+" : "+s2.hashCode());
        System.out.println("The content in s1 and s2 ->  "+s1+" and "+s2+" is same"+" : "+s1.equals(s2)); // true

        StringBuffer stringBuffer1 = new StringBuffer("Coder");
        StringBuffer stringBuffer2 = new StringBuffer("Coder");
        System.out.println(stringBuffer1 == stringBuffer2); //false
        System.out.println(stringBuffer1.hashCode());
        System.out.println(stringBuffer2.hashCode());
        System.out.println("The content in stringBuffer1 and stringBuffer2 ->  "
                +stringBuffer1+" and "+stringBuffer2+" is same but  different location, because it's not overriden the equals method in stringBuffer and StringBuilder"+
                " : "+stringBuffer1.equals(stringBuffer2)); // false -> it also used for reference / address comparison

        StringBuilder  stringBuilder = new StringBuilder("Coder");
        StringBuilder stringBuilder1 = new StringBuilder("Coder");
        System.out.println(stringBuilder == stringBuilder1); // false
        System.out.println(stringBuilder.equals(stringBuilder1)); // false
        System.out.println(stringBuilder.hashCode());
        System.out.println(stringBuilder1.hashCode());


//        heap memory and string pool
        String s3 = new String("Coder"); // 2 object will created ( one is in heap and another is in string constant pool)
        String s4 = "Coder"; // Only one in Pool.

        System.out.println("Example -> Heap memory and string pool");
        String s5 = new String("Coder"); // 2 object is created
        String s6 = new String("Coder"); // 1 object is created, note we ever the new keyword is used, It's compulsory 1 object is created in the  heap memory.
        String s7 = "Coder"; // Assign the reference of s5
        String s8 = "Coder"; // Assign the reference of s5
        System.out.println(s5.hashCode());
        System.out.println(s6.hashCode());
        System.out.println(s7.hashCode());
        System.out.println(s8.hashCode());

        System.out.println(s5.equals(s7)); // true  --> same value / value comparison
        System.out.println(s5.equals(s6)); // true
        System.out.println(s5.equals(s8)); // true

        System.out.println(s5 == s6); // false
        System.out.println(s5 == s7); // false
        System.out.println(s5 == s8); // false; --> one in pool and another is in the heap memory so different reference
        System.out.println(s7 == s8); // true --> both in pool so only one reference

        System.out.println( "More Examples");
//        Heap memory ->  Coder , CoderLets, CoderCode (total 6 object is created) and now s9 referring to CoderCode. then (Coder , CoderLets) are eligible for gc.
//        String Pool ->  Coder Lets , Code
        String s9 = new String("Coder"); // 2 objects
        s9.concat("Lets"); // 2 objects
        s9 = s9.concat("Code"); // 2 objects

//        Heap memory ->   Spring, SpringFall, SpringWinter, SpringWinterSummer
//        String Pool ->   Spring, Fall, Winter, Summer
//        s10 -> Spring
//        s11 -> SpringWinter

        String s10 = new String("Spring"); // 2 Objects
        s10.concat("Fall"); // 2 Objects
        String s11 = s10.concat("Winter"); // 2 Objects
        s11.concat("Summer"); // 2 Objects

        System.out.println(s10); // Spring
        System.out.println(s11); // SpringWinter

        System.out.println("More Examples of String");
        String s12 = new String("You can not change me!");
        String s13 = new String("You can not change me!");
        System.out.println(s12 == s13); // false

        String s14 = "You can't change me!";
        System.out.println(s12 == s13); // false

        String s15 = "You can't change me!";
        System.out.println(s14 == s15); // true

        String s16 = "You can't" + " change me!";
        System.out.println(s16);
        System.out.println(s15 == s16); // true -> if both consent then it refers to the same memory location.

        String s17 = "You can't";
        String s18 = s17 + " Change me!";
        System.out.println(s18);
        System.out.println(s17 == s18);// false

        final String s19 = "You can't";
        String s20 = s19 + " change me!";
        System.out.println(s20);
        System.out.println(s16 == s20); // true -> if final then it's behave like consent.


//       Why String pool is important / it's advantage

//        Important Constructors of String class

        String s21 = new String(); // s21 is an empty string with no characters.

        String originalString = "Hello, World!";
        String s22 = new String(originalString); // s22 is a new string with the same content as "Hello, World!".
        System.out.println(originalString);

        StringBuffer buffer = new StringBuffer("Java is fun!");
        String s23 = new String(buffer); // s23 is a new string containing the content of the StringBuffer.
        System.out.println(buffer);

        StringBuilder builder = new StringBuilder("This is a StringBuilder.");
        String s24 = new String(builder); // s24 is a new string containing the content of the StringBuilder.
        System.out.println(builder);

        char[] charArray = {'C', 'o', 'd', 'e', 'r'};
        String s25 = new String(charArray); // s25 is a new string containing the characters from the charArray.
        System.out.println(charArray);

        byte[] byteArray = {72, 101, 108, 108, 111}; // Byte values for "Hello"
        String str26 = new String(byteArray);
        System.out.println(str26);

//        Important Method of String class:

//      charAt(int index): Returns the character at the specified index.
        String text = "Coder";
        char character = text.charAt(1); // character will be 'o'

//      concat(String str): Concatenates the specified string to the end of the original string.

        String str4 = "Hello";
        String str5 = ", World!";
        String combined = str4.concat(str5); // combined will be "Hello, World!"
        System.out.println(combined);

        String s26 = "Coder";
        s26 = s26.concat("LetsCode");
        System.out.println(s26);

        s26 += "LetsCode";
        System.out.println(s26);

        s26 = s26 + "LetsCode";
        System.out.println(s26);

//        public boolean equals(Object o); -> to check the equality of the string object

        String s27 = "Coder";
        System.out.println(s27.equals("CODER")); // false -> also check the content

//        public boolean equalsIgnoreCase(String s) -> where case is ignored in this case
        System.out.println(s27.equalsIgnoreCase("CODER")); // true

//      Important method of String class: isEmpty(), length(), replace(), substring()

//        public boolean isEmpty()
        String s28 = "";
        System.out.println(s28.isEmpty()); // true

        String s29 = "Coder";
        System.out.println(s29.isEmpty()); // false

//        public int length
        String s30 = "Abhishek";
        System.out.println(s30.length());

//      public String replace(char old , char new)
        String text1 = "Hello, World!";
        String replaced = text1.replace('o', '0'); // replaced will be "Hell0, W0rld!"

//      public String substring(int begin) -> from begin index to end of the string
        String text2 = "Hello, World!";
        String sub1 = text2.substring(7); // sub1 will be "World!"
        String sub2 = text2.substring(0, 5); // sub2 will be "Hello"

        String s31 = "Abhishek";
        System.out.println(s31.indexOf('s')); // 4
        System.out.println(s31.indexOf("z")); // -1


        String s32 = new String("coder");
        String s35 = s32.toString(); // true
        String s33 = s32.toLowerCase(); // true
        String s34 = s32.toUpperCase(); // false
        System.out.println(s32 == s33);
        System.out.println(s32 == s34);
        System.out.println(s32 == s35);
    }
}
