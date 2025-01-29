package Day6.Assignment2.ProblemStatements;

import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100 and I'll try to guess it!");
        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;
        while (!guessedCorrectly) {
            int guess = generateGuess(low, high);
            System.out.println("My guess is: " + guess);
            System.out.println("Is my guess too high, too low, or correct? (Enter 'high', 'low', or 'correct')");
            String feedback = input.nextLine().trim().toLowerCase();
            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("correct")) {
                guessedCorrectly = true;
                System.out.println("I guessed it! Your number was " + guess);
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }

        input.close();
    }
    public static int generateGuess(int low, int high) {
        return low + (int) (Math.random() * (high - low + 1));
    }
}
