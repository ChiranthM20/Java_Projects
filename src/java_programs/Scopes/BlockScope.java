package java_programs.Scopes;

public class BlockScope {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        {
            // int a = 30  --> Error -> a is already initialized outside the block in the same method, so cannot reinitialize it
            System.out.println(a);
            a = 40;
            System.out.println(a);

            int c = 30;
            System.out.println(c);

            // Values initialized in this block will remain in the block

        }
        // System.out.println(c); --> Error -> c cant be accessed outside the block
        System.out.println(a+ " "+b);
    }
}
