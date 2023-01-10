/**
 * 
 * @author Shengsheng Huo
 * @since 2022-09-08
 * 
 * Whale Program
 * <p>
 * This is Whale Class, the class displays basic information
 * of a Cat, including how they move, sound, sleep, eat
 * and also for the cat, we specifically include how they 
 * swim
 * 
 */
public class Whale extends Animals implements Swimmer{
	public Whale(String type,String name,int age,String gender,String environment,int miles_hr){
		super(type, name,age,gender,environment,miles_hr);
	}
	/**
	 * print out how they move
	 */
	
	public void move() {
		System.out.println("Whale moved");
	}
	/**
	 * print out how they sound
	 */
	public void sound() {
		System.out.println("Whale sounded");
	}
	/**
	 * print out how they eat
	 */
	public void eat() {
		System.out.println("Whale eated");
	}
	/**
	 * print out how they sleep
	 */
	public void sleep() {
		System.out.println("Whale sleeped");
	}
	/**
	 * print out the kind of the animal
	 */
	
	@Override
	public String toString() {
		return " This is Whale!";
	}
	/**
	 * print out how they swim
	 */

	public void swim() {
		System.out.println("Whale swimed");
	}
	
	
	
	
	

}
