package chapter9employee;

public class HourlyEmployee extends Employee {
	private double hours;
	private double wage;
	
	public HourlyEmployee(String firstName, String lastName,
			String socialSecurityNumber, double hours, double wage) {
		super(firstName, lastName, socialSecurityNumber);
		
		if(hours < 0.0 || hours > 168.0)
			throw new IllegalArgumentException(
					"hours must be between 0.0 and 168.0");
		
		if(wage < 0.0)
			throw new IllegalArgumentException(
					"wage must be greater than 0.0");
		
		this.hours = hours;
		this.wage = wage;
			
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if(hours < 0.0 || hours > 168.0)
			throw new IllegalArgumentException(
					"hours must be between 0.0 and 168.0");
		
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if(wage < 0.0)
			throw new IllegalArgumentException(
					"wage must be greater than 0.0");
		
		this.wage = wage;
	}
	
	public double earnings() {
		if(getHours() <= 40)
			return getHours() * getWage();
		return 40 * getWage() + (getHours() - 40) * 1.5 * getWage();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s%n%s: %.2f%n%s: %.2f", "hourly",
				super.toString(), "the number of hours",
				getHours(), "wage is", getWage());
	}
}
