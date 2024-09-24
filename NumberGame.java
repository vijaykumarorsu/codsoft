import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        boolean playAgain = true;
        int totalRounds = 0;
        int totalAttempts = 0;
        
        System.out.println("Welcome to the Enhanced Number Guessing Game!");

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;
            
            System.out.println("Round " + (totalRounds + 1) + ": Guess a number between 1 and 100.");
            
            while (!guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                }
            }
            
            totalRounds++;
            totalAttempts += attempts;
            
            System.out.print("Do you want to play another round? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }
        
        System.out.println("\nGame over!");
        System.out.println("Total rounds played: " + totalRounds);
        System.out.println("Average attempts per round: " + (totalAttempts / (double) totalRounds));
        
        scanner.close();
    }
}
