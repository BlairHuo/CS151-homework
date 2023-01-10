package hw3;
/**
 * This is the exception class for the class Employee and the method 
 * in computePay()
 * @author shengshenghuo
 *
 */

public class TooManyHoursWorkedException extends Exception{
	
	/**
	 * This is the seriaVersion UID for this class.
	 */
	private static final long serialVersionUID = 1L;

	public TooManyHoursWorkedException(String message) {
		super(message);
	}

}
