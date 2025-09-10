//Find the minimum element in an array.

package java_programs.ARRAYS.Practice_problems;

import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {
        int[] arr = {10,99,12,5,1,80};
        int min = arr[0];
        System.out.println(Arrays.toString(arr));

        for (int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum number in the above list is : "+min);
    }
}
