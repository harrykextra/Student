package chapter5;

public class PrintingTriangle {

	public static void main(String[] args) {
		int i = 1;
		int space = 4;
		while(i <= 10) {
			int j = 10;
			while (j >= i) {
				System.out.print("*");
				--j;
			}
			int sp = 1;
			while (sp < space) {
				System.out.print(" ");
				++sp;
			}
			
			int k = 10;
			while(k >= i) {
				System.out.print("*");
				--k;
			}
			System.out.println();
			space += 2;
			++i;
		}
	}

}
