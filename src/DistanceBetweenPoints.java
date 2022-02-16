import java.util.Scanner;
public class DistanceBetweenPoints {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter coordinate x1:");
		double x1 = input.nextDouble(); 
		System.out.println("and y1:");
		double y1 = input.nextDouble();
		System.out.println("Enter coordinate x2:");
		double x2 = input.nextDouble(); 
		System.out.println("and y2:");
		double y2 = input.nextDouble();
		
		distance(x1, x2, y1, y2);

	}
	
	public static double distance(double x1, double x2, double y1, double y2) {
		double z = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.printf("The distance between (x1, y1) and (x2, y2) is %f%n", z);
		return z;
	}

}