package hw8;
/**
 * This program/class is all containing about the location address of the person lives
 * including street number, city, zip code, and the state.
 * @author shengshenghuo
 *
 */
public class Address {
	/**
	 * instance variables
	 */
	private int streetNum;
	private String streetName;
	private String city;
	private String zip;
	private String state;
	/**
	 * constructor
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
	 * The street number 
	 * @return streetNum
	 */
	public int getStreetNum() {
		return streetNum;
	}
	/**
	 * The new updated street number
	 * @param streetNum
	 */
	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}
	/**
	 * The name of the street
	 * @return streetName
	 */
	public String getStreetName() {
		return streetName;
	}
	/**
	 * The updated name of the street name
	 * @param streetName
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	/**
	 * The city of the address
	 * @return city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * The new updated city of the address
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * The zip code of the address
	 * @return zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * The new updated zipcode of the address
	 * @param zip
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	/**
	 * The state of the address
	 * @return state
	 */
	public String getState() {
		return state;
	}
	/**
	 * The new updated state of the address
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * customize the address information
	 */

	@Override
	public String toString() {
		return " Street  Number: " + this.getStreetNum()+ "\nStreet Name: " + this.getStreetName()+ 
				"\nCity: " + this.getCity()+ "\nZip Code: " + this.getZip()+ "\nState: " + this.getState();
	}
	

	

}
