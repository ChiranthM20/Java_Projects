package java_programs.MATHS;

public class MagicNumber {
    public static void main(String[] args){
        int n = 6; // find 6th magic number

        int answer = 0;
        int base = 5;
        while(n>0){
            int last = n & 1;
            n = n >> 1;
            answer += last * base;
            base = base*5;
        }
        System.out.println(answer);
    }
}
