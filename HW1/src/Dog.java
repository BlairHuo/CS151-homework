/**
 * 
 * @author Shengsheng Huo
 * @since 2022-09-08
 * 
 * Dog Program
 * <p>
 * This is Dog Class, the class displays basic information
 * of a Cat, including how they move, sound, sleep, eat
 * and also for the cat, we specifically include how they 
 * walk and how they bark, also greet our humans
 * 
 */
public class Dog extends Animals implements Domesticated{
	public Dog(String type,String name,int age,String gender,String environment,int miles_hr) {
		super(type, name,age,gender,environment,miles_hr);
	}
	/**
	 * print out how they move
	 */
	
	public void move() {
		System.out.println(" Doggy move...");
		
	}
	/**
	 * print out how they sound
	 */
	public void sound() {
		System.out.println("Doggy sound...");
	}
	/**
	 * print out how they sleep
	 */
	public void sleep() {
		System.out.println("Doggy sleep...");
		
	}
	/**
	 * print out how they eat 
	 */
	public void eat() {
		System.out.println("Doggy eating...");
		
	}
	/**
	 * print out how they bark
	 */
	
	public void bark() {
		System.out.println("wa wa wa Doggy...");
	}
	/**
	 * print out the kind of the animal 
	 */
	@Override
	public String toString() {
		return "This is a DOG !";
	}
	/**
	 * print out how they walk
	 */
	
	@Override 
	public void walk() {
		System.out.println("Doggy walk...");
	}
	/**
	 * print out how they greet our humans
	 */
	@Override
	public void greetHuman() {
		System.out.println("Doggy greetHuman...");
		
	}
	
	
	
	
	
	
	

}
