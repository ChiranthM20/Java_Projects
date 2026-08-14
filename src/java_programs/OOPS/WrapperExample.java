package java_programs.OOPS;

public class WrapperExample {
    public static void main(String[] args){


        String str = "250";
        Integer number = Integer.parseInt(str);
        System.out.println(number + 50);





        int a = 10;
        a = 20;
        final int b = 30;
        // b = 30; cannot modify
        System.out.println(a);
        System.out.println(b);

    }

}
