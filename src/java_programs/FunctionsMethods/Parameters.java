package java_programs.FunctionsMethods;

public class Parameters {
    public static void main(String[] args) {
        int sum = sum(3,7);
        System.out.println(sum);
    }

    static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
}

