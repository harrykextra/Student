package Chapter7;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomNumbers = new Random();
		int[] frequency = new int[13];
		
		for (int counter = 1; counter <= 36000000; ++counter) {
			int face1 = 1 + randomNumbers.nextInt(6);
			int face2 = 1 + randomNumbers.nextInt(6);
			int sum = face1 + face2;
			++frequency[sum];
		}
		System.out.printf("%s%10s%n", "Sum", "Frequency");
		for (int sum = 2; sum < frequency.length; ++sum) {
			System.out.printf("%3d%10d%n", sum, frequency[sum]);
		}

	}

}
