package hw8;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		//getting declared methods of Person class
		Method[] declaredMethods =Person.class.getDeclaredMethods();
		System.out.println("Person Class Methods : \n");
		
		//loop to display all methods indo
		for (int i=0;i<declaredMethods.length;i++) {
            
            //display method name and parameters count    
			System.out.printf("%-15s : Total Parameters- %2d",declaredMethods[i].getName(),declaredMethods[i].getParameterCount());
			//get parameters types
                Class[] parameters=declaredMethods[i].getParameterTypes();
                if(parameters.length>0)
                	System.out.printf(" : Parameter Types-");
                //loop to display parameter names
                for(Class parameter : parameters)
                {
                	System.out.print(" "+parameter.getSimpleName());
                }
                
                System.out.print("\n");
            
        }
		
		//getting declared methods of Address class
		Method[] declaredMethodAddress =Address.class.getDeclaredMethods();
		System.out.println("\n\nAddress Class Methods : \n");
		
		//loop to display all methods indo
		for (int i=0;i<declaredMethodAddress.length;i++) {
            
			 //display method name and parameters count      
			System.out.printf("%-15s : Total Parameters- %2d",declaredMethodAddress[i].getName(),declaredMethods[i].getParameterCount());
			//get parameters types    
			Class[] parameters=declaredMethodAddress[i].getParameterTypes();
                if(parameters.length>0)
                	System.out.printf(" : Parameter Types-");
              //loop to display parameter names
                for(Class parameter : parameters)
                {
                	System.out.print(" "+parameter.getSimpleName());
                }
                
                System.out.print("\n");
            
        }
		
		//get all fields from Address array
		Field[] fields = Address.class.getDeclaredFields();
		System.out.println("\n\nAddress Class Fields : \n");
		//loop to display name, type and modifier of fields
		for (Field field  :fields) {
            System.out.printf("%-10s %-8s   %s\n",field.getName(),field.getAnnotatedType().getType().getTypeName(),Modifier.toString(field.getModifiers()));
        
		}
	
		//try catch for object creation and invoking methods
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
				setFirstName.invoke(p1, "John");
				setLastName.invoke(p1, "Walter");
				setAge.invoke(p1, 42);
				//invoking methods for object p2
				setFirstName.invoke(p2, "Rebecca");
				setLastName.invoke(p2, "James");
				setAge.invoke(p2, 55);
				//invoking methods for object p3
				setFirstName.invoke(p3, "Shanaya");
				setLastName.invoke(p3, "Sharma");
				setAge.invoke(p3, 24);
				
				//creating object of Methods in Person
				Method getFirstName = Person.class.getDeclaredMethod("getFirstName");
				Method getAge = Person.class.getDeclaredMethod("getAge");
				
				//invoking methods for object p2
				System.out.println("\n"+getFirstName.invoke(p2));
				System.out.println(getAge.invoke(p2));
				
			}
		//catching exceptions
		catch ( NoSuchMethodException | SecurityException e) {
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
