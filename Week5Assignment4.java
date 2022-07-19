import java.util.Scanner;

public class Week5Assignment4 {
    public static void main(String[] args) {
        //creating the input system
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a number:");

        //creating the integer from the user's input
        int num = keyboard.nextInt();

        //this loop is the total number of runs through the loop
        for(int i = 1; i <= num; i++){
            //this loop runs for each integer and prints out the corresponding number on each loop
            for(int n = 1; n <= i; n++) {
                System.out.print(n + " ");
            }
            //this prints out the result of each loop on a different line
            System.out.println();
        }
    }
}
