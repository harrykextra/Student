import java.util.Scanner;
public class RightTriangle2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter side 1:");
		double a = input.nextDouble();
		System.out.println("Enter side 2:");
		double b = input.nextDouble();
		hypotenuse(a, b);

	}
	
	public static double hypotenuse(double a, double b) {
		double c = Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));
		System.out.printf("The hypotenuse is %.2f%n", c);
		return c;
	}

}
