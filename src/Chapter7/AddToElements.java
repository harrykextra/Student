package Chapter7;

public class AddToElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bonus = new int[15];
		System.out.println("NEW ELEMENTS OF ARRAY BONUS");
		System.out.printf("%s%6s%n", "Index", "Value");
		for (int i = 0; i < bonus.length; ++i) {
			++bonus[i];
			System.out.printf("%5d%6d%n", i, bonus[i]);
		}

	}

}
