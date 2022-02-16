package Chapter7;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = {34, 44, 62, 3, 76, 88, 90, 61, 45};
		int total = 0;
		for(int counter = 0; counter < c.length; ++counter) {
			total += c[counter];
		}
		System.out.println(total);

	}

}
