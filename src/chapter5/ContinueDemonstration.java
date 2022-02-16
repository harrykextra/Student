package chapter5;

public class ContinueDemonstration {

	public static void main(String[] args) {
		int x = 0;
		int counter=0;
		int y=0;
		while (counter<20) {
			x++;
			counter++;
			y = x + (x + 1) + 6;
			//System.out.printf("%d,%d,%d%n",x, (x+1), y);
			if (y ==21) {
				continue;
				//System.out.printf("%d,%d,%d%n",x, (x+1), y);
			}
			System.out.printf("%d,%d,%d%n",x, (x+1), y);
		}

	}

}
