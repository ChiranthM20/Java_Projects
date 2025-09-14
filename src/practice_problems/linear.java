package practice_problems;

public class linear {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 6;

        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                System.out.println(arr[i]);
            }
        }

    }
}
