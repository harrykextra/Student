package chapter5;

import java.security.SecureRandom;

public class Random20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom random = new SecureRandom();
		
		for (int i = 1; i <= 20; ++i) {
			int x = random.nextInt();
			if (x % 3 == 0) {
				System.out.println(x);
			}
		}

	}

}
