package hw2;
/**
 * The progtam contain information of full time hourly employee
 * @author shengshenghuo
 *
 */
public class FullTimeHourly extends FullTimeEmployee{
	/**
	 * instance variables
	 */
	
	private double overtimePay;
	/**
	 * empty constructor
	 */
	public FullTimeHourly() {
		
	}
	/**
	 * non  empty constructor for the full time hourly 
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param id
	 * @param overtimePay
	 * @param basePay
	 * @param ssn
	 */
	public FullTimeHourly(String firstName, String lastName, Address address, int id, double overtimePay,double basePay,String ssn) {
		
		super( firstName,lastName, ssn, address, id, basePay); 
		this.overtimePay = overtimePay;
	}
	/**
	 * The payment when employee work over time 
	 * @return overttimePay
	 */
	
	public double getOverTimePay() {
		return overtimePay;
	}
	/**
	 * The new updated payment when employee work over time 
	 * @param newOverTimePay
	 */
	
	public void setOverTimePay(double newOverTimePay) {
		overtimePay = newOverTimePay;
	}
	
	@Override
	/**
	 * introduce employee who isi full time hourly work in the customized way 
	 */
	public String toString() {
		return super.toString()  + " FullTimeHourly: " + "\n" +
				"OverTime Pay: " + overtimePay+"\n\n";
	}
	/**
	 * introduce the employee when they input their social security number
	 * @param displaySSN
	 */
	
	public void introduce(boolean displaySSN) {
		if (displaySSN) {
			System.out.print(toString());
		}
		else {
			/*
			 * print the basic info if they didn't enter the right thing, we still need to introduce this person
			 * just without his SSN number
			 */
			System.out.print(" FirstName, LastName: " + super.getFirstName() + super.getLastName()+"\n"+
					"Age: "+ super.getAge() + "\n" + "Address: " + super.getAddress()+ "FullTimeHourly:"+
					"\n" + "OverTimePay: " + overtimePay+"\n\n");
		}
	}
	/**
	 * calculte when worker working over 40 hours. how much they got paid. but when they work under 40 hours 
	 * how much they got paid/.
	 * @param numHrs
	 * @return
	 */
	
	public double computePay(int numHrs) {
		if(numHrs>40) {
			return (numHrs- 40)* overtimePay + 40 * super.getBasePay();
		}
		return super.getBasePay() * numHrs; 
		
	}

}
