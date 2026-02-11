import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int number = random.nextInt(100) + 1; // generates 1 to 100
        int guess;
        int attempts = 0;

        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1 and 100");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too High!");
            } 
            else if (guess < number) {
                System.out.println("Too Low!");
            } 
            else {
                System.out.println("Correct! You guessed the number.");
                System.out.println("Total attempts: " + attempts);
                break;
            }
        }

        sc.close();
    }
}


import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        char playAgain;

        do {
            int number = random.nextInt(100) + 1; // 1 to 100
            int guess;
            int attempts = 0;

            System.out.println("\n=================================");
            System.out.println("WELCOME TO NUMBER GUESSING GAME");
            System.out.println("=================================");
            System.out.println("Guess a number between 1 and 100\n");

            while (true) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess > number) {
                    System.out.println("Too High! Try again.");
                } 
                else if (guess < number) {
                    System.out.println("Too Low! Try again.");
                } 
                else {
                    System.out.println("\nCONGRATULATIONS!");
                    System.out.println("You guessed the correct number: " + number);
                    System.out.println("Total attempts: " + attempts);
                    break;
                }
            }

            System.out.print("\nDo you want to play again? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\nThanks for playing! See you again.");
        sc.close();

	}

}

