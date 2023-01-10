/**
 * 
 * @author Shengsheng Huo
 * @since 2022-09-08
 * 
 * Racoon Program
 * <p>
 * This is Racoon Class, the class displays basic information
 * of a Racoon, including how they move, sound, sleep, eat
 * and also for the cat, we specifically include how they scratch. 
 * 
 */

public class Raccon extends Animals implements Scratcher{
	public Raccon(String type,String name,int age,String gender,String environment,int miles_hr) {
		super(type, name,age,gender,environment,miles_hr);
	}
	/**
	 * print out how they move
	 */
	
	public void move() {
		System.out.println(" Raccon_move");
	}
	/**
	 * print out how they sound
	 */
	public void sound() {
		System.out.println(" Raccon_sound");
	}
	/**
	 * print out how they eat 
	 */
	public void eat() {
		System.out.println("Raccon_eat");
	}
	/**
	 * print out how they sleep
	 */
	public void sleep() {
		System.out.println(" Raccon_sleep");
	}
	
	/**
	 * print out the kind of the animal 
	 */
	
	@Override
	public String toString() {
		return "This is a RACCON !";
	}
	
	/**
	 * interface implementation
	 * print out how they scratch
	 */
	
	@Override
	public void scratch() {
		System.out.println("Raccon_scratch");
	}
	
	
	
	
	
	
	
	
	
	
	

}
