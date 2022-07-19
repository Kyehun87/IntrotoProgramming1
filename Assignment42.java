import java.util.Scanner;

public class Assignment42 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Pick a number to build a rectangle: ");
        int num = keyboard.nextInt();

        //determines the overall size of the rectangle
        int size = 2 * num - 1;

        // Top Half
        for (int i = 0; i < (size / 2) + 1; i++) {
            // Chosen number determines the total rows
            int rowNum = num;
            for (int j = 0; j < i; j++) {
                System.out.print(rowNum + " ");
                rowNum--;
            }
            // Constant Part
            for (int k = 0;k < size - 2 * i; k++) {
                System.out.print(num - i + " ");
            }

            // Increasing part.
            rowNum = num - i + 1;
            for (int l = 0; l < i; l++) {
                System.out.print(rowNum + " ");
                rowNum++;
            }
            System.out.println();
        }

        // Bottom Half which is a mirror image of the top half
        for (int i = size / 2 - 1; i >= 0; i--) {
            int rowNum = num;
            for (int j = 0; j < i; j++) {
                System.out.print(rowNum + " ");
                rowNum--;
            }

            for (int k = 0; k < size - 2 * i; k++) {
                System.out.print(num - i + " ");
            }

            rowNum = num - i + 1;
            for (int l = 0; l < i; l++) {
                System.out.print(rowNum + " ");
                rowNum++;
            }
            System.out.println();
        }
    }
}