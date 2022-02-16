import java.util.Scanner;
public class RightTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of LONGEST side:");
		int a = input.nextInt();
		System.out.println("Enter value of second side:");
		int b = input.nextInt();
		System.out.println("Enter value of third side:");
		int c = input.nextInt();
		int x = a * a;
		int y = b * b;
		int z = c * c;
		
		if(x != 0) {
			if(y != 0) {	
				if (z != 0) {
					if (x == y + z) {
						System.out.println("This is a right triangle");
					}
					else {
						System.out.println("This is NOT a right triangle");
					}
				}
				else {
					System.out.println("Invalid entry");
				}
			}
			else {
				System.out.println("Invalid entry");
			}
		}
		else {
			System.out.println("Invalid entry");
		}	
		
			
		
			


	}

}
