package Assignment;

import java.util.Scanner;
import java.security.SecureRandom;
public class GuessGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SecureRandom randomNumbers = new SecureRandom();
		System.out.println("Guess a number:");
		int guess = input.nextInt();
		int fact = randomNumbers.nextInt();
		
			
		
		while (guess != fact) {
			if (guess > fact) {
				System.out.println("Too high. Try again.");
			}
			if (guess < fact) {
				System.out.println("Too low. Try again.");
			}
	
			System.out.println("Guess a number:");
			guess = input.nextInt();
		}
		
		System.out.println("Congratulations. You guessed the number!");
		System.out.println("Would you like to play again?");
		
	}

}

