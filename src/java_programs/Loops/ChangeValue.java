package java_programs.Loops;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Change(int[] nums){
        nums[0] = 99;
        System.out.println();;
    }
}
