import java.util.Scanner;
public class Printing4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter side value:");
		int side = input.nextInt();
		System.out.println("Enter character:");
		char fill = input.next().charAt(0);
		squareOfAsterisks(side, fill);
	}
	
	public static void squareOfAsterisks(int side, char fillCharacter) {
		for( int counter = 1; counter <= side; ++counter) {
			for(int counter2 = 1; counter2 <= side; ++counter2) {
				System.out.print("%d", );
			}
			System.out.println();
		}
	}

}
	


