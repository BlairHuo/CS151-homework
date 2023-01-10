package hw2;
/**
 * This is address class contain person's information of their living place
 * @author Shengsheng Huo
 *
 */

public class Address {
	/**
	 * Because class Address is composition of the abstract class Person
	 * so class Address doesn't need to inherited 
	 */
	
	private int streetNum;
	private String streetName;
	private String city;
	private String zip;
	private String state;
	/**
	 * The constructor of Address 
	 * @param streetNum
	 * @param streetName
	 * @param city
	 * @param zip
	 * @param state
	 */
	
	public Address(int streetNum, String streetName, String city, String zip, String state) {
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.city = city;
		this.zip = zip;
		this.state = state;
	}
	/**
	 * The number of the street
	 * @return streetNum
	 */
	public int getStreetNum() {
		return streetNum;
	}
	/**
	 * The name of the street
	 * @return streetName
	 */
	public String getStreetName() {
		return streetName;
	}
	/**
	 * The city of the address
	 * @return city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * The zip code of the address
	 * @return zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * The state of the address
	 * @return state
	 */
	public String getState() {
		return state;
	}
	/**
	 * update the new street number
	 * @param newStreetNum
	 */
	public void setStreetNum(int newStreetNum) {
		streetNum = newStreetNum;
		
	}
	/**
	 * update the name of street
	 * @param newStreetName
	 */
	public void setStreetName(String newStreetName) {
		streetName = newStreetName;
		
	}
	/**
	 * update new city name of the address
	 * @param newCity
	 */
	public void setCity(String newCity) {
		city = newCity;
		
	}
	/**
	 * update zip code of the address
	 * @param newZip
	 */
	public void setZip(String newZip) {
		zip = newZip;
		
	}
	/**
	 * update new state of the address
	 * @param newState
	 */
	public void setState(String newState) {
		state = newState;
		
	}
	@Override 
	/**
	 * This is customized address
	 */
	public String toString() {
		return " Address:\n" + " Street Number: " + streetNum + "\n" +
	           "Street Name: " + streetName + "\n" + "City: " + city + "\n" + "State: " + 
				state + "\n" + "Zip Code: " + zip + "\n";
	
	}

}
