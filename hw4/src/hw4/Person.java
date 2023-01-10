package hw4;
/**
 * This class contain a person's basic information 
 * That will be including their first name, last name and their age.
 * and also those setters and getters methods.
 * @author shengshenghuo
 *
 */

public class Person {
	/*
	 * instance variable
	 */
	private String first;
	private String last;
	private int age;
	/*
	 * empty constructor
	 */
	public Person() {
		
	}
	/*
	 * non empty constructor
	 */
	public Person(String first, String last, int age) {
		
		this.first = first;
		this.last = last;
		this.age = age;
	}
	
	/**
	 * The first name of the person
	 * @return first
	 */
	public String getFirst() {
		return first;
	}
	
	/**
	 * The last name of the person
	 * @return last 
	 */
	public String getLast() {
		return last;
	}
	
	/**
	 * The age of the person
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * The new updated first name of the person
	 * @param newFirst
	 */
	public void setFrist(String newFirst) {
		first = newFirst;
	}
	
	/**
	 * The new updated last name of the person
	 * @param newLast
	 */
	public void setLast(String newLast) {
		last = newLast;
	}
	
	/**
	 * The new updated age of the person
	 * @param newAge
	 */
	public void setAge(int newAge) {
		age = newAge;
	}
	
	/**
	 * customize the information of a person
	 */
	@Override
	public String toString() {
		return "First Name: " + this.first + "\nLast Name: " + this.last + "\nAge: " + this.age+ "\n";
	}
	

	

}
