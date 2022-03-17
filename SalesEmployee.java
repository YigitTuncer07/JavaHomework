import java.util.ArrayList;
import java.util.Calendar;

public class SalesEmployee extends RegularEmployee {
	private ArrayList<Product> sales;
	private int numberOfSalesEmployees;

	public SalesEmployee(int id, String firstName, String lastName, String gender, Calendar birthDate,
			String maritialStatus, String hasDriverLicense, double salary, Calendar hireDate, Department department,
			double performanceScore, ArrayList<Product> sales) {
		super(id, firstName, lastName, gender, birthDate, maritialStatus, hasDriverLicense, salary, hireDate,
				department, performanceScore);
		this.sales = sales;
	}
	
	public boolean addSale(Product product) {
		sales.add(product);
		return true;//???????????????
	}
	
	public boolean removeSales(Product product) {
		sales.remove(product);
		return true;//???????????????
	}

	public ArrayList<Product> getSales() {
		return sales;
	}

	public void setSales(ArrayList<Product> sales) {
		this.sales = sales;
	}

	public int getNumberOfSalesEmployees() {
		return numberOfSalesEmployees;
	}

	public void setNumberOfSalesEmployees(int numberOfSalesEmployees) {
		this.numberOfSalesEmployees = numberOfSalesEmployees;
	}

	@Override
	public String toString() {
		return "SalesEmployee [sales=" + sales + ", numberOfSalesEmployees=" + numberOfSalesEmployees + ", getBonus()="
				+ getBonus() + ", getPerformanceScore()=" + getPerformanceScore() + ", toString()=" + super.toString()
				+ ", getSalary()=" + getSalary() + ", getHireDate()=" + getHireDate() + ", getDepartment()="
				+ getDepartment() + ", getNumberOfEmployees()=" + getNumberOfEmployees() + ", getGender()="
				+ getGender() + ", getHasDriverLicense()=" + getHasDriverLicense() + ", getId()=" + getId()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getBirthDate()="
				+ getBirthDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
