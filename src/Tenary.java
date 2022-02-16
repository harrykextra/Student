import java.util.Scanner;

public class Tenary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter grade");
		int studentGrade = input.nextInt();
		System.out.println(studentGrade >= 60 ? 1 : 2);

	}

}
