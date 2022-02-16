import java.util.Scanner;

public class Area2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double r = input.nextDouble();
		circleArea(r);

	}
	
	public static double circleArea(double r) {
		double area = Math.PI * r * r;
		System.out.printf("The area is: %f", area);
		return area;

	}

}
