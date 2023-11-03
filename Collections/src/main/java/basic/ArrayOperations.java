package basic;
import java.util.*;
import java.util.Arrays;

public class ArrayOperations {
    public static int findSmallest(int[] Array){
        int smallest = Integer.MAX_VALUE;
//        int smallest = Array[0];
        for(int i=0; i<Array.length; i++){
            if(Array[i] < smallest)
                smallest = Array[i];
        }
        return smallest;
    }

    public static int findLargest(int[] array){
       int largest = Integer.MIN_VALUE;
//        int largest = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i] > largest)
                largest = array[i];
        }
        return largest;
    }


    public static int calculateSum(int[] array) {
        int sum = 0;
        for(int num : array){
            sum += num;
        }
        return sum;
    }

    private static double calculateAverage(int[] array) {
        int sum = calculateSum(array);
        return (double) sum / array.length;
    }

    public static boolean isNumberExists(int[] array, int number){
        for(int num : array){
            if(num == number)
                return true;
        }
        return false;
    }

    public static int countOccurrences(int[] array, int number){
        int count = 0;
        for(int num : array){
            if(num == number)
                count++;
        }
        return count;
    }

    public static int[] sortArrayAscending(int[] array){
        int[] sortedArray =array.clone();
          Arrays.sort(sortedArray);
//        for(int i=0; i<sortedArray.length-1; i++){
//            for(int j= i+1; j<array.length; j++){
//                if(sortedArray[j] < sortedArray[i]){
//                    int temp = sortedArray[i];
//                    sortedArray[i] = sortedArray[j];
//                    sortedArray[j] = temp;
//                }
//            }
//        }
        return sortedArray;
    }

//    private static int[] sortArrayDescending(int[] array) {
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[j] > array[i]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//        return array;
//    }


    public static int[] sortArrayDescending(int[] array){
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        reverseArray(sortedArray);
        return sortedArray;
    }
    public static int[] removeDuplicates(int[] array){
        int[] uniqueArray = new int[array.length];
        int index = 0;
        for(int num : array){
            if( !contains(uniqueArray, num)){
                uniqueArray[index++] = num;
            }
        }
        return  Arrays.copyOf(uniqueArray, index);
    }

    private static boolean contains(int[] array, int target) {
        for (int element : array) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[index++] = array[i];
        }
        return reversedArray;
    }

    private static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int number : array){
            if( number > largest){
                secondLargest = largest;
                largest = number;
            }else if(number > secondLargest && number != largest)
                secondLargest = number;
        }
        return  secondLargest;
    }


    public static void main(String[] args) {
        int[] array = {1,3,4,5,7,7,8,-1};

        // Find the smallest element in the array
        int smallest = findSmallest(array);
        System.out.println("Smallest element: " + smallest);

        // Find the largest element in the array
        int largest = findLargest(array);
        System.out.println("Largest element: " + largest);

        // Calculate the sum of all elements in the array
        int sum = calculateSum(array);
        System.out.println("Sum of elements: " + sum);

        // Find the average value of the elements in the array
        double average = calculateAverage(array);
        System.out.println("Average of elements: " + average);
        System.out.println("Average of elements: " + String.format("%.6f", average));

        // Determine if a specific number exists in the array
        int number = 8;
        boolean exists = isNumberExists(array, number);
        System.out.println(number + " exists in the array: " + exists);

        // Count the occurrences of a particular number in the array
        int count = countOccurrences(array, number);
        System.out.println("Number of occurrences of " + number + ": " + count);

        // Sort the array in ascending order
        int[] sortedArrayAsc = sortArrayAscending(array);
        System.out.println("Sorted array in ascending order: " + Arrays.toString(sortedArrayAsc));

        // Sort the array in descending order
        int[] sortedArrayDesc = sortArrayDescending(array);
        System.out.println("Sorted array in descending order: " + Arrays.toString(sortedArrayDesc));

        // Remove duplicate elements from the array
        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));


        // Reverse the order of the elements in the array
        int[] reversedArray = reverseArray(array);
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));

        // Find the second largest element in the array
        int secondLargest = findSecondLargest(array);
        System.out.println("Second largest element: " + secondLargest);

    }




}
