/**
 * 
 * @author Shengsheng Huo
 * @since 2022-09-08
 * 
 * Employee Program
 * <p>
 * This is Employee program, the program display basic information
 * of an Employee, including their ID, Student and base payment.
 *  The getter and setter of their basic information. 
 * <p> 
 * Compile as {@code java Test.java}
 * <p>
 * Run as {@code java Test}
 * 
 */
public class Employee extends Person{
	/*
	* Instance variable
	**/
	
	private int ID;
	private String Status;
	private  double BasePay;
	/**
	 * Constructor 
	 * 
	 * @param theID
	 * @param theStatus
	 * @param theBasePay
	 * @param theFirstName
	 * @param theLastName
	 * @param theAge  
	 * @param theSSN
	 * @param theAddress
	 * @param theGender
	 * @param theWeight
	 *
	 * 
	 * 
	 **/
	public Employee(int theID, String theStatus, double theBasePay,String theFirstName, String theLastName, int theAge,
			String theSSN, String theAddress, String theGender, float theWeight)
	{
	
		super(theFirstName,  theLastName, theAge, theAddress,theSSN, theGender, theWeight);
		ID = theID;
		Status = theStatus;
		BasePay = theBasePay;
		
	}
	/**
	 * The ID number of the employee
	 * @return ID 
	 */
	
	public int getID() {
		return ID;
	}
	/**
	 * The new ID (the updated one)number of the employee 
	 * @param newID
	 */
	public void setID(int newID) {
		ID = newID;
	}
	/**
	 * The status of the employee 
	 * @return Status
	 */
	public String getStatus() {
		return Status;
	}
	/**
	 * The new status (the updated status) of the employee
	 * @param newStatus
	 */
	public void setStatus(String newStatus) {
		Status = newStatus;
		
	}
	/**
	 * The base pay of the employee
	 * @return BasePay
	 */
	public double getBasePay() {
		return BasePay;
	}
	/**
	 * The new base pay of the employee
	 * @param newBasePay
	 */
	public void setBasePay(double newBasePay) {
		BasePay = newBasePay;
		
	}
	/**
	 * The function is to calculate the payment of the employee, base on the units of work, 
	 * how much the worker get paid and status of the worker. we can calculate how much this 
	 * employee get paid within certain 
	 * time we enter in this function. 
	 * 
	 * @param InputStatus
	 * @param Money
	 * @param time
	 * @return outcome  the amount of money the employee make
	 */
	public double calculatePay(String InputStatus, double Money, int time ) {
		
		double outcome = 0;
		
		if (InputStatus.equalsIgnoreCase("parttime") || InputStatus.equalsIgnoreCase("contractor")) {
			 outcome =  (double) (Money * time); 
			  
		}
		else if(InputStatus.equalsIgnoreCase("fulltime"))
		{
			outcome = (double) (Money * 1/52* time);
			outcome = Math.round(outcome);
		}
		
		return outcome;
		
	}
	
	/**
	 * here is the introduce function is to introduce this employee based on previous super class 
	 * which is person class. 
	 */
	@Override 
	public void introduce() {
		
		System.out.println( super.toString() + "\nEmployee ID: " + ID + 
				"\nStatus: " + Status  + " employee "+ "\nBase Pay: $" + BasePay );
	}
	
	/**
	 * This is a testing case for the function "calculatePay" and the employee class.  
	 * @param args
	 */

	public static void main(String[] args) {
		
		Employee ppl = new Employee( (int)0124, "Part-Time", 44.89,"Johnson", "Siow", 30, "1121 Pine Street,San Jose,CA", "789-908-0098", "Female", (float)80.99);
        ppl.introduce();
        System.out.println("Employee earnings: $" + ppl.calculatePay("parttime", 44.89,2));
        System.out.println();
        
	}

}
