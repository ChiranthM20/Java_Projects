package java_programs.OOPS;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] roll = {1,2,3,4,5};
        String[] name = {"Chiranth","Alice","Bob","Carl","David" };
        int[] age = {20,21,22,2,22};
        //System.out.println(Arrays.toString(roll));

        int[] a = age;

        System.out.println(Arrays.toString(age));
    }
}
