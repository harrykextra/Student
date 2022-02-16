package Chapter7;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ARRAY_LENGTH = 10;
		double[] fractions = new double[ARRAY_LENGTH];
		
		System.out.println("The initialized values elements are:");
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for(int counter = 0; counter < ARRAY_LENGTH; ++counter) {
			System.out.printf("%4d%8.3f%n", counter, fractions[counter]);
		}
		System.out.printf("Array element 4 is: %.3f%n", fractions[4]);
		fractions[9] = 1.667;
		fractions[6] = 3.333;
		System.out.println("ARRAY CHECK DUE TO NEW ASSIGNMENT:");
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for(int counter = 0; counter < ARRAY_LENGTH; ++counter) {
			System.out.printf("%4d%8.3f%n", counter, fractions[counter]);
		}
		double total = 0;
		for(int counter = 0; counter < ARRAY_LENGTH; ++counter) {
			total += fractions[counter];
		}
		System.out.printf("Sum of array elements is: %.3f", total);

	}

}
