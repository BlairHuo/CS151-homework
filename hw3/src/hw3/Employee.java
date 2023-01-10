package hw3;
/**
 * This program contains Employee basic information
 * including their first name, last name, id, hourly pay
 * and some other method for calculating their payment.
 * @author shengshenghuo
 *
 */

public class Employee implements Cloneable{
	/**
	 * instance variables
	 * first name, last name, employee id, hourly pay
	 */
	private String first;
	private String last;
	private int id;
	private float hourlyPay;
	
	/**
	 * empty constructor
	 */
	public Employee() {
		
	}
	/**
	 * non empty constructor
	 */
	public Employee(String first, String last, int id, float hourlyPay) {
		this.first = first;
		this.last = last;
		this.id = id;
		this.hourlyPay = hourlyPay;
	}
	/**
	 * another non empty constructor 
	 * which is enable the shallow copying 
	 */
	public Employee(Employee e) {
		this.first = e.first;
		this.last  = e.last;
		this.id = e.id;
		this.hourlyPay = e.hourlyPay;
	}
	/**
	 * The first name of the employee
	 * @return first
	 */
	public String getFirst() {
		return first;
	}
	/**
	 * The last name of the employee
	 * @return last
	 */
	public String getLast() {
		return last;
	}
	/**
	 * The id of the employee
	 * @return id
	 */
	public int getID() {
		return id;
	}
	/**
	 * The hourly pay of the employee
	 * @return hourlyPay
	 */
	public float getHourlyPay() {
		return hourlyPay;
	}
	
	
	/**
	 * The updated new first name of employee
	 * @param newFirst
	 */
	public void setFirst(String newFirst) {
		this.first = newFirst;
	}
	/**
	 * The updated new last name of employee
	 * @param newLast
	 */
	public void setLast(String newLast) {
		this.last = newLast;
	}
	/**
	 * The updated new ID of employee
	 * @param newID
	 */
	public void setID(int newID) {
		this.id = newID;
	}
	/**
	 * The updated new hourly pay of the employee
	 * @param newHourlyPay
	 */
	public void setHourlyPay(float newHourlyPay) {
		this.hourlyPay = newHourlyPay;
	}
	/**
	 * This method calculates the payment of the employee based on the hours they works
	 * @param hours
	 * @return finalPayment
	 * @throws NumberFormatException
	 * @throws TooManyHoursWorkedException
	 */
	public float computePay(int hours) throws NumberFormatException, TooManyHoursWorkedException {
		
		if (hours < 0) {
			
			throw new NumberFormatException("The hours can't be negative.");
			
		}
		if (hours > 40) {
			
			throw new TooManyHoursWorkedException("Hours can't be over 40 hours. ");
			
		}else {
			
			float finalPayment = hours * this.getHourlyPay();
			return finalPayment;
			
		}
		
		
		
	}


}
