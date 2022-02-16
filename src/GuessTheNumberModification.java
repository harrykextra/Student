import java.util.Scanner;
import java.security.SecureRandom;
public class GuessTheNumberModification {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SecureRandom randomNumbers = new SecureRandom();
		System.out.println("Guess a number between 1 and 1000:");
		int guess = input.nextInt();
		int fact = 1 + randomNumbers.nextInt(1000);
		
		int counter = 0;	
		
		while (guess != fact) {
			if (guess > fact) {
				System.out.println("Too high. Try again.");
			}
			if (guess < fact) {
				System.out.println("Too low. Try again.");
			}
			counter = counter + 1;
	
			System.out.println("Guess a number between 1 and 1000:");
			guess = input.nextInt();
		}
		
		System.out.println("Congratulations. You guessed the number!");
		
		if (counter < 10) {
			System.out.println("Either you know the secret or you got lucky");
		}
		if (counter == 10) {
			System.out.println("Aha! You know the secret");
		}
		if (counter > 10) {
			System.out.println("You should be able to do better");
		}
		
		System.out.println("Would you like to play again?");
		
	}

}
