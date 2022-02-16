package Chapter9;

public class BasePlusCommissionEmployee {
	private CommissionEmployee details;
	private double baseSalary;
	
	public BasePlusCommissionEmployee(CommissionEmployee details,
			double baseSalary) {
		this.details = details;
		if(baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if(baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		this.baseSalary = baseSalary;
	}
	
	CommissionEmployee employee = new CommissionEmployee("Bob", "Jones", "222-3333-44", 3500.50, 0.25);
	
	public double earnings() {
		return getBaseSalary() + employee.earnings();
	}
	
	public String toString() {
		return String.format("%s %s%n%s: %.2f", "base-salaried",
				employee, "base salary", getBaseSalary());
	}
	
	

}
