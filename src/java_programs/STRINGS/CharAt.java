package java_programs.STRINGS;

public class CharAt {
    public static void main(String[] args){

        // we cannot get the character at a specific index like this --> (sout(name[0]);
        // so we can use CharAt() method

        String name = "Chiranth";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(5));
    }
}
