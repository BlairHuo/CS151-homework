package hw2;
/**
 * The program contain information part time employee who got paid by hour.
 * @author shengshenghuo
 *
 */
public class PartTimeHourly extends Employee{
	
	private double baseHourlyPay;
	/**
	 * empty constructor
	 */

	public PartTimeHourly() {
		
	}
	/**
	 * The constructor  of PartTimeHourly
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param age
	 * @param id
	 * @param BaseHourlyPay
	 * @param ssn
	 */
	public PartTimeHourly(String firstName, String lastName, Address address, int age, int id, double BaseHourlyPay, String ssn) {
		/**
		 * String firstName, String lastName, int age, 
			 String ssn, Address address ,int id, double BaseHourlyPay
		 */
		
		super(firstName, lastName, ssn,address);
		baseHourlyPay = BaseHourlyPay;
	}
	/**
	 * The base payment based on hours
	 * @return baseHourlyPay
	 */
	public double getHourlyPay() {
		return baseHourlyPay;
	}
	/**
	 * The new updated base payment based on hours
	 * @param newHourlyPay
	 */
	public void setHourlyPay(double newHourlyPay) {
		baseHourlyPay = newHourlyPay;
	}
	
	@Override
	/**
	 * introduce pat-time hourly pay employee by customized way
	 */
	public String toString() {
		return super.toString()+ " Part Time Hourly: "+ "\n"+
				"Base Hourly Pay: "+ baseHourlyPay+"\n";
	}
	/**
	 * introduce employee based on whether they input ssn number or not 
	 * @param displaySSN
	 */
	public void introduce(boolean displaySSN) {
		if (displaySSN) {
			System.out.print(toString());
		}
		else {
			System.out.print(" FirstName, LastName: " + super.getFirstName() + super.getLastName()+"\n"+
					"Age: "+ super.getAge() + "\n" + "Address: " + super.getAddress()+ "PartTimeHourly:"+
					"\n" + "Base Hourly Pay: "+ baseHourlyPay+"\n\n");
		}
	}
	/**
	 * compute the way how they got paid. 
	 * @param numHrs
	 * @return
	 */
	
	public double computePay(int numHrs) {
		if(numHrs > 40) {
			return -1;
		}
		else {
			return baseHourlyPay * numHrs;
		}
	}

}
