package E4_15;
import java.util.Scanner;

public class DigitBreak {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for input
            System.out.print("Enter an integer (up to 5 digits): ");
            int number = scanner.nextInt();

            // Break the number into individual digits
            int digit1 = number / 10000;
            int digit2 = (number / 1000) % 10;
            int digit3 = (number / 100) % 10;
            int digit4 = (number / 10) % 10;
            int digit5 = number % 10;

            // Print the individual digits
            System.out.println("The individual digits are: " + digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);

            scanner.close();
        }


}
