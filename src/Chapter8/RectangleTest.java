package Chapter8;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = new Rectangle();
		displayResult("Iniitail results: ",obj);
		System.out.println();
		obj.setLength(15.3);
		obj.setWidth(9);
		displayResult("Results after setting length and width: ",obj);
		System.out.println();
		
		try {
		obj.setLength(45);
		}
		catch (IllegalArgumentException e) {
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}
		try {
		obj.setWidth(23.6);
		}
		catch (IllegalArgumentException e) {
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}
		displayResult("Results after setting invalid values: ",obj);

	}
	
	private static void displayResult(String header, Rectangle x) {
		System.out.printf("%s%nThe rectangle's perimeter is %.1f%nand it's area is %.1f%n", header, x.getPerimeter(), x.getArea());
	}

}
