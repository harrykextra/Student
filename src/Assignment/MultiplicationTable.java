package Assignment;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = input.nextInt();
		
		for(int counter = 1; counter <= 12; ++counter) {
			int product = num * counter;
			System.out.printf("%d times %d is %d%n", num, counter, product);
		}

	}

}
