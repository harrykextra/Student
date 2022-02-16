package chapter9employee;

public class CommissionEmployeeTest {
	
	public static void main(String[] args) {
		//Employee human = new Employee("Bob", "Jones", "22-333-44");
		CommissionEmployee employee = new CommissionEmployee(
				"Bob", "Jones", "22-333-44", 4500.50, 0.25);
		
		System.out.println(employee);
		System.out.println();
		
		employee.setGrossSales(5500.50);
		employee.setCommissionRate(0.75);
		
		System.out.println(employee);
		
	
	}
	
	
}
