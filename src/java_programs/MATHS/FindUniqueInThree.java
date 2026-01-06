package java_programs.MATHS;

public class FindUniqueInThree {
    public static void main(String[] args){
        int[] arr = {2,1,2,5,2,1,4,1,4,4};
        System.out.println(unique(arr));
    }
    static int unique(int[] arr) {
        int result = 0;

        for (int bit = 0; bit < 32; bit++) {
            int count = 0;
            for (int num : arr) {
                if ((num & (1 << bit)) != 0) {
                    count++;
                }
            }
            if (count % 3 != 0) {
                result |= (1 << bit);
            }
        }
        return result;
    }

}

