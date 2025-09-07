package java_programs.FunctionsMethods;


import java.util.Arrays;

public class VarLenArgs {
    public static void main(String[] args) {
        integers(12,21,24,523,12132,13);
        Strings("Chiranth", "Chiru", "Java");

        Multiple("Chiranth",'M', 10,20,30);

    }
    static void integers(int ...i){
        System.out.println(Arrays.toString(i));
    }

    static void Strings(String ...s){
        System.out.println(Arrays.toString(s));
    }

    static void Multiple(String s,char c, int ...i){

        System.out.println(s);
        System.out.println(c);
        System.out.println(Arrays.toString(i));
    }

}
