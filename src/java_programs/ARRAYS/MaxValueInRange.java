package java_programs.ARRAYS;

public class MaxValueInRange {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        System.out.println(maxRange(arr, 1 , 4));

    }
    static int maxRange(int[] arr, int start, int end){
        int maxval = arr[start];
        for (int i = start; i <=end; i++){
            if (arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
