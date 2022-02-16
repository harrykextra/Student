
public class EmployeeTest {

	public static void main(String[] args) {
		Employee empobj1 = new Employee("Joe", "Black", 5000.00);
		Employee empobj2 = new Employee("Betty", "White", 3500.00);
		System.out.printf("Employee1 %s%s earns %.2f%n", empobj1.getFirstName(), empobj1.getLastName(), empobj1.getSalary());
		System.out.printf("Employee2 %s%s earns %.2f%n", empobj2.getFirstName(), empobj2.getLastName(), empobj2.getSalary());
		
		//empobj1.setFirstName("Joe");
		//empobj1.setLastName("Black");
		empobj1.setSalary(5500.00);
		
		//empobj2.setFirstName("Betty");
		//empobj2.setLastName("White");
		empobj2.setSalary(3850.00);
		System.out.printf("Employee1 %s%s earns %.2f%n", empobj1.getFirstName(), empobj1.getLastName(), empobj1.getSalary());
		System.out.printf("Employee1 %s%s earns %.2f%n", empobj2.getFirstName(), empobj2.getLastName(), empobj2.getSalary());
		

	}

}
