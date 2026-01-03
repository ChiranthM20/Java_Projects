package java_programs.RECURSION;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {2,3,4,5,6,7,8,9,10};
        int ans = Bsearch(arr,7,0,arr.length-1);
        System.out.println(ans);

    }
    static int Bsearch(int[] arr, int target, int s, int e) {

        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }

        if (target < arr[m]) {
            return Bsearch(arr, target, s, m - 1);
        }

        return Bsearch(arr, target, m + 1, e);
    }

}
