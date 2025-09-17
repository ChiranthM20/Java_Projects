package practice_problems.BinarySearch_InterviewQuestions;

public class RotatedBinarySearch {
    public static void main(String[] args) {

        int[] arr= {7,8,9,10,0,1,2,3,4};
        int pivotelement = pivot(arr);
        int target = 1;
        System.out.println("pivot element: " + pivotelement);

        System.out.println("target found in index: "+search(arr,target));

    }
    static int search(int[] arr, int target) {
        int pivot = pivot(arr);

        // If array is not rotated
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // If target is the pivot element
        if (arr[pivot] == target) {
            return pivot;
        }

        // Decide which half to search
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }


    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }if(mid>start && arr[mid]<arr[mid-1]){
                return mid - 1;
            }
            if(arr[mid]>=arr[start]){
                start = mid+1;
            }
            if(arr[mid]<=arr[end]){
                end = mid-1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr, int target,int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                return mid;
            }if(arr[mid]>target){
                end = mid-1;
            }if(arr[mid]<target){
                start = mid+1;
            }
        }
        return -1;
    }
}
