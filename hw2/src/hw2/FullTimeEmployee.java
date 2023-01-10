package hw2;
/**
 * The full time employee contains their important information 
 * @author shengshenghuo
 *
 */

public abstract class FullTimeEmployee extends Employee {
	/**
	 * instance variable
	 */
	private double basePay;
	/**
	 * empty constructor
	 */
	
	public FullTimeEmployee() {
		
	}
	/**
	 * non empty constructor of the class full time employee
	 * @param firstName
	 * @param lastName
	 * @param ssn
	 * @param address
	 * @param id
	 * @param basePay
	 */
	public FullTimeEmployee(String firstName, String lastName, String ssn, Address address, int id, double basePay) {
		
		
		super(firstName, lastName, ssn,address);
		this.basePay = basePay;
		
	}
	/**
	 * The base payment for the full time employee
	 * @return
	 */
	public double getBasePay() {
		return basePay;
	}
	/**
	 * The new updated base payment for the full time employee
	 * @param newBasePay
	 */
	public void setBasePay(double newBasePay) {
		basePay = newBasePay;
		
	}
	@Override
	/**
	 * let's introduce the the full time employee in customized way 
	 */
	public String toString() {
		return super.toString()+ " Full Time Employee's \n" + 
				" Base Payment is : " + basePay + "\n";
	}

}
