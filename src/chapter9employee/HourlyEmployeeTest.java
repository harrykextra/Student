package chapter9employee;

public class HourlyEmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HourlyEmployee employee = new HourlyEmployee(
				"Bob", "Jones", "22-3333-44", 89.9, 155.50);
		
		System.out.printf("%s %s%n", "First name is",
				employee.getFirstName());
		System.out.printf("%s %s%n", "Last name is",
				employee.getLastName());
		System.out.printf("%s %s%n", "the social security number is",
				employee.getSocialSecurityNumber());
		System.out.printf("%s %s%n", "Number of hours is",
				employee.getHours());
		System.out.printf("%s %s%n%n", "the wage is",
				employee.getWage());
		
		employee.setHours(118.80);
		employee.setWage(255.50);
		
		System.out.println(employee);
	}

}
