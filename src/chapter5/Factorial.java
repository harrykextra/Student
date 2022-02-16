package chapter5;

public class Factorial {

	public static void main(String[] args) {
		long factorial = 1;
		for (int i = 1; i <= 20; ++i) {
			factorial = factorial * i;
			System.out.printf("%d%,30d%n", i, factorial);
		}
	}

}
