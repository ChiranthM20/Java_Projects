// Print numbers 1 to n

package java_programs.Loops;
import java.util.Scanner;

public class ForLoopInput{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(i);
            System.out.println("Hello world");
        }
    }
}