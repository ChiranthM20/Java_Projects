package java_programs.MATHS;

public class OddOrEven {
    public static void main(String[] args){
        int a = 10;
        System.out.println(isOdd(a));
    }
    static boolean isOdd(int a){
        return (a & 1)==1;
    }
}
