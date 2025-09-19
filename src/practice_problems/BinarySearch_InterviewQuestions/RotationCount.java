package practice_problems.BinarySearch_InterviewQuestions;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int rotCount = countRotations(arr);
        System.out.println("The array is rotated "+rotCount+" times");
    }
    static int countRotations(int[] arr) {
        int pivot = pivot(arr);
        return pivot+1;
    }
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid =  start + (end-start)/2;
            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }else if(mid>start && arr[mid] < arr[mid-1]){
                return mid-1;
            }else if(arr[mid] >=  arr[start]){
                start =  mid+1;
            }else{
                end =  mid-1;
            }
        }
        return -1;
    }
}
