package Assignment;

import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = 0;
		System.out.println("Enter an integer");
		int num = input.nextInt();
		
		while (num != 0) {
			int a = num % 10;
			
			x = (x * 10) + a;
			num = num /10;
		}
		System.out.println("The reverse number is " + x);
		

	}

}
