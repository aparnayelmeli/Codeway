import java.util.Scanner;
import java.util.Random;

public class NumGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 5;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        boolean playAgain = true;
        while (playAgain) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("I have picked a number between " + minRange + " and " + maxRange + ". You have " + attempts + " attempts to guess it.");

            int remainingAttempts = attempts;
            boolean guessedCorrectly = false;
            while (remainingAttempts > 0 && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    guessedCorrectly = true;
                    score += remainingAttempts;
                } else if (guess < randomNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                remainingAttempts--;
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
            }

            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = scanner.next();
            playAgain = playChoice.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
