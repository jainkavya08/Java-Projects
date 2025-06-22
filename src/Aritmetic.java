import java.util.Scanner;

public class Aritmetic {
    public static void main (String args[]) {

        // Write a Java program that takes two numbers from the user and prints:

        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        System.out.print("Enter two numbers: ");
        x = scanner.nextInt();
        y = scanner.nextInt();

        // SUM
        System.out.println("Sum: " + (x + y));
        // Difference
        System.out.println("Difference: " + (x - y));
        // Product
        System.out.println("Product: " + ( x * y));
        // Quotient
        System.out.println("Quotient: " + (x / y));
        // Remainder
        System.out.println("Remainder: " + (x % y));

        scanner.close();
    }
}
