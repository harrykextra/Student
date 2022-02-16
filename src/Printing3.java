import java.util.Scanner;
public class Printing3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter side value:");
		int side = input.nextInt();
		squareOfAsterisks(side);
	}
	
	public static void squareOfAsterisks(int side) {
		for( int counter = 1; counter <= side; ++counter) {
			for(int counter2 = 1; counter2 <= side; ++counter2) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
