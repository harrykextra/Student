package Chapter7;

public class Praxctice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= new int[20];
		for(int i = 0; i < num.length; ++i ) {
			if((i+1)%2 == 0) {
				num[i] = 2;
				//System.out.print(num[i]);
			}
			//else {
				System.out.print(num[i]);
			//}
		}

	}

}
