package java_programs.SEARCHING_ALGORITHMS.BINARY_SEARCH;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {94,89,84,64,34,11,4,2,1};
        int target = 1;
        System.out.println(OrderAgnostic(arr,target));

    }
    static int OrderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;



        while(start<=end){

            int mid = start+(end-start)/2;

            boolean isAsc;
            if(arr[start] > arr[end]){
                isAsc = true;
            }else{
                isAsc = false;
            }

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target > arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target < arr[mid]){
                    end = mid+1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
