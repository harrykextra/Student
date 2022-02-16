import java.util.Scanner;
public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter four numbers with space between each");
		int w = input.nextInt();
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		Maximum obj = new Maximum();
		
		obj.largest(w, x, y, z);
		System.out.println("The greatest number is " + obj.largest(w, x, y, z));

	}
	
	public int largest(int w, int x, int y, int z) {
		int max = w;
		if (x > w) {
			max = x;
		}
		if (y > x) {
			max = y;
		}
		if (z > y) {
			max = z;
		}
		return max;
	}

}
