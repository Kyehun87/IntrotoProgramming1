import java.util.Objects;
import java.util.Scanner;

public class Week3Assignment2 {
    public static void main(String[] args) {
        //creating the variables
        int num1;
        int num2;
        String exp;

        //Creating the input system
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Lets do some math!");

        //Using the input system to gather infomration from the user
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

        //Logic to choose the right operation and return the total
        if(Objects.equals(exp, "+")) {
            System.out.println("Evaluation: " + num1 + " + " + num2);
            System.out.println("The total is " + (num1 + num2));
        }else if (Objects.equals(exp, "-")) {
            System.out.println("Evaluation: " + num1 + " - " + num2);
            System.out.println("The total is " + (num1 - num2));
        } else if (Objects.equals(exp, "*")) {
            System.out.println("Evaluation: " + num1 + " * " + num2);
            System.out.println("The total is " + (num1 * num2));
        }else if (Objects.equals(exp, "/")) {
            System.out.println("Evaluation: " + num1 + " / " + num2);
            System.out.println("The total is " + ((float) num1 / num2));
        } else {
            System.out.println("That is not an operation!");
        }


    }
}
