import java.util.Scanner;

public class Week3Discussion {
    public static void main(String[] args) {

        int num;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Is that divisible by 3?");

        System.out.println("Pick a number:");
        num = keyboard.nextInt();

        if (num % 3 == 0) {
            System.out.println("Divisible by 3!");
        } else {
            System.out.println("Try again next time!");
        }
    }
}
