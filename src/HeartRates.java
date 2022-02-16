
public class HeartRates {
	private String firstName;
	private String lastName;
	private int month;
	private int day;
	private int year;
	private int currentYear;

	public HeartRates(String firstName, String lastName, int month, int day, int year, int currentYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.month = month;
		this.day = day;
		this.year = year;
		this.currentYear = currentYear;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public int getAge() {
		int age = currentYear - year;
		return age;
	}
	
	public int getMhr() {
		int mhr = 220 - getAge();
		return mhr;
	}
	
	public double getThr1() {
		double thr1= 0.50 * getMhr();
		return thr1;
	}
	
	public double getThr2() {
		double thr2= 0.85 * getMhr();
		return thr2;
	}

	public int getCurrentYear() {
		return currentYear;
	}

	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
	
	
	
	
	

}
