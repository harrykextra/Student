
public class Sum {

	public static void main(String[] args) {
		int counter = 1;
		int total = 0;
		while (counter <= 7) {
			total = total + counter;
			if (total % 6 == 0) {
				total -= counter;
			}
			
			counter++;
		}
		System.out.println(total);

	}

}
