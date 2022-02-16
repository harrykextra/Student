import java.util.Scanner;

public class Maximum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers with a space between them");
		int x = input.nextInt();
		int y = input.nextInt();
		double result = maximum(x, y);
		System.out.printf("The maximum is %f", result);


	}
	
	public static int maximum(int x, int y) {
		int max = x;
		if (y > max) {
			max = y;
		}
		return max;
	}
	public static double maximum(double x, double y) {
		double max = x;
		if (y > max) {
			max = y;
		}
		return max;
	}

}
