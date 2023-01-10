package hw8;
/**
 * This class/program is about the basic person information
 * including first name, last name, age, social security number, and where the person live
 * @author shengshenghuo
 *
 */
public class Person {
	/**
	 * instance variables
	 */
	private String firstName;
	private String lastName;
	private int age;
	private String ssn;
	private Address address;
	/**
	 * empty constructor
	 */

	public Person() {
		
	}
	/**
	 * non-empty constructor
	 */
	public Person(String firstName, String lastName, int age, String ssn, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.ssn = ssn;
		this.address = address;
		
	}
	/**
	 * The First Name of person
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * The new firstName of the Person
	 * @param firstName
	 */

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * The Last name of the person
	 * @return lastName
	 */

	public String getLastName() {
		return lastName;
	}
	/**
	 * The new last name of the person
	 * @param lastName
	 */

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * The age of the person
	 * @return age
	 */

	public int getAge() {
		return age;
	}
	/**
	 * The new age of the person
	 * @param age
	 */

	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * The social security number for the person
	 * @return ssn
	 */

	public String getSSN() {
		return ssn;
	}
	/**
	 * The new updated social security number for the person
	 * @param ssn
	 */

	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	/**
	 * The address that the person live
	 * @return address
	 */

	public Address getAddress() {
		return address;
	}
	/**
	 * The new updated address that the person lives
	 * @param address
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * customize the to string statement for the introduction for this person info
	 */

	@Override
	public String toString() {
		return "First Name: " + this.getFirstName()+ "\nLast Name: " + this.getLastName()+
				"\nAge: " + this.getAge()+ "\nSSN: " +this.getSSN()+ "\nAddress: "+ this.getAddress();
	}

	

}
