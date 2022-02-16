package chapter5;
import java.util.Scanner;

public class LargestAndSmallest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter iteration");
		int iteration = input.nextInt();
		System.out.println("Enter number");
		int smallest = input.nextInt();
		int largest = 0;
		for (int i = 1; i < iteration; i++) {
			System.out.println("Enter number");
			int number = input.nextInt();
			if (number < smallest) {
				smallest = number;
			}
			if (i == 1) {
				largest = number;
			}
			else if (number > largest) {
				largest = number;
			}
		}
		System.out.printf("The smallest number is %d%n", smallest);
		System.out.printf("The largest number is %d", largest);

	}

}

