import java.util.Calendar;

public class RegularEmployee extends Employee {

	private double bonus;
	private double performanceScore;

	public RegularEmployee(int id, String firstName, String lastName, String gender, Calendar birthDate,
			String maritialStatus, String hasDriverLicense, double salary, Calendar hireDate, Department department,
			 double performanceScore) {
		super(id, firstName, lastName, gender, birthDate, maritialStatus, hasDriverLicense, salary, hireDate, department);
		this.performanceScore = performanceScore;

	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getPerformanceScore() {
		return performanceScore;
	}

	public void setPerformanceScore(double performanceScore) {
		this.performanceScore = performanceScore;
	}

	@Override
	public String toString() {
		return "RegularEmployee [bonus=" + bonus + ", performanceScore=" + performanceScore + ", getSalary()="
				+ getSalary() + ", getHireDate()=" + getHireDate() + ", getDepartment()=" + getDepartment()
				+ ", getNumberOfEmployees()=" + getNumberOfEmployees() + ", toString()=" + super.toString()
				+ ", getGender()=" + getGender() + ", getHasDriverLicense()=" + getHasDriverLicense() + ", getId()="
				+ getId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getBirthDate()=" + getBirthDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
