package java_programs.MATHS;

public class Find_ith_bit {
    public static void main(String[] args) {
        int a = 20;
        int i = 4;
        System.out.println(findIthBit(a, i));
    }

    static int findIthBit(int a, int i) {
        return (a & (1 << (i - 1))) != 0 ? 1 : 0;
    }
}
