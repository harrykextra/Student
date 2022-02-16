
public class Printing {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 4) {
			int x = 1;
			while(x <= i) {
				System.out.print("*");
				x++;
			}
			System.out.println();
			i++;
		}
	}

}
