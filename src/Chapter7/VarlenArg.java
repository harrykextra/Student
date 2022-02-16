package Chapter7;

public class VarlenArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 3;
		int n2 = 5;
		int n3 = 6;
		int n4 = 9;
		
		System.out.printf("n1 = %d%nn2 = %d%nn3 = %d%nn4 = %d%n", n1, n2, n3, n4);
		
		System.out.printf("The product of n1 and n2 is %d%n", product(n1, n2));
		
		System.out.printf("The product of n1, n2 and n3 is %d%n", product(n1, n2, n3));
		
		System.out.printf("The product of n1, n2, n3 and n4 is %d", product(n1, n2, n3, n4));

	}
	
	public static int product(int... numbers) {
		int result = 1;
		for(int counter = 0; counter < numbers.length; ++counter) {
			result *= numbers[counter];
		}
		return result;
	}

}
