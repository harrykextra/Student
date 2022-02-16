import java.util.Scanner;
public class RoundingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		double x = input.nextDouble();
		double y = Math.floor(x + 0.5);
		System.out.printf("%.2f rounded up is %.2f", x, y);
		// TODO Auto-generated method stub

	}

}
