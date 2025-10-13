package java_programs.SORTINGALGORITHMS.INSERTION_SORT;

import java.util.Arrays;

public class main {
    public static void main(String[] args){
        int[] nums = {3,5,2,1,6};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void insertionSort(int[] arr){
        for(int i = 0; i<=arr.length-2; i++){
            for(int j = i+1; j>0;  j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }

}
