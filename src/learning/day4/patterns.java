package learning.day4;
//import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
        // In this session we will be printing patterns

        // Solid Rectangle
       /* System.out.println("Solid Rectangle");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/



        // Hollow Rectangle
        /*System.out.println("Hollow Rectangle\n");

        int rows = 4;
        int columns = 10;
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= columns; j++){
                if (i == 1 || j == 1 || i == rows || j == columns){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }*/


        // Half Pyramid
       /* System.out.println("Half Pyramid\n");
        int rows = 4;
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/


        // Inverted Half Pyramid
       /* System.out.println("Inverted Half Pyramid\n");
        int rows = 4;
        for (int i = rows; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        } */


        // Inverted Half Pyramid (rotated by 180 deg)
        System.out.println("Mirrored Half Pyramid (rotated by 180 deg)");
        int rows = 4;
        // outer loop
        for (int i = 1; i <= rows; i++){
            // inner loop --> to print spaces
            for (int j = 1; j <= rows - i; j++){
                System.out.print("  ");
            }

            // inner loop --> to print stars
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
