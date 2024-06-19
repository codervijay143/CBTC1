import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        int rounds=3;
        int maxAttempts=5;
        int score=0;

        System.out.println("Welcome to the Guess Number game!");
        System.out.println("You have "+rounds+" rounds to play.");

        for (int round = 1; round <= rounds ; round++) {
            int numberToGuess= random.nextInt(100)+1;
            int attempts=0;
            boolean hasGuessedCorrectly=false;

            System.out.println("\nRound "+round);
            System.out.println("I have Selected the number between 1 to 100.Try to Guess it!");

            while (attempts<maxAttempts){
                System.out.println("Enter your Guess: ");
                int userGuess= scanner.nextInt();
                attempts++;

                if(userGuess==numberToGuess){
                    System.out.println("Congratulations! You Guessed the Correct Number.");
                    hasGuessedCorrectly=true;
                    score+=(maxAttempts-attempts+1)*10;
                } else if (userGuess<numberToGuess) {
                    System.out.println("Too low! Try Again.");
                }else {
                    System.out.println("Too High! Try Again.");
                }
            }
            if(!hasGuessedCorrectly){
                System.out.println("Sorry ,you have used all your attempts. The correct number was: "+numberToGuess);
            }
        }

        System.out.println("\nGame Over!");
        System.out.println("Your final Score is: "+score);
        scanner.close();
    }
}