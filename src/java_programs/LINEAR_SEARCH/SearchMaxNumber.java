package java_programs.LINEAR_SEARCH;

public class SearchMaxNumber {
    public static void main(String[] args) {
        int[] arr={1,32,234,432,43,23,2};
        int max = arr[0];

        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
