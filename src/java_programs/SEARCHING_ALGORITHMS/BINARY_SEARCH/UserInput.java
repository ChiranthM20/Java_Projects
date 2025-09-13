package java_programs.SEARCHING_ALGORITHMS.BINARY_SEARCH;

import java.util.Arrays;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] nums = new int[9];

        System.out.println("Enter the elements needed to store in the array: ");

        for(int i=0; i<nums.length; i++){
            nums[i] = input.nextInt();
        }
        Arrays.sort(nums); // sorting is done because Binary search only works on Sorted Array

        System.out.println(Arrays.toString(nums));

        System.out.println("Enter the target element : ");
        int target = input.nextInt();

        System.out.println("your target element is : "+target);
        System.out.println();

        int index = BinarySearch(nums, target);
        if (index !=-1){
            System.out.println("Your target element is in "+index+"th index");
        }


    }
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }else if(target >arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        System.out.println("Your target element does not exist in the array");
        return -1;
    }
}
