//Copy all elements from one array to another.

package java_programs.ARRAYS.Practice_problems;

import java.util.Arrays;

public class Array9 {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5,6};
        System.out.println("Initial created array1: "+Arrays.toString(arr1));

        int[] arr2 = new int[arr1.length];

        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }
        System.out.println("Copied array2: "+Arrays.toString(arr2));

        arr1[0] = 99;
        System.out.println("Modified array1: "+Arrays.toString(arr1));

        // even if we modify the array 1 it does not change in array 2

        System.out.println("Copied array2: "+Arrays.toString(arr2));


    }
}
