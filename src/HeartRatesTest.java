import java.util.Scanner;

public class HeartRatesTest {

	public static void main(String[] args) {
		HeartRates obj = new HeartRates("Joe", "Black", 4, 3, 1999, 2018);
		System.out.printf("%s %s was born %d/%d/%d%n", obj.getFirstName(), obj.getLastName(), obj.getMonth(), obj.getDay(), obj.getYear());
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = input.nextLine();
		System.out.println("Enter last name: ");
		String lastName = input.nextLine();
		System.out.println("Enter date of birth; Month: ");
		int month = input.nextInt();
		System.out.println("Day: ");
		int day = input.nextInt();
		System.out.println("Year: ");
		int year = input.nextInt();
		System.out.println("Enter current year: ");
		int currentYear = input.nextInt();
		
		obj.setFirstName(firstName);
		obj.setLastName(lastName);
		obj.setMonth(month);
		obj.setDay(day);
		obj.setYear(year);
		obj.setCurrentYear(currentYear);
		
		System.out.printf("%s %s is %d years old%n", obj.getFirstName(), obj.getLastName(), obj.getAge());
		System.out.printf("Your maximum heart rate is: %d%n", obj.getMhr());
		System.out.printf("Your target-heart-rate range is: %.2f to %.2f", obj.getThr1(), obj.getThr2());
		// TODO Auto-generated method stub

	}

}
