import java.util.Scanner;

public class Week1 {
    public static void main(String[] args) {
        String name;
        int area = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Week 1!");
        System.out.println("What is your name?");
        name = keyboard.next();

        System.out.println("What is your area code?");
        area = keyboard.nextInt();

        System.out.println("Welcome to the class, " + name + "!");
        System.out.println("Your area code is: " + area);
    }
}
