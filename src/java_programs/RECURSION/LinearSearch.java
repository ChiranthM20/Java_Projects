package java_programs.RECURSION;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {1,4,7,2,5,9};
        System.out.println(linearSearch(arr,9,0));
        int[] arr1 = {1,4,7,2,5,10};
        System.out.println(linearSearch(arr1,9,0));

    }
    static boolean linearSearch(int[] arr, int target, int index){

        if(index == arr.length){
            return false;
        }
        return arr[index] == target || linearSearch(arr, target, index+1);
    }
}
