package java_programs.MATHS;

public class FindUnique {
    public static void main(String[] arhs){
        int[] arr = {2,3,1,4,3,1,2};
        System.out.println(unique(arr));
    }
    static int unique(int[] arr){

        int unique = 0;

        for(int num:arr){
            unique ^= num;
        }
        return unique;
    }
}
