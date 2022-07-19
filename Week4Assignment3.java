import java.util.Scanner;



public class Week4Assignment3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Welcome to the Total XP calculation program!");
        System.out.println("Do you want to enter gamer's data? Yes or no?");
        String start = keyboard.nextLine();
        start = start.toLowerCase();



        while (start.equals("yes")) {
            System.out.println("Enter the gamer's name:");
            String name = keyboard.nextLine();

            System.out.println("Enter the gamer's L1 XP score:");
            int L1 = keyboard.nextInt();

            System.out.println("Enter the gamer's L2 XP score:");
            int L2 = keyboard.nextInt();

            System.out.println("Enter the gamer's L3 XP score:");
            int L3 = keyboard.nextInt();

            System.out.println("Enter the gamer's ES XP score:");
            int Es = keyboard.nextInt();

            double total = L1 + (L1 * .20) + L2 + (L2 * .30) + L3 + (L3 * .50) + Es + (Es * .60);
            int totalf = (int)total;

            System.out.println("Gamer Name: " + name  + " L1=" + L1 + " L2=" + L2 + " L3=" + L3 + " ES=" + Es);
            System.out.println("Final XP score with bonuses= " + totalf);

            System.out.println("Do you want to enter another gamer's data? Yes or no?");
            start = keyboard.next();
            start = start.toLowerCase();
            keyboard.nextLine();

        }

        System.out.println("Thank you for playing!");
    }
}
