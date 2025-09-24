package java_programs.SORTINGALGORITHMS.BUBBLE_SORT;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1,3,2,4,6,5};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void sort(int[] nums){

        boolean swapped = false;

        // run the steps n-1 times

        for(int i=0; i<nums.length;i++){
            for(int j=1; j<nums.length-i; j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
    }
}
