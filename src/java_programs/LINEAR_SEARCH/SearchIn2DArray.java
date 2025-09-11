package java_programs.LINEAR_SEARCH;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target = 5;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {              // loop through rows
            for (int j = 0; j < arr[i].length; j++) {       // loop through columns
                if (arr[i][j] == target) {
                    System.out.println("Target found at index [" + i + "][" + j + "]");
                    found = true;
                    break; // stop after finding (optional)
                }
            }
        }

        if (!found) {
            System.out.println("Target not found");
        }
    }
}
