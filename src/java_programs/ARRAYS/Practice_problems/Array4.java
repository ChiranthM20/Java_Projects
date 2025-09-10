//Find the average of elements in an array.

package java_programs.ARRAYS.Practice_problems;

public class Array4 {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30, 35};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];

        }

        double avg = (double)sum/arr.length;
        System.out.println(avg);
    }
}
