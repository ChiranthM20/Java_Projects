//Check whether an element is present in the array or not (linear search).

package java_programs.ARRAYS.Practice_problems;

import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.print("Enter the element you want to search : ");
        int target = input.nextInt();

        boolean found = false;

        for(int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Target element found");
        }else{
            System.out.println("Target element not found");
        }
    }
}
