import java.util.Scanner;

public class Exponentiation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter base: ");
			int x = input.nextInt();
		System.out.println("Enter exponent: ");
			int y = input.nextInt();
			int result = integerPower(x, y);
		System.out.printf("The result is: %d", result);	

	}
	
	public static int integerPower(int x, int y) {
		
		int counter = 1;
		while(counter <= (y - 1)) {
			x = x * x;
			++counter;
		}
		return x;
	}

}
