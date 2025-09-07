package java_programs.Loops;

public class PassByValue1 {
    public static void main(String[] args) {
        String name = "Chiranth";
        Name(name);
        System.out.println(name);
    }
    static void Name(String naam){
        naam = "Chiru";
    }
}
