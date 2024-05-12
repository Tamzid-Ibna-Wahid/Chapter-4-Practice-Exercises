package E4_12;

import java.util.Scanner;

public class RemoveComma {
    public String number;
    public RemoveComma() {
        scan();
    }
    public void scan() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scan.nextLine();
    }
    public String Withoutcomma() {
        String finalNumber=" ";
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != ',') {
                finalNumber = finalNumber + number.charAt(i);
            }

        }
        return finalNumber;
    }

}
