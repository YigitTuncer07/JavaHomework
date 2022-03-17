public class Manager extends Employee {
	private ArrayList<RegularEmployee> regularEmployees;
	private double bonusBudget;

	public Manager(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritialStatus,
			String hasDriverLicense, double salary, Calendar hireDate, Department department, double bonusBudget) {
		super(id, firstName, lastName, gender, birthDate, maritialStatus, hasDriverLicense, salary, hireDate,
				department);
		if (bonusBudget <= 0) {
			System.out.println("Bonus Budget should be positive.");
		} else {
			this.bonusBudget = bonusBudget;
		}

	}

	public void addEmployee(RegularEmployee employee) {
		regularEmployees.add(employee);
	}
	

	public void removeEmployee(RegularEmployee employee) {
		regularEmployees.remove(employee);

	}

	public ArrayList<RegularEmployee> getRegularEmployees() {
		return regularEmployees;
	}

	public void setRegularEmployees(ArrayList<RegularEmployee> regularEmployees) {
		this.regularEmployees = regularEmployees;
	}

	public double getBonusBudget() {
		return bonusBudget;
	}

	public void setBonusBudget(double bonusBudget) {
		if (bonusBudget <= 0) {
			System.out.println("Should be positive.");
		} else {
			this.bonusBudget = bonusBudget;
		}
		 
	}

	@Override
	public String toString() {
		return "Manager [regularEmployees=" + regularEmployees + ", bonusBudget=" + bonusBudget + ", getSalary()="
				+ getSalary() + ", getHireDate()=" + getHireDate() + ", getDepartment()=" + getDepartment()
				+ ", getNumberOfEmployees()=" + getNumberOfEmployees() + ", toString()=" + super.toString()
				+ ", getGender()=" + getGender() + ", getHasDriverLicense()=" + getHasDriverLicense() + ", getId()="
				+ getId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getBirthDate()=" + getBirthDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

}
