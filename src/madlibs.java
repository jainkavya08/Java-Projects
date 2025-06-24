import java.util.Scanner;

public class madlibs {
    public static void main (String[] args) {

        // MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);

        // Welcome msg
        System.out.println("Mad Libs Story Generator ");


        // Declare variables
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        int choice;


        // Let users choose the story template
        System.out.println("1: Horror Mads lib Story. ");
        System.out.println("2: Thriller Mads lib Story. ");
        System.out.print("Select the option for story mode from above: ");
        choice = scanner.nextInt();
        scanner.nextLine();


        // Input words for the story
        System.out.print("\nEnter an adjective (description): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun (person or animal): ");
        noun1 = scanner.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb ending in -ing (e.g., running): ");
        verb1 = scanner.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();


        // Story template 1 ( Horror )
        if(choice == 1) {
            System.out.println("\nLast night, I heard a " + adjective1 + " whisper coming from the " + noun1 + ".");
            System.out.println("I grabbed a " + adjective2 + " object and " + verb1 + " toward the sound.");
            System.out.println("Suddenly, a " + adjective3 + " creature leapt out of the shadows!");
            System.out.println("Since then, I never go near the " + noun1 + " after midnight.");
        }

        // Story template 2 ( Thriller )
        else if(choice == 2) {
            System.out.println("\nThe " + adjective1 + " lights flickered in the " + noun1 + ".");
            System.out.println("Something " + adjective2 + " moved behind me and I " + verb1 + " without looking back.");
            System.out.println("A " + adjective3 + " scream echoed through the hallway.");
            System.out.println("Whatever it was, it’s still out there… watching.");
        }

        // choice not valid
        else {
            System.out.println("Enter choice is not valid");
        }

        scanner.close();
    }
}
