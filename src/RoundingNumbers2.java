import java.util.Scanner;
public class RoundingNumbers2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number:");
		double x = input.nextDouble();
		double result1 = roundToInteger(x);
		double result2 = roundToTenths(x);
		double result3 = roundToHundredths(x);
		double result4 = roundToThousandths(x);
		 
		 System.out.printf("%f rounded to the nearest integer, 10th, 100th and 1000th are %f, %f, %f and %f respectively", x, result1,
				 result2, result3, result4);
				

	}
	
	public static double roundToInteger(double x) {
		double y = Math.floor(x + 0.5);
		return y;
	}
	
	public static double roundToTenths(double x) {
		double y = Math.floor(x * 10 + 0.5)/ 10;
		return y;
	}
	
	public static double roundToHundredths(double x) {
		double y = Math.floor(x * 100 + 0.5)/ 100;
		return y;
	}
	
	public static double roundToThousandths(double x) {
		double y = Math.floor(x * 1000 + 0.5)/ 1000;
		return y;
	}
	
		

}
