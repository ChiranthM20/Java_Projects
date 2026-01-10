package java_programs.RECURSION.Level1;

public class concept {
    public static void main(String[] args) {
        concept(5);
    }
    static void concept(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
//        concept(n--);
        concept(--n);
//        n-- vs --n
    }
}
