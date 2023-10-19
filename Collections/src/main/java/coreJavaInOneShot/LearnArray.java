package coreJavaInOneShot;

import java.util.Arrays;

public class LearnArray {
    public static void main(String[] args) {

//        one-dimensional array
        int[] arr;
        arr = new int[10];
        int arr1[] = new int[10];
        int[] arr2 = {10, 20, 30, 40, 50};
        int first = arr2[0];
        int n = arr2.length;
        int last = arr2[n-1];
        System.out.println(first);
        System.out.println(last);
        Arrays.fill(arr, -1);
        System.out.println(Arrays.toString(arr));

//        two-dimensional array
        int[][] array = new int[3][2];
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                array[i][j] = i*10+j;
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
