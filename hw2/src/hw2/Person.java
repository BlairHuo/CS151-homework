package hw2;
/**
 * The Person program contain basic information of Person
 * @author shengshenghuo
 *
 */
public abstract class Person {
	/**
	 * instance variables
	 */
	private String firstName;
	private String lastName;
	private int age;
	private String ssn;
	private Address address;
	
	/**
	 * constructor
	 */
	public Person() {
		
	}
	/**
	 * The constructor of Person
	 * @param firstName
	 * @param lastName
	 * @param ssn
	 * @param address
	 */
			
	public Person(String firstName, String lastName,  String ssn, Address address) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.address = new Address(address.getStreetNum(),address.getStreetName(),
				address.getCity(),address.getZip(),address.getState());
	}
	/**
	 * The first name of the person
	 * @return firstName
	 */
	
	public String getFirstName() {
		return firstName;
	}
	/**
	 * The last name of the person
	 * @return lastName
	 */
	
	public String getLastName() {
		return lastName;
	}
	/**
	 * The age of the person
	 * @return age
	 */
	
	public int getAge() {
		return age;
	}
	/**
	 * The social security number of the person
	 * @return ssn
	 */
	
	public String getssn() {
		return ssn;
	}
	/**
	 * The address of the person
	 * @return address
	 */
	
	public Address getAddress() {
		return address;
	}
	/**
	 * The new update first name of the person
	 * @param newfirstName
	 */
	
	
	public void setFirstName(String newfirstName) {
		 firstName = newfirstName;
	}
	
	 /**
	  * The new Updated last name of the person
	  * @param newlastName
	  */
			 
	public void setLastName(String newlastName) {
		 lastName = newlastName;
	}
	
	/**
	 * The new updated age of the person
	 * @param newAge
	 */
	
	public void setAge(int newAge) {
		 age = newAge;
	}
	/**
	 * The new update social security number of the person
	 * @param newSSN
	 */
	public void setssn(String newSSN) {
		 ssn = newSSN ;
	}
	/**
	 * The new updated address of the person
	 * @param newAddress
	 */
	
	public void setAddress(Address newAddress) {
		address = newAddress;
	}
	
	@Override 
	/**
	 * introduce the person in a customized way
	 */
	public String toString() {
		return " Fist Name, Last Name: " + firstName + lastName + "\n"+
				"Age: " + age + "\n" + "SSN: " + ssn + "\n" + "Adress: " +
				address + "\n";
	}
	
	
	
	
	
	
	
}


