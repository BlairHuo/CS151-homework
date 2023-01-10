/**
 * 
 * @author Shengsheng Huo
 * @since 2022-09-08
 * 
 * Person Program
 * <p>
 * This is Person program, the program display basic information
 * of a person including their first name last name, age, SSN, address, gender, weight. 
 * And also, we introduce this person in the end by using toString() and introduction method. 
 * <p> 
 * Compile as {@code java Test.java}
 * <p>
 * Run as {@code java Test}
 * 
 */

public class Person {
	
	/**
	 * instance variables
	 */
	private String FirstName;
	private String LastName;
	private int Age;
	private String SSN;
	private String Address;
	private String Gender;
	protected float Weight;
	
	/**
	 * Constructor of class person including all those attributes. 
	 * @param theFirstName
	 * @param theLastName
	 * @param theAge
	 * @param theSSN
	 * @param theAddress
	 * @param theGender
	 * @param theWeight
	 */
	
	public Person(String theFirstName, String theLastName, int theAge,
			String theSSN, String theAddress, String theGender, float theWeight)
	{
		FirstName = theFirstName;
		LastName = theLastName;
		Age = theAge;
		SSN = theSSN;
		Address = theAddress;
		Gender  = theGender;
		Weight = theWeight;
		
	}
	/**
	 * The first name of the person
	 * @return FirstName
	 */

	public String getFirstName() {
		return FirstName;
	}
	/**
	 * The new updated first name of the person
	 * @param newFirstName
	 */
	public void setFirstName(String newFirstName) {
		FirstName = newFirstName;
	}
	/**
	 * The last name of the person
	 * @return LastName
	 */
	
	public String getLastName() {
		return LastName;
	}
	/**
	 * The new updated last name of the person
	 * @param newLastName
	 */
	public void setLastName(String newLastName) {
		LastName = newLastName;
	}
	/**
	 * The age of the person
	 * @return Age
	 */
	
	public int getAge() {
		return Age;
	}
	/**
	 * The new updated age of a person
	 * @param newAge
	 */
	public void setAge(int newAge) {
		Age = newAge;
	}
	/**
	 * The social security number of a person
	 * @return SSN
	 */
	
	public String getSSN() {
		return SSN;
	}
	/**
	 * The new updated social security number of a person
	 * @param newSSN
	 */
	public void setSSN(String newSSN) {
		SSN = newSSN;
		
	}
	/**
	 * The address of the person
	 * @return Address
	 */
	
	public String getAddress() {
		return Address;
	}
	/**
	 * The new updated Address of the person
	 * @param newAddress
	 */
	public void setAddress(String newAddress) {
		Address = newAddress;
		
	}
	/**
	 * The gender of the person
	 * @return Gender
	 */
	
	public String getGender() {
		return Gender;
	}
	/**
	 * The new updated gender of a person
	 * @param newGender
	 */
	public void setGender(String newGender) {
		Gender = newGender;
		
	}
	/**
	 * The weight of a person
	 * @return Weight 
	 */
	public float getWeight() {
		return Weight;
	}
	public void setWeight(float newWeight) {
		Weight = newWeight;
	}
	/**
	 * transfer introduction of a person to string type. 
	 */
	@Override
	public String toString() {
		
		return "First Name: " + FirstName+"\nLast Name: "+ LastName + "\nAge: "+ Age +
				"\nGender: " + Gender + "\nWeight: " + Weight + "\nAdress: " + Address +
				"\nSSN: " + SSN;  
		
		
	}
	/**
	 * Introduce the a person by using void method. 
	 */
	public void introduce() {
		System.out.println(toString());
	}
	 

}
