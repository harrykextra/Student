package chapter5;

public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long productEven = 1;
		long productOdd = 1;
		for (int i = 1; i <= 40; ++i) {
			if (i % 2 == 1) {
				productOdd = productOdd * i;
			}
			if (i % 2 == 0) {
				productEven = productEven * i;
			}
		}
		
		System.out.printf("The product of the odd numbers is %d%n", productOdd);
		System.out.printf("The product of the even numbers is %d", productEven);

	}

}
