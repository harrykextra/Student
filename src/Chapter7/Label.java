package Chapter7;

public class Label {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] sales = new int[3][5];
		int count = 0;
		for (int row = 0; row < sales.length; row++) {
			for (int col = 0; col < sales[row].length; col++) {
				sales[row][col] = 0;
				++count;
				System.out.printf("%2d,%d ", count,sales[row][col]);
			}
			System.out.println();
		}
	}

}
