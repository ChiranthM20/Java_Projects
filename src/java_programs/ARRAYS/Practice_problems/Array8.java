//Count how many times a given number appears in an array.

package java_programs.ARRAYS.Practice_problems;

import java.util.Arrays;

public class Array8 {
    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,3,12,1,3,1};
        int count=0;
        int target=1;
        System.out.println(Arrays.toString(arr));

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println("The integer " + target + " appeared " + count +" times in the array");
    }
}
