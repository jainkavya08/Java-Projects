package Arithmetic_Conditions;

import java.util.Scanner;
import java.util.Random;

public class Luckynumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int luckyNumber = random.nextInt(10) + 1;
        int attempts = 3;
        int guess;

        System.out.println("Welcome to lucky number Game trivia.");
        System.out.println("Guess the number between 1 to 10 . You have 3 tries.");

        while (attempts > 0) {
            System.out.print("\nEnter your guess: ");
            guess = scanner.nextInt();


            if (guess == luckyNumber) {
                System.out.println("Yayyyyy!!! You won the jackpot");
                break;
            } else if (guess > luckyNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }

            attempts--;
            if (attempts > 0) {
                System.out.println("Tries left: " + attempts);
            } else {
                System.out.println("Out of tries! The lucky number was: " + luckyNumber);
            }
        }
    }
}
