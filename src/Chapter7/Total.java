package Chapter7;

public class Total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] d = new int[4][6];
		int[][]d = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},
		             {19,20,21,22,23,45}};
		int sum = 0;
		for(int[] i : d) {
			for(int j : i) {
				sum += j;
			}
		}
		System.out.println(sum);
	}

}
