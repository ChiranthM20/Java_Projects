package java_programs.Loops;

public class PassByValue {
    public static void main(String[] args) {
        String name="Chiru";
        Name(name);
    }
    static void Name(String n){
        System.out.println(n);
    }
}
