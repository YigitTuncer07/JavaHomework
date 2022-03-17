import java.util.Calendar;

public class Employee extends Person {
	private double salary;
	private Calendar hireDate;
	private Department department;
	private int numberOfEmployees = 0;

	public Employee(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritialStatus,
			String hasDriverLicense, double salary, Calendar hireDate, Department department) {
		super(id, firstName, lastName, gender, birthDate, maritialStatus, hasDriverLicense);
		if (salary <= 0) {
			System.out.println("Salary should be positive");
		} else {			
			this.salary = salary;
		}
		this.hireDate = hireDate;
		this.department = department;

		this.numberOfEmployees++;

	}

	public double raiseSalary(double percent) {

		if ((percent < 0) || (percent > 1)) {
			System.out.println("Percent should be between 1 and 0");
			return salary;
		} else {
			salary += salary * percent;
			return salary;
		}

	}

	public double raiseSalary(int amount) {
		salary += amount;
		return salary;

	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary <= 0) {
			System.out.println("Should be positive.");
		} else {
			this.salary = salary;
		}
		
	}

	public Calendar getHireDate() {
		return hireDate;
	}

	public void setHireDate(Calendar hireDate) {
		this.hireDate = hireDate;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		if (numberOfEmployees <= 0) {
			System.out.println("Should be positive.");
		} else {
			this.numberOfEmployees = numberOfEmployees;
		}
		
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", hireDate=" + hireDate + ", department=" + department
				+ ", numberOfEmployees=" + numberOfEmployees + ", getGender()=" + getGender()
				+ ", getHasDriverLicense()=" + getHasDriverLicense() + ", getId()=" + getId() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getBirthDate()=" + getBirthDate()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
