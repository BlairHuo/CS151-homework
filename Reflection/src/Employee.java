
import java.lang.reflect.*;

public class Employee {
	private String name;
	private int id;
	private String employer;
	
	public Employee() {
		this.name = "";
		this.id = 0;
		this.employer ="";
		
	}
	public Employee(String name, int id, String employer) {
		this.name = name;
		this.id = id;
		this.employer = employer;
	}

	public String getName() {
		return name;
	}
	public int getID() {
		return id;
	}
	public String getEmployer() {
		return employer;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setID(int id) {
		this.id = id;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	@Override
	public String toString() {
		return this.name + "(" + this.id +") at "+ this.employer;
	}
	/*
	 * The method is used : computePay()
	 */
	public double computePay(int hours, double regularRate, double overtimeRate) {
		
		int overtimeHours = hours - 40;
		if(overtimeHours > 0) {
			return 40 * regularRate + overtimeHours * overtimeRate;
		}else {
			return hours * regularRate;
		}
		
	}
	/*
	 * private static helper
	 */
	private String privateHelper() {
		return " additional employee infomation" ;
	}
	
	
	
	public static void main(String[] args) {
		/*
		 * first test
		 */
		
		try {
			Class employeeClass = Class.forName("Employee");
			
			System.out.println(employeeClass.getName());
		
		}catch(ClassNotFoundException e) {
			System.out.println(e); 
		}
		
		
		/*
		 * second test
		 */
		
		Employee el = new Employee("Janet Donovan",101, "Company2");
		System.out.println("My employee: " + el.toString());
		
		 Class employeeClass = el.getClass();
		 
		 System.out.println("\nEmployee class methods: ");
		 Method[] employeeMethods = employeeClass.getMethods();
		 
		 for(Method method: employeeMethods) {
			 
			 System.out.println( method.getName());
			 
		 }
		 
		 System.out.println("\nEmployee class declared methods:");
		 Method[] employeeDeclaredMethods = employeeClass.getDeclaredMethods();
		 
		 for(Method method: employeeDeclaredMethods) {
			 
			 System.out.println(method.getName());
			 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 System.out.println("\nEmployee calss declared constructors");
		 
		 Constructor[] employeeDeclaredConstructors = employeeClass.getDeclaredConstructors();
		 
		 for(Constructor method: employeeDeclaredConstructors) {
			 
			 System.out.println(method.getName());
		 }
		/*
		 * getDeclaredMethods()
		 * list only methods declared in the class definition
		 * 
		 * getMethods()
		 * list all methods available to the class, including inherited methods
		 * 
		 * method.getName()
		 * 
		 * if we want to print out the listing class methods and constructors with argument and return types
		 * then we could turn the getName() into toString()
		 */
		
		
		
		
		

	}

}
