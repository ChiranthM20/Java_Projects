//https://leetcode.com/problems/find-in-mountain-array/

package practice_problems.BinarySearch_InterviewQuestions;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1};
        int target = 3;

        int peak= peakIndex(arr);

        int firstTry = orderAgnostic(arr, target, 0,peak,true);
        if(firstTry != -1){
            System.out.println(firstTry);   // Found in left side
        } else {
            // Otherwise search in descending part
            int secondTry = orderAgnostic(arr, target, peak + 1, arr.length - 1, false);
            System.out.println(secondTry);
        }


    }
    static int orderAgnostic(int[] arr, int target, int start, int end, boolean isASC){

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target == arr[mid]){
                return mid;
            }



            if(isASC){
                if(target > arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}
