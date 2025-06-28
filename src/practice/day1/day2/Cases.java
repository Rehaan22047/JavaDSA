package practice.day1.day2;

import java.util.Scanner;

public class Cases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello and Welcome!");
        System.out.print("enter the first number:");
        float num1 = input.nextFloat();
        System.out.print("enter the second number: ");
        float num2 = input.nextInt();
        System.out.println("choose an operation: ");
        System.out.println("1: + Addition");
        System.out.println("2: - subtraction");
        System.out.println("3: * Multiplication");
        System.out.println("4: / Division");
        System.out.println("5: % Modulus");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0)
                    System.out.println("Result: " + (num1 / num2));
                else
                    System.out.println("Infinite");
                break;
            default:
                System.out.println("Result: " + (num1 % num2));
        }
    }
}
