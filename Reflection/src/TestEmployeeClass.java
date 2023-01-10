import java.lang.reflect.*;

public class TestEmployeeClass {

	public static void main(String[] args) {
		/*
		 * example 1
		 */
		
		Employee el = new Employee("Janet Donovan",101,"Company2");
		
		Class employeeClass = el.getClass();
		
		try {
			Method toStringMethod = employeeClass.getDeclaredMethod("toString");
			
			System.out.println("My employee: LOL hahahahaha " + (String)toStringMethod.invoke(el)); 
			
		}catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException  e) {
			System.out.println("Warning: problems invoking the method");
		}
		
		
		
		
		System.out.println();
		System.out.println("**********************************************************************************************");
		
		
		
		
		
		/*
		 * declare method array
		 * which is in "Method"
		 */
		Method[] employeeMethods = employeeClass.getDeclaredMethods();
		
		for(Method method: employeeMethods) {
			
			String methodName = method.getName();
			/*
			 * declare parameter array
			 * which is in the "Class"
			 */
			Class[] parameters = method.getParameterTypes();
			
			if(parameters.length == 0) {
				
				System.out.println(methodName + "() has 0 parameters"); 
			}else {
				System.out.println( methodName + "() has " + parameters.length + "parameter(s) of the following types: ");
			}
			
			
			for(Class p : parameters) {
				System.out.println("\t" + p.toString());
				// System.out.println("\t" + p.getName());
			}
			

		}
		
		
		/*
		 * example 2
		 */
		System.out.println("---------------------------------------------------------------------------");
		
		Employee ell = new Employee("Janet Dono",111,"Company8");
		System.out.println("My employee: " + ell.toString());
		
		Class employeeClass2 = ell.getClass();
		
		
		try {
			/*
			 * reset the name of object "ell"
			 */
			Method setNameMethod = employeeClass2.getDeclaredMethod("setName", String.class);
			
			setNameMethod.invoke(ell, "James Fillmore");
		    
			System.out.println("My employee: LOL HAHAHAHA : " + ell.toString());
		
		
		
		}catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException  e) {
			System.out.println( "Warning: problems invoking the method");
		}
		
		
		System.out.println();
		System.out.println("********************************************************************************************************");
		/*
		 * Example: listing class methods and constructors with argument and return types 
		 */
		
		Employee el4 = new Employee(" Bitches Cum", 444, " company4");
		System.out.println(" My employee: " + el4.toString());
		
		Class employeeClass4 = el4.getClass();  
		
		System.out.println("\nEmployee Class methods: ");
		Method[] employeeMethods4 = employeeClass4.getMethods(); 
		
		for(Method method: employeeMethods) {
			/*
			 * toString() instead of getName()
			 */
			System.out.println(method.toString());
			
		}
		System.out.println("\nEmployee class declared methods: ");
		Method[] declaredMethods = employeeClass.getDeclaredMethods();
		
		for(Method method: declaredMethods) {
			System.out.println(method.toString());
		}
		
		System.out.println("\nEmployee class declared counstructors: ");
		Constructor[] declaredConstructors = employeeClass.getDeclaredConstructors();
		
		for(Constructor method: declaredConstructors) {
			System.out.println(method.toString());
		}
		
		
		/*
		 * Example: obtaining input parameter type information
		 * 
		 */
		
		
		Employee el5 = new Employee(" I hate working with YUKI",222, " Company5");
		
		Class employeeClass5 = el5.getClass();
		
		Method[] employeeMethod5 = employeeClass5.getDeclaredMethods();
		
		for(Method method: employeeMethod5) {
			String methodName = method.getName();
			
			Class[] parameters = method.getParameterTypes();
			
			if(parameters.length == 0) {
				System.out.println(methodName + "() has 0 parameters");
			}else {
				System.out.println(methodName + "() has " + parameters.length + " parameter(s) of the following types: ");
			}
			
			for(Class p : parameters) {
				System.out.println("\t" + p.getName());
			}
			
		}
		
		
		
		
		
		System.out.println();
		System.out.println("======================================================================");
		System.out.println();
		/*
		 * Example: checking how many parameters of type String each method has
		 */
		
		Employee el6 = new Employee(" gentle spirit", 343, "company6");
		Class employeeClass6 = el6.getClass();
		
		Method[] employeeMethod6 = employeeClass6.getDeclaredMethods();
		
		for(Method method : employeeMethod6) {
			String methodName = method.getName();
			
			Class[] parameter6 = method.getParameterTypes();
			int strCount = 0;
			
			
			for(Class p : parameter6) {
				
				if(p.equals(String.class)) {
					strCount ++;
				}
				
			}
			System.out.println(methodName + "() has " + strCount + " parameters of types String");
		}
		
		
		

		System.out.println();
		System.out.println("======================================================================");
		System.out.println();
		 /*
		  * Listing fields in class
		  */
		Employee el7 = new Employee("I am gonna be rich", 789,"Company7");
		System.out.println("My employee: " + el7.toString());
		
		System.out.println("Field names: ");
		Field[] employeeFields = Employee.class.getDeclaredFields();
		
		for(Field field: employeeFields) {
			System.out.println(field.getName());
			
		}
		System.out.println("\nField names and types");
		
		for(Field field: employeeFields) {
			System.out.println(field.toString());
		}
			

		System.out.println();
		System.out.println("======================================================================");
		System.out.println();
		/*
		 * Example: testing we found the field of interest 
		 * same Employee class as before 
		 */
		Field[] employeeFields2 = Employee.class.getDeclaredFields();
		
		for(Field field: employeeFields2) {
			if(field.getName().equals("name") && field.getType().equals(String.class)) {
				System.out.println("Found name field");
			}
		}
		/*
		 * this line will not execute as there is no field named lastName in class Employee
		 */
		for(Field field : employeeFields2) {
			if(field.getName().equals("lastName") && field.getType().equals(String.class)) {
				System.out.println("Found last name field ");
			}
		}
		
		
		
		 System.out.println();
		 System.out.println("======================================================================");
		 System.out.println();
		
		/*
		 * invoking a method with input arguments and return types
		 */
		Employee el9 = new Employee("Janet Donovan", 999, "Company9");
		
		Class employeeClass9 = el9.getClass();
		
		try {
			
			Method computePayMethod = employeeClass9.getDeclaredMethod("computePay", int.class, double.class, double.class);
			System.out.println("Employee pay this period = $" + (double)computePayMethod.invoke(el9, 45, 10,20));
		
		}catch(NoSuchMethodException|IllegalAccessException|InvocationTargetException e) {
			System.out.println(e);
		}
		
		/*
		 * Changing the values of class fields 
		 */
		
		System.out.println();
		System.out.println("======================================================================");
	    System.out.println();
		
	    try {
	    	Field privateHelperMethod = employeeClass9.getDeclaredMethod("privateHelper");
	    	
	    	System.out.println("Accessible = " + privateHelperMethod.isAccessible());
	    	
	    	privateHelperMethod.setAccessible(true);
	    	
	    	System.out.println((String)privateHelperMethod.invoke(el9));
	    	
	    	
	    	privateHelperMethod.setAccessible(false);
	    
	    }catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
	    	System.out.println(e);
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		

 }
}
