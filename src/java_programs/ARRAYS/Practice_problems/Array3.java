//Find the sum of all elements in an array.

package java_programs.ARRAYS.Practice_problems;

public class Array3 {
    public static void main(String[] args) {
        int[] arr = {10,100,20,88,20};
        int sum = 0;

        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
