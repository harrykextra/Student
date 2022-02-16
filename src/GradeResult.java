import java.util.Scanner;
public class GradeResult {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter grade:");
		int grade = input.nextInt();
		qualityPoints(grade);

	}
	
	public static void qualityPoints(int grade) {
		switch (grade / 10) {
		case 9:
		case 10:
			System.out.println(4);
			break;
		
		case 8:
			System.out.println(3);
			break;
			
		case 7:
			System.out.println(2);
			break;
		
		case 6:
			System.out.println(1);
			break;
			
		default:
			System.out.println(0);
			break;
		}
	}

}
