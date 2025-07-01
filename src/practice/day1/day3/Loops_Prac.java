package practice.day1.day3;
import java.util.Scanner;
public class Loops_Prac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // print the sum of first n natural numbers where n = 5;
      /*  System.out.println("Hello and Welcome");
        System.out.println("enter the number: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("the sum of first "+n+" is: "+sum);
*/

        // printing numbers in a range by asking the user the start and the end point
       /* System.out.print("enter the start point: ");
        int start = input.nextInt();
        System.out.print("enter the end point:");
        int end = input.nextInt();
        for (int i = start; i <= end; i++){
            System.out.print(i+" ");
        }*/

        // printing table
        System.out.println("enter the number: ");
        int n = input.nextInt();
        for (int i = 1; i<= 10; i++){
            System.out.println(n+" x " +i+" = "+(n * i));
        }
    }
}
