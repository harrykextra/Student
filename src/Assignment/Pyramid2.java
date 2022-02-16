package Assignment;

public class Pyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		
		while (i <= 5) {
			for (int space = 6; space >= i; --space) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print(i - j + 1);
			}
			
			for (int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
			++i;
		}

	}

}
