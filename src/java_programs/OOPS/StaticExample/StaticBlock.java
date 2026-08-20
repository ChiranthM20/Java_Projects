package java_programs.OOPS.StaticExample;

public class StaticBlock {
    static int a = 5;
    static int b;


    // this static block will only run once, when the object is created i.e. when the class if loaded for the first time
    static {
        System.out.println("This is a static block");
        b = a * 5;
    }

    public static void main(String[] args){
        StaticBlock obj  =  new StaticBlock();
        System.out.println(StaticBlock.a + " "+StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " "+StaticBlock.b);

        StaticBlock obj2 =  new StaticBlock();
        System.out.println(StaticBlock.a + " "+StaticBlock.b);
    }

}
