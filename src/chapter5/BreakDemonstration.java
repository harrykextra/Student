package chapter5;

public class BreakDemonstration {

	public static void main(String[] args) {
		int x = 1;
		while (x <= 20) {
			int y = x + (x + 1) + 6;
			System.out.printf("%d,%d,%d%n",x, (x+1), y);
			if (y ==21) {
				break;
			}
			++x;
		}

	}

}
