package E4_17;

public class LargeLetter {
    public static void main(String[] args) {
        // Define string literals for letters
        final String LETTER_H = "*   *\n*   *\n*****\n*   *\n*   *\n\n";
        final String LETTER_E = "*****\n*    \n*****\n*    \n*****\n\n";
        final String LETTER_L = "*    \n*    \n*    \n*    \n*****\n\n";
        final String LETTER_O = "*****\n*   *\n*   *\n*   *\n*****\n\n";

        // Print the message "OLLEH" in large letters
        System.out.printf("%s%s%s%s%s", LETTER_H, LETTER_E, LETTER_L, LETTER_L, LETTER_O);
    }
}

