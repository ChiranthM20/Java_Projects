package practice_problems;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
        int n = arr.length + 1;  // Add 1 because one number is missing

        int total = n*(n+1)/2;   // Sum of 1 to 8
        for(int num : arr){
            total -= num;
        }
        System.out.println("missing number : "+ total);  // Output: 5
    }
}
