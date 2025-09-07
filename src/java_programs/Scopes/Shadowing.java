package java_programs.Scopes;

public class Shadowing {
    static int x = 10;

    public static void main(String[] args) {
        System.out.println(x);
        int x = 30;

        System.out.println(x);
        example();
    }
    static void example(){
        x=30;
        System.out.println(x);
    }

}
