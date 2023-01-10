package hw3;
/**
 * Testing program for employee class to see if computPay method works
 * 
 * @author Shengsheng Huo
 *
 */

public class EmployeeTest {
	

	public static void main(String[] args) throws  NumberFormatException,TooManyHoursWorkedException {
		
		/**
		 * String first, String last, int id, float hourlyPay
		 * create an new object person1 for employee
		 */
		
		Employee person1 = new Employee("John","Smith",101,(float)35);
		/**
		 * test out when they work for 40 hours, and how much they got paid 
		 */
	
		try {
			System.out.println(person1.computePay(40));
		}catch(TooManyHoursWorkedException e){
			
			e.printStackTrace();
		}
		/**
		 * test out when they work for 23 hours, and how much they got paid 
		 */
		
		try {
			System.out.println(person1.computePay(23));
		}catch(TooManyHoursWorkedException e){
			
			e.printStackTrace();
		}
		
		/**
		 * test out when they work for 1 hour, and how much they got paid 
		 */
		
		try {
			System.out.println(person1.computePay(1));
		}catch(TooManyHoursWorkedException e){
			e.printStackTrace();	
		}
		/**
		 * test out when they work for 0 hour, and how much they got paid 
		 */
		
		try {
			System.out.println(person1.computePay(0));
		}catch(TooManyHoursWorkedException e){
			e.printStackTrace();
		}
		
		/**
		 * test out when they work for 45 hours, and how much they got paid 
		 */
		
		try {
			System.out.println(person1.computePay(45));
		}catch(TooManyHoursWorkedException e){
			e.printStackTrace();
		}
		
		/**
		 * test out when they work for -5 hours, and how much they got paid 
		 */
		
		try {
			person1.computePay(-5);
		}catch(TooManyHoursWorkedException e){
			e.printStackTrace();
		}
		
	

	}

}
