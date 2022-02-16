package chapter5;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount;
		
		System.out.printf("%s%20s%n", "Year", "Amount on deposit");
		
		for (double rate = 0.05; rate <= 0.1; rate += 0.01) {
			System.out.printf("For %.2f%n", rate);
			for (int year = 1; year <= 10; ++year) {
				amount = 1000 * Math.pow(1.0 + rate, year);
				System.out.printf("%4d%,20.2f%n", year, amount);
			}
		}

	}

}
