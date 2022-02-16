import java.util.Scanner;
public class Sum20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 1;
		int total = 0;
		System.out.println("Enter count:");
		int x = input.nextInt();
		while (counter <= x) {
			int y = 2 * counter;
			total = total + y;
			++counter;
		}
		System.out.printf("%d", total);

	}

}
