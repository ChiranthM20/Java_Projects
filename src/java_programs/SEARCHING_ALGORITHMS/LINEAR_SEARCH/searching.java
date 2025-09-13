package java_programs.SEARCHING_ALGORITHMS.LINEAR_SEARCH;

import java.util.Scanner;

public class searching {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[] = {1,4,22,52,345,23,54,67};
        int target = sc.nextInt();
        boolean found=false;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                found=true;
            }

        }
        if (found){
            System.out.println("Target found");
        }else{
            System.out.println("Target not found");
        }
    }
}
