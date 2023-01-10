package hw2;
/**
 * The contractor is one type of employee in the company 
 * This program tell us information of the contractor information
 * @author Shengsheng Huo
 *
 */

public class Contractor extends Employee{
	/**
	 * instance variables
	 */
	private double basePay;
	/**
	 * empty constructor
	 */

	public Contractor() {
		
	}
	/**
	 * The constructor of the contractor class
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param id
	 * @param ssn
	 * @param basePay
	 */
	public Contractor (String firstName,String lastName, Address address, 
			           int id, String ssn,double basePay) {
		
		super(firstName, lastName, ssn,address);
		this.basePay = basePay;
		
	}
	/**
	 * The base pay of contractor
	 * @return
	 */
	public double getBasePay() {
		return basePay;
	}
	/**
	 * The new updated pay of contractor
	 * @param newBasePay
	 */
	public void setBasePay(double newBasePay) {
		basePay = newBasePay;
	}
	
	@Override
	/**
	 * introduce the information of contractor 
	 */
			
	public String toString() {
		return super.toString()+ "Contractor: "+ "\n"+
				"Base Pay: " + basePay+"\n\n";
				
	}
	
	/**
	 * another way to introduce information contractor without displaying their SSN
	 * @param displaySSN
	 */
	public void introduce(boolean displaySSN) {
		if (displaySSN) {
			
			System.out.print(toString());
		}
		else {
			System.out.print(" FirstName, LastName: " + super.getFirstName() + super.getLastName()+"\n"+
					"Age: "+ super.getAge() + "\n" + "Address: " + super.getAddress()+ "Contractor: "+ 
					"\n"+ "Base Pay: " + basePay +"\n\n");
		}
	}
	/**
	 * calculation of the payment.
	 * @param numHrs
	 * @return total amount payment based on number of hours
	 */
	
	public double computePay(int numHrs) {
		return basePay * numHrs;
		
	}
}


