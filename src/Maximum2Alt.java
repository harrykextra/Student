import java.util.Scanner;
public class Maximum2Alt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers with a space between them");
		int x = input.nextInt();
		int y = input.nextInt();
		int result = maximum(x, y);
		System.out.printf("The maximum is %d", result );

	}
	public static int maximum(int x, int y) {
		if (x > y) {
			return x;
		}
		else {
			return y;
		}
	}

}
