/**
 * 
 * @author Shengsheng Huo
 * @since 2022-09-08
 * 
 * Product  Program
 * <p>
 * This is Product program, the program display basic information
 * of a product including its name, description,price and maximum order quantity. 
 * <p> 
 * Compile as {@code java Test.java}
 * <p>
 * Run as {@code java Test}
 * 
 */
public final class Product {
	/**
	 * instance variable 
	 */

	private final String Name;
	private final String Description; 
	private final Double Price;
	private final int MaxQuantity;
	
	/**
	 * Constructor
	 * This is member attributes of the class product 
	 * @param Name
	 * @param Description
	 * @param Price
	 * @param MaxQuantity
	 */
	public Product(String Name, String Description, Double Price, int MaxQuantity) {
		this.Name = Name;
		this.Description = Description;
		this.Price = Price;
		this.MaxQuantity = MaxQuantity; 
	}
	/**
	 * The name of the product 
	 * @return Name
	 */
	
	public String getName() {
		return Name;
	}
	/**
	 * The description of the product 
	 * @return Description
	 */
	
	public String getDescription() {
		return Description;
	}
	/**
	 * The price of the product 
	 * @return Price 
	 */
	
	public Double getPrice() {
		return Price;
	}
	/**
	 * The maximum quantity of products we can order
	 * @return MaxQuantity
	 */
	public int MaxQuantity() {
		return MaxQuantity;
	}
	
	@Override
	/**
	 * We make all the attributes to be string statement.
	 * @return product name, product description, its price  and the maximum quantity. 
	 * 
	 */
	public String toString() {
		return "Product Name : " + Name + ", Product Description : "+ Description + ", Price : "+ Price + ", MaxQuantity : "+ MaxQuantity;
	}

}
