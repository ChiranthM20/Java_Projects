package java_programs.SEARCHING_ALGORITHMS.LINEAR_SEARCH;

import java.util.Scanner;

public class SearchUsingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,4,2,7,12,99};
        System.out.println("Enter the element you need to search : ");
        int target= sc.nextInt();
        int ans = LinearSearch(nums,target);
        if(ans==-1){
            System.out.println("Element not found in the list");
        }else{
            System.out.println("Element found at index : "+ans);
        }

        int ans2=LinearSearch2(nums,target);
        if(ans2==-1){
            System.out.println("Element not found in the list");
        }else{
            System.out.println("Element found  : "+ans2);
        }


    }

    // for returning the index
    static int LinearSearch(int[] arr, int target){

        if (arr.length==0){
            return -1;
        }

        for (int index=0; index<arr.length; index++){
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }

    // for returning the element
    static int LinearSearch2(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for (int element : arr){
            if(element==target){
                return element;
            }
        }
        return -1;
    }

}
