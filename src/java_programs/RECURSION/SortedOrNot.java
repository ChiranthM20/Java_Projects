package java_programs.RECURSION;

public class SortedOrNot {
    public static void main(String[] args){
        int[] arr = {1,3,5,7,10};
        System.out.println(sortedOrNot(arr, 0));

        int[] arr1 = {9,3,5,1,10};
        System.out.println(sortedOrNot(arr1, 0));

    }
    static boolean sortedOrNot(int[] arr, int index){
        //base condition

        if(index == arr.length-1){
            return true;
        }

        return arr[index] <arr[index+1] && sortedOrNot(arr, index+1);
    }
}
