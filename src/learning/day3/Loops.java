package learning.day3;

public class Loops {
    public static void main(String[] args) {
        // For loop
//        for (int i = 1; i <= 10; i++){
//            System.out.print(i+" ");
//        }
        // While Loops
//        int i = 1;
//        while (i < 11){
//            System.out.print(i+" ");
//            i++;  we can also write i = i+1 or i+=1
//      }
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i < 1);
        // the condition is false yet the do part will be executed once, because it does the action
        // then checks the condition
    }
}
