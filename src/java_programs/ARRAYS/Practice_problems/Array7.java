//Print an array in reverse order.

package java_programs.ARRAYS.Practice_problems;

import java.util.Arrays;

public class Array7 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9};

        for (int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
