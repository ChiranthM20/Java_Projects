package practice_problems.BinarySearch_InterviewQuestions;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 5, 10, 15, 20},
                {2, 7, 12, 16, 21},
                {3, 8, 14, 21, 22},
                {4, 11, 19, 23, 25}
        };
        System.out.println(Arrays.toString(search(matrix, 21)));

    }
    static int[] search(int[][] matrix, int target){
        int r=0;
        int c=matrix.length-1;

        while(r< matrix.length && c>=0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }else if(matrix[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
