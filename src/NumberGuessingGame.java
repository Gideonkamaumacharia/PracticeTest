import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = random.nextInt(10) + 1;
        int attempts = 3;
        boolean hasWon = false;

        System.out.println("I have picked a number between 1 and 10.");
        System.out.println("You have 3 attempts to guess it.");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                hasWon = true;
                break;
            } else if (guess > secretNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
        }

        if (hasWon) {
            System.out.println(" Congratulations! You guessed the number.");
        } else {
            System.out.println("You lost! The correct number was " + secretNumber);
        }

        scanner.close();
    }
}
