package chapter15;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int sum = 0;
		for (int a = 1; a <= 3; ++a) {
			for (int b = 1; b <= 3; ++b) {
				for (int c = 1; c <= 3; ++c) {
					for (int d = 1; d <= 3; ++d) {
						for (int e = 1; e <= 3; ++e) {
							for (int f = 1; f <= 3; ++f) {
								for (int g = 1; g <= 3; ++g) {
									for (int h = 1; h <= 3; ++h) {
										total += 1;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(total);
		for (int y = 1; y <= 3; y++) {
			for (int x = 1; x <= 3; ++x) {
				sum += 1;
			}
		}
		System.out.println(sum);
		char[] two = {'a', 'b', 'c'};
		char[] three = {'d', 'e', 'f'};
		for (char letter:two) {
			System.out.println(letter);
			for(char letter2:three) {
				System.out.print(letter2);
			}
			System.out.println();
		}
	}

}
