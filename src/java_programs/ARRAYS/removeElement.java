package java_programs.ARRAYS;

public class removeElement {
    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 4, 2};
        int val = 2;

        int k = removeElement(nums, val);

        System.out.println("Number of elements after removal: " + k);
        System.out.print("Updated array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
