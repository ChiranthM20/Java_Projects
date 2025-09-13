package java_programs.SEARCHING_ALGORITHMS.LINEAR_SEARCH;


import java.util.Scanner;

public class SearchingString{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = {"hello", "hi", "bye"};

        String target = input.nextLine();

        int index=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(target)){
                index=i;
            }
        }

        if(index==-1){
            System.out.println("no match");
        }else{
            System.out.println("Element found at index : "+ index);
        }
    }
}