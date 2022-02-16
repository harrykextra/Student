package Chapter7;

public class CopyInto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9,10,11};
		int[] b = {34,33,32,31,30,29,28,27,26,25,24,23,22,21,
				20,19,18,17,16,15,14,13,12,11,9,8,7,6,5,4,3,2,1};
		for (int i = 0; i < a.length; ++i) {
			b[i] = a[i];
		}
		for (int j = 0; j < b.length; ++j) {
			System.out.printf("%d, ", b[j]);
		}
	}

}
