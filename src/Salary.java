import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		int employeeCounter = 1;
		double pay;
		while(employeeCounter <= 3){
			System.out.println("Enter number of hours worked: ");
			int hours = input.nextInt();
			System.out.println("Enter rates");
			double t = input.nextDouble(); 

			if (hours == 40){
				pay = t;
			}
			else if (hours > 40){
				pay = t + (hours - 40) * 1.5 * t;
			}
			else{
				pay = 0;
			}
			System.out.printf("Gross pay is: %.2f%n",pay);
			employeeCounter = employeeCounter + 1;
		}

	}

}
