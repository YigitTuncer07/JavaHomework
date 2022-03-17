public class Person {

	private int id;
	private String firstName;
	private String lastName;
	private byte gender;
	private Calendar birthDate;
	private byte maritialStatus;
	private boolean hasDriverLicense;

	public Person(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritialStatus,
			String hasDriverLicense) {
		if (id <= 0) {
			System.out.println("Should be positive.");
		} else {			
			this.id = id;
		}
		if (firstName.length() < 3) {
			System.out.println("Should be longer than 3.");
		} else {
			this.firstName = firstName;
		}
		if (lastName.length() < 3) {
			System.out.println("Should be longer than 3.");
		} else {
			this.lastName = lastName;
		}
		
		if (gender.equals("Man")) {
			this.gender = 1;
		} else if (gender.equals("Woman")) {
			this.gender = 2;
		} else {
			this.gender = 1;
			System.out.println("Unknown gender.");
		}

		if (maritialStatus.equals("Single")) {
			this.maritialStatus = 1;
		} else if (maritialStatus.equals("Married")) {
			this.maritialStatus = 2;
		} else {
			this.maritialStatus = 1;
			System.out.println("Unknown status.");
		}

		this.birthDate = birthDate;

		if (hasDriverLicense.equals("True")) {
			this.hasDriverLicense = true;
		} else if (gender.equals("Woman")) {
			this.gender = 2;
		} else {
			this.gender = 1;
			System.out.println("Unknown gender.");
		}

	}

	public void setGender(String gender) {
		if (gender.length() < 3) {
			System.out.println("Should be longer than 3 letters");
			return;
		}
		if (gender.equals("Man")) {
			this.gender = 1;
		} else if (gender.equals("Woman")) {
			this.gender = 2;
		} else {
			this.gender = 1;
			System.out.println("Unknown gender.");
		}
	}

	public String getGender() {
		if (this.gender == 1) {
			return "Man";
		} else if (this.gender == 2) {
			return "Woman";
		}
		return "Man";
	}

	public void setMaritialStatus(String s) {
		if (s.length() < 3) {
			System.out.println("Should be longer than 3 letters");
			return;
		}
		if (s.equals("Single")) {
			this.maritialStatus = 1;
		} else if (s.equals("Married")) {
			this.maritialStatus = 2;
		} else {
			this.maritialStatus = 1;
			System.out.println("Unknown status.");
		}
	}

	public String getMaritialStatus() {
		if (this.maritialStatus == 1) {
			return "Single";
		} else if (this.maritialStatus == 2) {
			return "Married";
		}
		return "Single";
	}

	public void setHasDriversLicense(String s) {
		if (s.length() < 3) {
			System.out.println("Should be longer than 3 letters");
			return;
		}
		if (s.equals("Yes")) {
			this.hasDriverLicense = true;
		} else if (s.equals("No")) {
			this.maritialStatus = 2;
		} else {
			this.hasDriverLicense = false;
			System.out.println("Unknown status.");
		}
	}

	public String getHasDriverLicense() {
		if (this.hasDriverLicense) {
			return "Yes";
		}
		return "No";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id <= 0) {
			System.out.println("Should be positive.");
		} else {			
			this.id = id;
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName.length() < 3) {
			System.out.println("Should be longer than 3 letters.");
			return;
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName.length() < 3) {
			System.out.println("Should be longer than 3 letters.");
			return;
		}
		this.lastName = lastName;
	}

	public Calendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Calendar birthDate) {

		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", birthDate=" + birthDate + ", maritialStatus=" + maritialStatus + ", hasDriverLicense="
				+ hasDriverLicense + "]";
	}

}
