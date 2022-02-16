package Chapter7;

import java.util.Scanner;

import java.lang.reflect.Array;

public class FIbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = input.nextInt();
		fibonacci(n);
		

	}
	
	public static int fibonacci(int n) {
		int nthNumber = 0;
		for(int m = 0; m < n; ++m) {
			
			for(int counter = 0; counter < m; ++counter) {
				nthNumber = counter + nthNumber;
				//if(n < n-2)
				//	break;
				System.out.printf("%d, ", nthNumber);
			}
		}
		return nthNumber;
	}

}
