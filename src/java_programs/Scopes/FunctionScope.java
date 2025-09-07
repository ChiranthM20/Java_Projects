package java_programs.Scopes;

public class FunctionScope {
    public static void main(String[] args) {

        //sout(a) --> gives error -> because a is decclared inside example() and not in main()

    }
    static void example(){
        int a=10;  // a is only accessible inside example()
        System.out.println(a);
    }
}
