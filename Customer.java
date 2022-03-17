import java.util.ArrayList;
import java.util.Calendar;

public class Customer extends Person{
	
	private ArrayList<Product> products;

	public Customer(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritialStatus,
			String hasDriverLicense, ArrayList<Product> products) {
		super(id, firstName, lastName, gender, birthDate, maritialStatus, hasDriverLicense);
		
		this.products = products;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customer [products=" + products + ", getGender()=" + getGender() + ", getHasDriverLicense()="
				+ getHasDriverLicense() + ", getId()=" + getId() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getBirthDate()=" + getBirthDate() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
