package java_programs.SEARCHING_ALGORITHMS.LINEAR_SEARCH;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[] arr = {12,32,124,34,42,121,35};

        int target = input.nextInt();
        int ans = searchinrange(arr, target, 2, 4);
        if(ans==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("Found");
        }


    }
    static int searchinrange(int[] arr, int target, int start, int end){
        start = 2;
        end = 5;
        for (int i = start; i<=end; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
