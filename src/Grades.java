import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter grade");
		int grades = input.nextInt();
		
		if (grades >= 90) {
			System.out.println("A");
		}
			else if (grades >= 80) {
				System.out.println("B");
			}
				else if (grades >= 70) {
					System.out.println("C");
				}
					else if (grades >= 60) {
						System.out.println("D");
					}
						else {
							System.out.println("F");
						}
					
				
			
		

	}

}
