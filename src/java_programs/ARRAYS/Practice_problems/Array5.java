package java_programs.ARRAYS.Practice_problems;

import java.util.Arrays;

public class Array5{
    public static void main(String[] args){
        int[] arr = {22,33,11,44,88,12,32,43};
        int max = 0;
        System.out.println("Array : "+ Arrays.toString(arr));

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element in the array is : "+max);
    }
}