package Assignment;

import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x;
		do {
			System.out.println("Enter first number:");
			x = input.nextInt();
			System.out.println("Enter second number:");
			int y = input.nextInt();
			int total = x + y;
			System.out.println("The total is " + total);
			System.out.println("Would you like to perform the operation again");
		}while (x != -1);

	}

}
