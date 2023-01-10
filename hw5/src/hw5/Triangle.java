package hw5;
/**
 * This program is to calculate the area of a triangle 
 * based on their length of height and length of bottom
 * In this program, we have method of getter and setter 
 * of their attributes : the length of its height and bottom
 * the method to compute their area. 
 * 
 * @author shengshenghuo
 *
 */

public class Triangle extends Shape{
	/*
	 * instance variable
	 */
	private double Height;
	private double bottom;
	/*
	 * constructor
	 */
	public Triangle(double Height, double bottom) {
		super();
		this.Height = Height;
		this.bottom = bottom;
	}
	/**
	 * The length of the height of the triangle
	 * @return Height
	 */
	public double getHeight() {
		return Height;
	}
	/**
	 * The length of the bottom of the triangle
	 * @return bottom                                                   
	 */
	public double getBottom() {
		return bottom;
	}
	/**
	 * The updated the length of new height of the triangle
	 * @param newHeight
	 */
	public void setHeight(double newHeight) {
		Height = newHeight;
	}
	/**
	 * The updated the length of new bottom of the triangle
	 * @param newBottom
	 */
	public void setBottom(double newBottom) {
		bottom = newBottom;
	}
	/**
	 * This method is to compute the area of the triangle 
	 * based on their length of height and length of bottom
	 */
	public void computeArea() {
		
		double area = Height * bottom * 0.5;
		
		area = Math.round(area);
		System.out.println(this.toString() + "\nArea " + area);
		
	}
	/**
	 * This method is to customize introduction to a triangle
	 */
	@Override
	public String toString() {
		return  super.toString()+"\nShape : Triangle"+ "\nHeight: " + this.getHeight() +" \nBottom: " +  this.getBottom();
	}
	
	public double getArea() {
		return Math.round(Height * bottom * 0.5);
	}

}
