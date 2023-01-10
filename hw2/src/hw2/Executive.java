package hw2;
/**
 * The program is executive class 
 * which contain executive information.
 * @author shengshenghuo
 *
 */

public class Executive extends Employee {
	/**
	 * instance variables
	 */
	
	private double yearlyBonus;
	private double yearlyCompensation;
	/**
	 * empty constructor
	 */

	public Executive() {
	
	}
	/**
	 * The constructor of executive 
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param age
	 * @param id
	 * @param yearlyBonus
	 * @param yearlyCompensation
	 * @param ssn
	 */
	public Executive(String firstName,String lastName, Address address,int age, 
			int id, double yearlyBonus,double yearlyCompensation, String ssn) {
		
		
		super(firstName, lastName, ssn,address);
		this.yearlyBonus = yearlyBonus;
		this.yearlyCompensation = yearlyCompensation;
		
	}
	/**
	 * The yearly bonus of executives
	 * @return yearlyBonus
	 */
	
	public double getYearlyBouns() {
		return yearlyBonus;
	}
	/**
	 * The yearly compensation of executive
	 * @return yearlyCompensation
	 */
	public double getYearlyComopensation() {
		return yearlyCompensation;
	}
	/**
	 * The new yearly bonus of executives
	 * @param newYearlyBonus
	 */
	
	public void setYearlyBouns(double newYearlyBonus) {
		yearlyBonus = newYearlyBonus;
	}
	/**
	 * The new yearly compensation of executives
	 * @param newYearlyCompensation
	 */
 
	public void setYearlyCompensation(double newYearlyCompensation) {
		yearlyCompensation = newYearlyCompensation;
	}
	
	@Override
	/**
	 * let's introduce executive 
	 */
	public String toString() {
		return super.toString() + " Executive " + "\n" +
	           "Yearly Bouns: " + yearlyBonus + "\n" +
				"Yearly Comopensation: " + yearlyCompensation + "\n";
	}
	/**
	 * The true or false of the ssn 
	 * @param displaySSN
	 */

	
	public void introduce(boolean displaySSN) {
		
		if(displaySSN) {
			System.out.println(toString());
		}
		else {
			System.out.print(" FirstName, LastName: " + super.getFirstName() + super.getLastName()+"\n"+
					"Age: "+ super.getAge() + "\n" + "Address: " + super.getAddress()+ "Executive:"+
					"\n" + "Yearly Bouns: " + yearlyBonus + "\n" + "Yearly Comopensation: " + yearlyCompensation +"\n\n");
		}
	}
	/**
	 * the method calculating the how they got paid 
	 * @return
	 */
	public double computePay() {
		
		return yearlyBonus+ yearlyCompensation;
	}
}
