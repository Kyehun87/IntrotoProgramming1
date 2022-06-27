import java.text.DecimalFormat;
import java.util.Scanner;

public class Week2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat(".000");

        String favoriteTeam;
        float totalGames;
        float totalWins;
        float winPercentage;

        System.out.println("Find your favorite team's winning percentage");

        System.out.println("What is your favorite team?");
        favoriteTeam = keyboard.nextLine();

        System.out.println("How many total games do they play in a season?");
        totalGames = keyboard.nextFloat();

        System.out.println("How many total games did they win this season?");
        totalWins = keyboard.nextFloat();

        winPercentage = (totalWins / totalGames);

        System.out.println("The win percentage for the " + favoriteTeam + " is " + formatter.format(winPercentage));
    }
}
