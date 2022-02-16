
public class Tabular {

	public static void main(String[] args) {
		System.out.printf("%s%4s%8s%12s%n", "N", "10*N", "100*N", "1000*N");
		
		int counter = 1;
		while(counter <= 5) {
			int a = 10 * counter;
			int b = 100 * counter;
			int c = 1000 * counter;
			System.out.printf("%d%4d%8d%12d%n", counter, a, b, c);
			++counter;
		}
	}

}
