package anudip;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long factorial = 1;
        int i = number;

        while (i > 0) {
            factorial *= i;
            i--;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
