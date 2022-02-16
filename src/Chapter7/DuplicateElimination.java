package Chapter7;

import java.util.Scanner;
public class DuplicateElimination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter five numbers each between 10 and 100 inclusive");
		System.out.println("Enter first number:");
		int firstNumber = input.nextInt();
		System.out.println("Enter second number:");
		int secondNumber = input.nextInt();
		System.out.println("Enter third number:");
		int thirdNumber = input.nextInt();
		System.out.println("Enter fourth number:");
		int fourthNumber = input.nextInt();
		System.out.println("Enter fifth number:");
		int fifthNumber = input.nextInt();
		
		int[] fiveNumbers = {firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber};
		int[] frequency = new int[101];
		
		for (int number : fiveNumbers) {
			++frequency[number];
		}
		
		int count = 0;
		System.out.println("The unique numbers entered are:");
		for (int number = 10; number < frequency.length; ++number) {
			if (frequency[number] == 1) {
				System.out.println(number);
				++count;
			}
		}
		if (count == 0) {
			System.out.println("No unique number was entered");
		}
	}

}
