import java.text.DecimalFormat;
import java.util.Scanner;

public class Week2Assignment1 {
    public static void main(String[] args) {
        //creating a variable to allow for capture from the keyboard
        Scanner keyboard = new Scanner(System.in);

        //initializing the needed components for a successful test case
        int customerID;
        float unitPrice;
        int quantity;
        String description;
        float discount;
        float TOTAL;
        float PRICE;

        //creating a variable that allows for the DecimalFormat method to be used. This way the final answer has 2 decimal points
        DecimalFormat formatter = new DecimalFormat("0.00");


        //Using the scanner method to capture the value for each component
        System.out.println("Please enter a customer ID:");
        customerID = keyboard.nextInt();

        System.out.println("Please enter a unit price in decimal form:");
        unitPrice = keyboard.nextFloat();

        System.out.println("Please enter the unit quantity:");
        quantity = keyboard.nextInt();

        System.out.println("Please enter the product description:");
        keyboard.nextLine();
        description = keyboard.nextLine();


        System.out.println("Please enter the discount amount in decimal format:");
        discount = keyboard.nextFloat();

        //Calculating the subtotal
        TOTAL = unitPrice * quantity;

        //Calculating the price paid
        PRICE = TOTAL - (TOTAL * discount);

        System.out.println("ORDER DATA:");
        System.out.println("Customer ID: " + customerID);
        System.out.println("Unit Price: $" + formatter.format(unitPrice));
        System.out.println("Quantity: " + quantity);
        System.out.println("Product Description: " + description);
        System.out.println("Discount: " + formatter.format(discount * 100) +"%");

        System.out.println("Order total BEFORE discount: $" + formatter.format(TOTAL));
        System.out.println("Order total AFTER discount: $" + formatter.format(PRICE));
    }
}
