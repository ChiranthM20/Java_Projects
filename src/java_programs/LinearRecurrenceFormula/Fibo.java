package java_programs.LinearRecurrenceFormula;

public class Fibo {
    public static void main(String[] args){
        System.out.println(FiboFormula(50));


    }
    static int FiboFormula(int n){
        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2 ), n) / Math.sqrt(5));
    }
}
