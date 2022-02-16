package Assignment;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		
		while (i <= 5) {
			for (int space = 6; space >= i; --space) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print(i);
			}
			System.out.println();
			++i;
		}

	}

}
