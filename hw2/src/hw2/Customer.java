package hw2;
/**
 * This is the customer class which inherited from super class person 
 * @author Shengsheng Huo
 *
 */

public class Customer extends Person{
	/**
	 * instance variables
	 */
	
	private int customerID;
	private String payPreference;
	/**
	 * empty constructor
	 */

	public Customer() {
		
	}
	/**
	 * The constructor of customer
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param ssn
	 * @param address
	 * @param customerID
	 * @param payPreference
	 */
	public Customer(String firstName, String lastName, int age, String ssn, 
			Address address, int customerID, String payPreference) {
	
		super(firstName, lastName, ssn,address);
		this.customerID = customerID;
		this.payPreference = payPreference;
	}
	/**
	 * The id number of customer
	 * @return
	 */
	public int getCustomerID() {
		return customerID;
	}
	/**
	 * The payment method of customer
	 * @return paypPrefence
	 */
	public String getPayPreferece() {
		return payPreference;
	}
	/**
	 * The  new id   of customer
	 * @param newCustomerID
	 */
	public void setCustomerID(int newCustomerID) {
		customerID = newCustomerID;
	}
	/**
	 * The  new payment method    of customer
	 * @param newPayPreference
	 */
	public void setPayPreference(String newPayPreference) {
		payPreference = newPayPreference;
	}
	
	@Override
	/**
	 * tranfer to customized introduction string for customer information
	 */
	public String toString() {
		return super.toString()+ " Customer ID: " + customerID + "\n" +
				"Payment Preference: " + payPreference + "\n\n";
	}
	/**
	 * let s introduce our customer 
	 * @param displaySSN
	 */
	
	public void introduce(boolean displaySSN) {
		if(displaySSN) {
			System.out.print(toString());
		}
		else {
			System.out.print("Customer: " + "\n FirstName, LastName: " + super.getFirstName() +
					super.getLastName()+ "\nAge: " + super.getAge()+ "\nAddress: " + super.getAddress()+
					"\nCustomer ID: " + customerID + " \nPayment method: " + payPreference +"\n\n");
		}
		
	}
	/**
	 * print out the payment method
	 */
	public void makePayment() {
		System.out.print(" Payment Method: " + this.getPayPreferece());
		
	}

}
