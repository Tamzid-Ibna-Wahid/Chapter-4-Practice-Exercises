package E4_14;

public class GridPrinter {
    public static void main(String[] args) {
        // Define symbols
        String horizontal = "+--+--+--+\n";
        String vertical = "|  |  |  |\n";

        // Print the grid
        for (int i = 0; i < 3; i++) {
            System.out.print(horizontal);
            for (int j = 0; j < 2; j++) {
                System.out.print(vertical);
            }
        }
        System.out.print(horizontal);
    }
}

