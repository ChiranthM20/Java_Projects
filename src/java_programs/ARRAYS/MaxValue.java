package java_programs.ARRAYS;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {6,23,4332,233,4};
        System.out.println(max(arr));

    }
    static int max(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
