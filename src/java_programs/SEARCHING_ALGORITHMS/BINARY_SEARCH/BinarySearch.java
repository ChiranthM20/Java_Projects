package java_programs.SEARCHING_ALGORITHMS.BINARY_SEARCH;

public class BinarySearch {
    public static void main(String[] args){
        int[] nums = {2,3,4,5,6,7,8,9,10,15,29,30,48,59,67,73,99};
        int result = BinarySearch(nums, 3);
        System.out.println(result);

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
        return -1;
    }
}
