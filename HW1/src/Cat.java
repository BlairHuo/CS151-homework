/**
 * 
 * @author Shengsheng Huo
 * @since 2022-09-08
 * 
 * Cat Program
 * <p>
 * This is Cat Class, the class displays basic information
 * of a Cat, including how they move, sound, sleep, eat
 * and also for the cat, we specifically include how they 
 * walk and how they scratch. 
 * 
 */
public class Cat extends Animals implements Domesticated,Scratcher{
	public Cat(String type,String name,int age,String gender,String environment,int miles_hr) {
		super(type, name,age,gender,environment,miles_hr);
	}
	/**
	 * print out how they move
	 */
	public void move() {
		System.out.println("Cat moving");
		
	}
	/**
	 * print out how they sound
	 */
	public void sound() {
		System.out.println("Cat sounding");
	}
	/**
	 * print out how they sleep
	 */
	public void sleep() {
		System.out.println("Cat sleeping");
		
	}
	/**
	 * print out how they eat 
	 */
	public void eat() {
		System.out.println("Cat eating");
	}
	
	/**
	 * print out how they scratch
	 */
	
	@Override
	public void scratch() {
		System.out.println("meow, meow Cat");
	}
	/**
	 * print out the kind of the animal 
	 */
	@Override
	public String toString() {
		return "This is a CAT !";
	}
	
	/**
	 * print out how they walk
	 */
	@Override 
	public void walk() {
		System.out.println("Cat walking");
	}
	/**
	 * print out how they greet our humans
	 */
	@Override
	public void greetHuman() {
		System.out.println("Cat greetHuman");
		
	}

}
