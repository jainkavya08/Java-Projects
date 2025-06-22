import java.util.Scanner;

public class Augmented {
    public static void main (String[] args) {

        // Take a number from the user and then:

        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.print("Enter a number: ");
        x = scanner.nextInt();

        // Add 10
        System.out.println("Adding 10: " + ( x += 10));
        // Multiply 2
        System.out.println("Multplying using 2: " + (x *= 2));
        // Subtract 5
        System.out.println("Subtracting by 5: " + (x -= 5));
        // Divide 3
        System.out.println("Dividing by 3: " + (x /= 3));


        scanner.close();

    }
}
