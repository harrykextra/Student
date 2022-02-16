package Chapter7;

import java.util.Scanner;
public class ValuesFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] t = new int[2][3];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < t.length; ++i) {
			for (int j = 0; j < t[i].length; ++j) {
				System.out.printf("Enter array[%d][%d]%n", i, j);
				t[i][j] = input.nextInt();
			}
		}
		
		int smallest = t[0][0];
		for (int i = 0; i < t.length; ++i) {
			for (int j = 0; j < t[i].length; ++j) {
				if (t[i][j] < smallest) {
					smallest = t[i][j];
				}
			}
		}
		System.out.println("The smallest number is "+ smallest);
		
		System.out.printf("The elements of the first row are: "
				+ "(%d, %d, %d)%n", t[0][0], t[0][1], t[0][2]);
		
		System.out.printf("The total of elements of the 3rd column is %d%n",
				t[0][2] + t[1][2]);
		
		//Alternatively:
		int thirdColSum = 0;
		for (int i = 0; i < t.length; ++i) {
			for (int j = 2; j == 2; ++j) {
				thirdColSum += t[i][j];
			}
		}
		System.out.printf("The total of elements of the 3rd column is %d%n",
				thirdColSum);
		
		System.out.printf("%3d%3d%3d%n", 0, 1, 2);
		for (int i = 0; i < t.length; ++i) {
			System.out.print(i);
			for (int j = 0; j < t[i].length; ++j) {
				System.out.printf("%3d",t[i][j]);
				if (j == 2)
					System.out.println();
			}
		}
	}
	

}
