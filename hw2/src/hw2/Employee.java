package hw2;
/**
 * The employee program contain essential information of the person
 * @author shengshenghuo
 *
 */

public abstract class Employee extends Person {
	/**
	 * instance variables
	 */
	private int id;
	private String educational;
	private boolean directDeposit;
	/**
	 * empty constructor
	 */
	public Employee() {
		
	}
	/**
	 * none empty constructor of emplpyee class
	 * @param firstName
	 * @param lastName
	 * @param ssn
	 * @param address
	 */
	public Employee(String firstName, String lastName,  String ssn, Address address) {
		
		super(firstName, lastName, ssn,address);
	
	}
	/**
	 * The id of the employee 
	 * @return
	 */
	public int getID() {
		return id;
		
	}
	/**
	 * The educational level of the employee 
	 * @return
	 */
	public String getEducatiional() {
		return educational;
	}
	/**
	 * The direct deposit of the employee
	 * @return
	 */
	public boolean getDirectDeposit() {
		return directDeposit;
	}
	/**
	 * The new updated id of the employee
	 * @param newID
	 */
	
	public void setID(int newID) {
		id = newID;
	}
	/**
	 * The new updated educational level of the employee
	 * @param newEducational
	 */
	public void setEducational(String newEducational) {
		educational = newEducational;
		
	}
	/**
	 * The new direct deposit of the employee
	 * @param newDirectDeposit
	 */
	public void setDirectDeposit(boolean newDirectDeposit) {
		directDeposit = newDirectDeposit;
		
	}
	
	@Override
	/**
	 * introduce this employee
	 */
	public String toString() {
		return super.toString() + "Employee ID: " + id + "\n" +
				"Education: " + educational + "\n" +
				"DirectDeposit: " + directDeposit + "\n";
	}
	

}
