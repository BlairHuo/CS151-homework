/**
 * 
 * @author Shengsheng Huo
 * @since 2022-09-08
 * 
 * Animal Program
 * <p>
 * This is Animal program, the program display basic information
 * of an Animal including the kind of an animal, the name, the gender, 
 * the environment they are living and how fast they are- which is their 
 * speed. 
 * <p> 
 * Compile as {@code java Test.java}
 * <p>
 * Run as {@code java Test}
 * 
 */
public class Animals {
	
	/**
	 * instances
	 */
	private String type;
	private String name;
	private int age;
	private String gender;
	private String environment;
	private int miles_hr;
	
	/**
	 * Constructor of the class Animal
	 * @param type
	 * @param name
	 * @param age
	 * @param gender
	 * @param environment
	 * @param miles_hr
	 * @author shengshenghuo
	 */
	public Animals(String type,String name,int age,String gender,String environment,int miles_hr) {
		
		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.environment = environment;
		this.miles_hr = miles_hr;
		
	}
	/**
	 * The kind of the animal
	 * @return type
	 */
	public String gettype() {
		return type;
	}
	/**
	 * The new updated kind of the animal
	 * @param theNewType
	 */
	public void settype(String theNewType) {
		type = theNewType;
	}
	/**
	 * The name of the animal
	 * @return name
	 */
	public String getname() {
		return name;
	}
	/**
	 * The updated new name of the animal
	 * @param theNewName
	 */
	public void setname(String theNewName) {
		name = theNewName;
	}
	/**
	 * The age of the animal
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * The new age of the animal
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * The gender of the animal
	 * @return gender
	 */
	
	public String getGender() {
		return gender;
	}
	/**
	 * The new updated gender of the animal
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * The environment of the animal live 
	 * @return environment
	 */
	public String getEnvironment() {
		return environment;
	}
	/**
	 * The new updated environment of the animal live 
	 * @param environment
	 */
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	/**
	 * The speed of the animal
	 * @return miles_hr
	 */
	
	public int getMiles_hr() {
		return miles_hr;
	}
	/**
	 * The new updated speed of the animal
	 * @param miles_hr
	 */
	public void setMiles_hr(int miles_hr) {
		this.miles_hr = miles_hr;
	}
	
	
	


	
}
