package chapter5;
import java.util.Scanner;

public class SmallestValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter iteration");
		int iteration = input.nextInt();
		System.out.println("Enter number");
		int smallest = input.nextInt();
		for (int i = 1; i < iteration; i++) {
			System.out.println("Enter number");
			int number = input.nextInt();
			if (number < smallest) {
				smallest = number;
			}
		}
		System.out.printf("The smallest number is %d", smallest);
	}

}
