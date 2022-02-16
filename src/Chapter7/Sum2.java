package Chapter7;

public class Sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
		int[][] array2 = {{1,2}, {3}, {4, 5, 6}};
		
		int total1 = arraySum(array1);
		System.out.printf("The sum of the elements in array 1 is %d%n", total1);
		
		int total2 = arraySum(array2);
		System.out.printf("The sum of the elements in array 2 is %d", total2);
	}
	
	public static int arraySum(int[][] array) {
		int total = 0;
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				total += array [row][column];
			}
		}
		return total;
	}

}
