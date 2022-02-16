import java.util.Scanner;
public class MinimumValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number:");
		double x = input.nextDouble();
		System.out.println("Enter second number:");
		double y = input.nextDouble();
		System.out.println("Enter third number:");
		double z = input.nextDouble();
		minimum3(x, y, z);

	}
	
	public static void minimum3(double x, double y, double z) {
		double smallestValue = Math.min(Math.min(x, y), z);
		System.out.printf("The minimum value is %f", smallestValue);
	}

}
