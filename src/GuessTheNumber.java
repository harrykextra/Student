import java.util.Scanner;
import java.security.SecureRandom;
public class GuessTheNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SecureRandom randomNumbers = new SecureRandom();
		System.out.println("Guess a number between 1 and 1000:");
		int guess = input.nextInt();
		int fact = 1 + randomNumbers.nextInt(1000);
		
			
		
		while (guess != fact) {
			if (guess > fact) {
				System.out.println("Too high. Try again.");
			}
			if (guess < fact) {
				System.out.println("Too low. Try again.");
			}
	
			System.out.println("Guess a number between 1 and 1000:");
			guess = input.nextInt();
		}
		
		System.out.println("Congratulations. You guessed the number!");
		System.out.println("Would you like to play again?");
		
	}

}
