package practice_problems;

public class SingleNumber {
    public static void main(String[] args){
        int[] nums = {1,1,2,2,3,3,4,4,5};

        System.out.println("Single number in the array is : "+ singleNumber(nums));
    }
    static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
