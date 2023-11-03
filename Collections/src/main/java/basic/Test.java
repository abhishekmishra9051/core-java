package basic;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] Array = {10,33,5,6,8,10,12};
//        int smallest = Integer.MAX_VALUE;
//        int secondSmallest = Integer.MAX_VALUE;
        int smallest = Array[0];
        int smallestIndex = -1;
        int secondSmallest = Array[1];
        int secondSmallestIndex = -1;
        for(int i=0; i<Array.length; i++){
            if(Array[i] < smallest){
                secondSmallest = smallest;
                secondSmallestIndex = smallestIndex;
                smallest = Array[i];
                smallestIndex = i;

            }
            else if(Array[i] < secondSmallest && Array[i] != smallest) {
                secondSmallest = Array[i];
                secondSmallestIndex = i;
            }
        }
        System.out.println(smallest +" at Index : "+ smallestIndex);
        System.out.println(secondSmallest+" at Index : "+ secondSmallestIndex);
        reverseArray(Array);
        System.out.println("Reverse Array : "+Arrays.toString(Array));
        System.out.print("Sorted array in ascending order: ");
        sortArray(Array);
        System.out.println(Arrays.toString(Array));
    }

    public static void reverseArray(int[] Array){
        int start = 0;
        int end = Array.length -1;

        for(int i=0; i<Array.length; i++){
            int temp = Array[start];
            Array[start++] = Array[end];
            Array[end--] = temp;
        }
    }

    public static void sortArray(int[] Array){
        for(int i= 0; i< Array.length -1; i++){
            for(int j = i+1; j<Array.length; j++){
                if(Array[j] < Array[i]){
                    int temp = Array[j];
                    Array[j] = Array[i];
                    Array[i] = temp;
                }
            }
        }
    }
}
