package learning.day2;

import java.util.Scanner;

// I'll be practicing many problems in one java program
// so when a new program comes I'll just comment out the previous one

public class conditionalStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("enter the second number: ");
        int num2 = input.nextInt();
        if (num1 == num2){
            System.out.println("Equal!");
        }else if (num1 > num2) {
            System.out.println("num1 is greater!");
        }else {
            System.out.println("num1 is lesser");
        }
    }
}
