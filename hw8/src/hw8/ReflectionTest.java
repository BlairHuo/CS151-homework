package hw8;

import java.lang.reflect.*;

/**
 * This program is all about Java Reflection
 * and it contains some methods that print out all method in Address class
 * and prints out declared methods for person class
 * and prints out declared field for address class
 * last but not least, Use Java reflection to invoke setFirstName(), setLastName() and setAge() 
 * in one or more instance(s) of Person class.
 * @author shengshenghuo
 *
 */



public class ReflectionTest {
	
	
	public static void main(String[] args) {
		
		/*
		 * 1. print out the class declared methods that listed in the Person class
		 */
		
		Method[] declaredMethods =Person.class.getDeclaredMethods();
		
		System.out.println("Person Class Declared Methods : \n");
		
		
		
		for(Method declared : declaredMethods) {
			
			String methodName = declared.getName();
			
			Class[] parameters = declared.getParameterTypes();
			
			if(parameters.length == 0) {
				System.out.println(methodName + "() has 0 parameters");
			}else {
				System.out.println(methodName + "() has " + parameters.length + " parameter(s) of the following types: ");
			}
			
			for(Class<?> p : parameters) {
				System.out.println("\t" + p.getName());
			}
			
		}
		
		
		
		
		
		
		System.out.println();
		System.out.println("======================================================================");
		System.out.println();
		/*
		 * 2. print out all the methods listed in the Address class
		 */
		
		Method[] allMethods = Address.class.getMethods();
		System.out.println("Address Class Methods : \n");
		
		for(Method method: allMethods) {
			
			String methodName2 = method.getName();
			Class[] parameter2 = method.getParameterTypes();
			
			if(parameter2.length == 0) {
				System.out.println(methodName2 + "() has 0 parameters");
				
			}else {
				
				System.out.println(methodName2 + "() has" + parameter2.length + " parameter(s) of the following types:");
			}
			
			for(Class<?> p : parameter2) {
				System.out.println("\t" + p.getName());
			}
			
		}
		
		
		
		
		
		
		System.out.println();
		System.out.println("======================================================================");
		System.out.println();
		/*
		 * 3.  print out all fields declared in class Address(declared fields only), including the access modifier and the type of the field
		 */
		
		Field[] AddressField = Address.class.getDeclaredFields();
		
		
		for(Field declaredFields: AddressField) {
			System.out.println("Address Class Declared Fileds' names and types : \n");
			System.out.println(declaredFields.toString());
			
			System.out.println("\nType of Modifiers:");
			int modifiers = declaredFields.getModifiers();
			System.out.println(Modifier.toString(modifiers));
		}
		
		
		System.out.println();
		/*
		 * easier way to do it 
		 */
		for (Field field  :AddressField) {
            System.out.printf("%-10s %-8s   %s\n",field.getName(),field.getAnnotatedType().getType().getTypeName(),Modifier.toString(field.getModifiers()));
        
		}
		
		
		
		
		
		

		System.out.println();
		System.out.println("======================================================================");
		System.out.println();
		/*
		 * 4. Instantiate 3 new instances of class Person. This should also involve instantiating 
		 *    the Address class using reflection.
		 * 5. Use Java reflection to invoke setFirstName(), setLastName() and setAge() in one or 
		 * 	  more instance(s) of Person class.
		 */
		try {
			
			//creating three objects of Person class
			Person p1 =new Person();
			Person p2 =new Person();
			Person p3 =new Person();
			
			//creating object of Methods in Person
			Method setFirstName = Person.class.getDeclaredMethod("setFirstName", String.class);
			Method setLastName = Person.class.getDeclaredMethod("setLastName", String.class);
			Method setAge = Person.class.getDeclaredMethod("setAge", int.class);
	
			//invoking methods for object p1
			setFirstName.invoke(p1, "Caleb");
			setLastName.invoke(p1, "Wall");
			setAge.invoke(p1, 16);
			//invoking methods for object p2
			setFirstName.invoke(p2, "Rebecca");
			setLastName.invoke(p2, "Smith");
			setAge.invoke(p2, 22);
			//invoking methods for object p3
			setFirstName.invoke(p3, "Sharon");
			setLastName.invoke(p3, "Shoma");
			setAge.invoke(p3, 28);
			
			//creating object of Methods in Person
			Method getFirstName =Person.class.getDeclaredMethod("getFirstName");
			Method getAge =Person.class.getDeclaredMethod("getAge");
			Method getLastName = Person.class.getDeclaredMethod("getLastName");
			
			//invoking methods for object p1
			System.out.println("\nPerson1:\nFirst Name:" + getFirstName.invoke(p1));
			System.out.println("Last Name:" + getLastName.invoke(p1));
			System.out.println("Age: "+ getAge.invoke(p1));
			
			//invoking methods for object p2
			System.out.println("\nPerson2:\nFirst Name:"+getFirstName.invoke(p2));
			System.out.println("Last Name:" + getLastName.invoke(p2));
			System.out.println("Age: "+ getAge.invoke(p2));
			
			//invoking methods for object p3
			System.out.println("\nPerson3:\nFirst Name:" + getFirstName.invoke(p3));
			System.out.println("Last Name:" + getLastName.invoke(p3));
			System.out.println("Age: "+ getAge.invoke(p3));
		}
	//catching exceptions
	catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
}




		

	}


