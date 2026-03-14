import java.util.Scanner;
import java.util.Random;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int numbertoguess = rand.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 10; 
        boolean won = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I've picked a number between 1-100. You have " + maxAttempts + " tries!");

        while (attempts < maxAttempts) {
            System.out.println("\nAttempt " + (attempts + 1) + ": Enter your guess:");
            int guessedno = sc.nextInt();
            attempts++;
            
            if (numbertoguess == guessedno) {
                
                int score = (maxAttempts - attempts + 1) * 10; 
                System.out.println("Correct! You took " + attempts + " tries.");
                System.out.println("Your Score: " + score + "/100");
                won = true;
                break;
            } 
            else if (guessedno < numbertoguess) {
                System.out.println("Too Low!");
            } 
            else {
                System.out.println("Too High!");
            }
        }

        if (!won) {
            System.out.println("\nGame Over! You ran out of attempts.");
            System.out.println("The number was: " + numbertoguess);
            System.out.println("Your Score: 0");
        }
        
        sc.close();
    }
}
