package java_programs.FunctionsMethods;

import java.util.Arrays;

public class OverLoading {
    public static void main(String[] args) {
        fun("Chiranth");
        fun('M');
        fun(100, 213, 13);
        fun(10);


    }
    static void fun(int i){
        System.out.println(i);
    }
    static void fun(String s){
        System.out.println(s);
    }
    static void fun(char c){
        System.out.println(c);
    }
    static void fun(int...i){
        System.out.println(Arrays.toString(i));
    }
}
