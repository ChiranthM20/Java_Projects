package java_programs.Loops;

public class PassByValueSwap {
    public static void main(String[] args) {
        int a,b;
        a = 10;
        b = 20;
        Swap(a,b);  // swaps
        Swap(3,5);  // swaps

        System.out.println(a+" "+b);  // this will not swap

    }
    static void Swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1+" "+num2);
    }
}
