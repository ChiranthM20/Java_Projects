package java_programs.STRINGS;

import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String name = "Chiranth";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf("i"));
        System.out.println("   CHIRANTH   ".strip());
        System.out.println(Arrays.toString(name.split("")));
    }
}
