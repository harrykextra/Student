import java.util.Scanner;
public class Even {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = input.nextInt();
		isEven(number);
		
	}
	
	public static void isEven(int number) {
		if (number % 2 == 0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
