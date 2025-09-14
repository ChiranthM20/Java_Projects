// ceiling of a number

package practice_problems.BinarySearch_InterviewQuestions;

public class Ceiling {
    public static void main(String[] args){
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(Ceiling(arr,target));
    }
    static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        System.out.println("the ceiling of a number is " + arr[start]);
        System.out.print("index : ");
        return start;
    }
}
