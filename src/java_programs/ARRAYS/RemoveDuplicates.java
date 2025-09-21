package java_programs.ARRAYS;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers : ");
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
        }

        if(arr.length == 0){
            System.out.println("The array is empty");
            return;
        }

        int i = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        int k = i+1;

        System.out.println("Number of unique elements : "+k);
        System.out.println("updated array");
        for (int x = 0; x < k; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}
