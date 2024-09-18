package anudip;

public class star {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            // Inner loop to print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
