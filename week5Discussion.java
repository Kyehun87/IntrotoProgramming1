import java.util.Scanner;

public class week5Discussion {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Pick a number and I can return the double of it and every number before it:");
        int num = keyboard.nextInt();

        for(int i = 1; i <= num; i++ ) {
            System.out.println(i * 2 + " is " + i + " doubled.");
        }
    }
}
