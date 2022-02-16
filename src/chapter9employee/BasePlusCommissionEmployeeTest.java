package chapter9employee;

public class BasePlusCommissionEmployeeTest {
	
	public static void main(String[] args) {
		BasePlusCommissionEmployee employee =
				new BasePlusCommissionEmployee(
						"Bob", "Jones", "22-333-44",
						5500.50, 0.75, 2500.50);
		
		System.out.println(employee);
		System.out.println();
		
		employee.setBaseSalary(3550.50);
		System.out.println(employee);
	}
}
