import java.util.ArrayList;
import java.util.Calendar;

public class Developer extends RegularEmployee {

	private ArrayList<Project> p;
	private int numberOfDevelopers = 0;

	public Developer(int id, String firstName, String lastName, String gender, Calendar birthDate,
			String maritialStatus, String hasDriverLicense, double salary, Calendar hireDate, Department department,
			double performanceScore, ArrayList<Project> p) {
		super(id, firstName, lastName, gender, birthDate, maritialStatus, hasDriverLicense, salary, hireDate,
				department, performanceScore);
		this.p = p;
		this.numberOfDevelopers++;
	}

	public Boolean addProject(Project p) {
		this.p.add(p);
		return true;
	}

	public Boolean removeProject(Project p) {
		this.p.remove(p);
		return true;
	}

	public ArrayList<Project> getP() {
		return p;
	}

	public void setP(ArrayList<Project> p) {
		this.p = p;
	}

	public int getNumberOfDevelopers() {
		return numberOfDevelopers;
	}

	public void setNumberOfDevelopers(int numberOfDevelopers) {
		if (numberOfDevelopers <= 0) {
			System.out.println("Should be positive.");
		} else {
			this.numberOfDevelopers = numberOfDevelopers;
		}
		
	}

	@Override
	public String toString() {
		return "Developer [p=" + p + ", numberOfDevelopers=" + numberOfDevelopers + ", getBonus()=" + getBonus()
				+ ", getPerformanceScore()=" + getPerformanceScore() + ", toString()=" + super.toString()
				+ ", getSalary()=" + getSalary() + ", getHireDate()=" + getHireDate() + ", getDepartment()="
				+ getDepartment() + ", getNumberOfEmployees()=" + getNumberOfEmployees() + ", getGender()="
				+ getGender() + ", getHasDriverLicense()=" + getHasDriverLicense() + ", getId()=" + getId()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getBirthDate()="
				+ getBirthDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
