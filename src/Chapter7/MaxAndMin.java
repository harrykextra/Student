package Chapter7;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] F = new double[99];
		for(int i= 0; i < F.length; ++i) {
			F[i] = i * 10 + (i + 0.5) / 10;
		}
		double largest = F[0];
		for(int i= 0; i < F.length; ++i) {
			if (F[i] > largest) {
				largest = F[i];
			}
		}
		System.out.println(largest);
	}

}
