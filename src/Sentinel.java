import java.util.Scanner;

public class Sentinel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter grade or -1 to terminate");
		int grade = input.nextInt();
		int sum = 0;
		int counter = 0;
		while (grade != -1) {
			if (grade < 50) {
			sum = sum + grade;
			counter = counter + 1;
			}
			
			System.out.println("Enter grade or -1 to terminate");
			grade = input.nextInt();
		}
		int average = sum / counter;
		System.out.printf("Average is %d, frequency is %d", average, counter);
		
	}

}
