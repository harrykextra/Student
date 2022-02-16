import java.util.Scanner;
public class DanglingElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x value: ");
		int x = input.nextInt();
		System.out.println("Enter y value: ");
		int y = input.nextInt();
		
			if (x < 10)
			if (y > 10)
			System.out.println("*****");
			else
			System.out.println("#####");
			System.out.println("$$$$$");

	}

}
