import java.util.Scanner;

public class Week4Discussion {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Let's countdown until blast-off!");

        System.out.println("How many seconds do we have left?");
        int second = keyboard.nextInt();

        while (second >= 0) {
            if (second == 1) {
                System.out.println(second + " second until blast-off.....");
                second --;
            } else if (second == 0) {
                System.out.println("We have taken flight!!!!");
                second --;
            } else {
                System.out.println(second + " seconds until blast-off....");
                second --;
            }
        }


    }
}
