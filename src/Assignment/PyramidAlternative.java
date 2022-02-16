package Assignment;

public class PyramidAlternative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		for(int v = 1; v <= 5; v++) {
			for (int z = 6; z >= v; z--) {
				System.out.print(" ");
			}
			for(int f = 1; f <= x; f++) {
				System.out.print(v);
			}
			x = x + 2;
			System.out.println();
		}

	}

}
