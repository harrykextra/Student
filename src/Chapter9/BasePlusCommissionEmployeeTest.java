package Chapter9;

public class BasePlusCommissionEmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommissionEmployee employee = new CommissionEmployee(
				"Bob", "Jones", "222-3333-44", 3500.50, 0.25);
		
		BasePlusCommissionEmployee employee1 = new BasePlusCommissionEmployee(
				employee, 450.50);
		
		System.out.println("Employee information");
		System.out.printf("%s %s%n", "First name is",
				employee.getFirstName());
		System.out.printf("%s %s%n", "Last name is",
				employee.getLastName());
		System.out.printf("%s %s%n", "Social security number is",
				employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross sales is",
				employee.getGrossSales());
		System.out.printf("%s %.2f%n", "Commission rate is",
				employee.getCommissionRate());
		System.out.printf("%s %.2f%n", "Base salary is",
				employee1.getBaseSalary());
		
		employee1.setBaseSalary(2000.50);
		
		System.out.printf("%n%s:%n%n%s%n",
				"Updated employee information obtained by toString",
				employee1);

	}

}
