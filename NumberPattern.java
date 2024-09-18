package anudip;

public class NumberPattern {
    public static void main(String[] args) {
        int n = 3; // Number of rows

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Print spaces before the numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print numbers in decreasing order
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Move to the next line after each row
            System.out.println();
        }
    }

    /* for (int i = n; i >= 1; i--) {
        // Print spaces before the numbers
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }

        // Print numbers in decreasing order
        for (int j = i; j >= 1; j--) {
            System.out.print(j);
        }

        // Print numbers in increasing order
        for (int j = 2; j <= i; j++) {
            System.out.print(j);
        }

        // Move to the next line after each row
        System.out.println();*/
}
