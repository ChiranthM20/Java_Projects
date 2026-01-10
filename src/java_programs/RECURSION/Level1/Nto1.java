package java_programs.RECURSION.Level1;

public class Nto1 {
    public static void main(String[] args){
        System.out.println("N to 1");
        fun(5);
        System.out.println("\n1 to 5");
        fun2(1);
        System.out.println("\nFunRev");
        funRev(5);
        System.out.println("\nfunBoth");
        funBoth(5);
    }
    static void fun(int n){
        if(n==0){
           return;
        }
        System.out.println(n);
        fun(n-1);
    }



    // to print 1 to 5
    static void fun2(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        fun2(n+1);
    }


    static void funRev(int n){
        if(n==0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }

    static void funBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
