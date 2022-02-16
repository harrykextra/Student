import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber obj = new PrimeNumber();
		obj.prime();

	}
	
	public void prime() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = input.nextInt();
		
		if (num == 0) {
			System.out.println("This number is NOT a prime number");
		}
		else if (num >= 4 && (num % 2 == 0 || num % 3 == 0)) {
			System.out.println("This number is NOT a prime number");
		}
		else if (num > 5 && num % 5 == 0) {
			System.out.println("This number is NOT a prime number");
		}
		else if (num > 7 && num % 7 == 0) {
			System.out.println("This number is NOT a prime number");
		}
		else {
			System.out.println("This is a prime number");
		}
	}

}
