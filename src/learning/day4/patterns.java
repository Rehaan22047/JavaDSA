package learning.day4;

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
        System.out.println("Hollow Rectangle");

        int rows = 4;
        int columns = 5;
        // outer loop
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= columns; j++){
                // cell (i,j)
                if (i == 1 || j == 1 || i == rows || j == columns){
                    System.out.print("* ");
                }else{
                    System.out.print("  "); // here Printing TWO whitespaces because in the above print statement
                                            // it takes a space of two character (one for * and the other for space)
                }
            }
            System.out.println();
        }
    }
}
