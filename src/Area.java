import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double r = input.nextDouble();
		double area = Math.PI * r * r;
		System.out.printf("The area is: %f", area);

	}

}
