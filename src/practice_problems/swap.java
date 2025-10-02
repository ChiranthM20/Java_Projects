package practice_problems;

public class swap {
    public static void main(String[] args){
        int a,b,temp;

        a=10;
        b=20;
        System.out.println("Before Swapping : a="+a+" "+"b="+b);

        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping : a="+a+" "+"b="+b);
    }
}
