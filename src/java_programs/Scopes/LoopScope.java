package java_programs.Scopes;

public class LoopScope {
    public static void main(String[] args) {


        for (int i = 0; i <= 5; i++) {
            System.out.print(i+" ");  // here i is accessible inside the loop and cannot be accessed outside the loop
        }
        // sout(i) --> Error - > cannot access i outside the loop

    }
}
