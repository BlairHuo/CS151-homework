package hw2;
/**
 * The full time salaries of the employee
 * @author shengshenghuo
 *
 */
public class FullTimeSalaried extends FullTimeEmployee {
	/**
	 * empty constructor of the full time salaries
	 */
	
	public FullTimeSalaried() {
		
	}
	/**
	 * The constructor of the full time salaries
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param id
	 * @param basePay
	 * @param ssn
	 */

	public FullTimeSalaried(String firstName, String lastName, Address address,
			int id, double basePay, String ssn) {
		
		super( firstName,lastName, ssn, address, id, basePay); 
	}
	
	@Override
	/**
	 * introduce full time salaries employee 
	 */
	public String toString() {
		return super.toString()+ " \nFull Time Salaried ";
	}
	/**
	 * introduce them with/without social security number 
	 * @param displaySSN
	 */
	
	public void introduce(boolean displaySSN ) {
		
		if (displaySSN) {
			
			System.out.print(toString());
		}
		else {
			System.out.print(" FirstName, LastName: " + super.getFirstName() + super.getLastName()+"\n"+
					"Age: "+ super.getAge() + "\n" + "Address: " + super.getAddress()+ " \nFull Time Salaried "+
					"\nBase Pay: " +super.getBasePay()+ "\n\n");
		}
	}
	/**
	 * calculate how much they got paid based on number of weeks they have been working 
	 * 
	 */
	public double computePay(int numWeeks) {
		
		return super.getBasePay()* numWeeks;
		
	}

}
