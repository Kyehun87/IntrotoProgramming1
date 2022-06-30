import java.util.Objects;
import java.util.Scanner;

public class Week3Assignment2 {
    public static void main(String[] args) {
        //creating the variables
        int num1;
        int num2;
        String exp;

        //
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Lets do some math!");

        System.out.println("Pick a number between 200 and 1000:");
        num1 = keyboard.nextInt();

        System.out.println("Pick a second number between 200 and 1000:");
        num2 = keyboard.nextInt();

        System.out.println("What math operation do you want to do?");
        System.out.println("Pick + for addition");
        System.out.println("Pick - for subtraction");
        System.out.println("Pick * for multiplication");
        System.out.println("Pick / for division");
        exp = keyboard.next();

        if(Objects.equals(exp, "+")) {
            System.out.println("The total is " + (num1 + num2));
        }else if (Objects.equals(exp, "-")) {
            System.out.println("The total is " + (num1 - num2));
        } else if (Objects.equals(exp, "*")) {
            System.out.println("The total is " + (num1 * num2));
        }else if (Objects.equals(exp, "/")) {
            System.out.println("The total is " + (num1 / num2));
        } else {
            System.out.println("That is not an operation!");
        }


    }
}
