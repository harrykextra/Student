import java.util.Scanner;
public class Multiples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int x = input.nextInt();
		System.out.println("Enter second number: ");
		int y = input.nextInt();
		isMultiple(x, y);

	}
	
	public static void isMultiple(int x, int y) {
		if (x % y == 0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
