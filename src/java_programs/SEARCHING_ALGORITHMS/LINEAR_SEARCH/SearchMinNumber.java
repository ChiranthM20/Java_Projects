package java_programs.SEARCHING_ALGORITHMS.LINEAR_SEARCH;

public class SearchMinNumber {
    public static void main(String[] args) {
        int[] arr = {12,32,124,34,42,121,35,2};

        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
