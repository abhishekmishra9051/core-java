package strings;

public class LearnStringBuffer {
    public static void main(String[] args) {

//        Important Constructor of StringBuffer

        StringBuffer stringBuffer = new StringBuffer();
        /*
        Initial capacity is 16 -> After full the capacity of StringBuffer,
        the new capacity is (capacity = (Initial capacity + 1) * 2) -> (16+1)*2 = 34
        */

        System.out.println(stringBuffer.capacity()); // 16
        StringBuffer stringBuffer1 = new StringBuffer(); // 16
        stringBuffer1.append("AbhishekJIMishra"); // 16
        stringBuffer1.append("J"); // (16 + 1 )*2
        System.out.println(stringBuffer1.capacity());// 34 -> growable in nature

//        StringBuffer stringBuffer = new StringBuffer(int initialCapacity);

        StringBuffer stringBuffer2 = new StringBuffer(1000);
        System.out.println(stringBuffer2.capacity());

//        StringBuffer stringBuffer = new StringBuffer(String s);

        StringBuffer stringBuffer3 = new StringBuffer("Coder");
        System.out.println(stringBuffer3.capacity()); // 21 -> stringBuffer3.length() + 16 ;

        System.out.println(stringBuffer3.charAt(4)); // r
//        System.out.println(stringBuffer3.charAt(30)); // StringIndexOutOfBoundsException

        StringBuffer stringBuffer4 = new StringBuffer("Coder");
        stringBuffer4.setCharAt(0, 'M');
        System.out.println(stringBuffer4);

        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("PI value is ");
        stringBuffer5.append("3.14 ");
        stringBuffer5.append("it's is exactly ");
        stringBuffer5.append(true);
        System.out.println(stringBuffer5);

        StringBuffer stringBuffer6 = new StringBuffer("accdefgh");
        stringBuffer6.insert(2, "XYZ");
        System.out.println(stringBuffer6); // b -> acXYZcdefgh

        StringBuffer stringBuffer7 = new StringBuffer("accdefgh");
        stringBuffer7.delete(2,5);
        System.out.println(stringBuffer7); // acfgh

        StringBuffer stringBuffer8 = new StringBuffer("accdefgh");
        stringBuffer8.deleteCharAt(2);
        System.out.println(stringBuffer8); // acdefgh

        StringBuffer stringBuffer9 = new StringBuffer("Coder");
        stringBuffer9.reverse();
        System.out.println(stringBuffer9); // redoC

        // Method channing
        StringBuffer stringBuffer10 = new StringBuffer();
        stringBuffer10.append("Hello").append(", ").append("World").append("!").reverse();
        System.out.println(stringBuffer10);
//        String finalString = stringBuffer10.toString();
//        System.out.println(finalString);


    }
}
