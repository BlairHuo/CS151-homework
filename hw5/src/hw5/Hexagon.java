package hw5;
/**
 * This program is to calculate the area of a hexagon
 * based on their length of sides.
 * In this program, we have method of getter and setter 
 * of their attributes : the length of its sides
 * the method to compute their area. 
 * 
 * @author shengshenghuo
 *
 */

import java.lang.Math;
public class Hexagon extends Shape{
	/*
	 * instance variables
	 */
	private double sides;
	/*
	 * constructor 
	 */
	public Hexagon(double sides) {
		this.sides = sides;
		
	}
	
	/**
	 * The length of the hexagon sides
	 * @return sides
	 */

	public double getSides() {
		return sides;
	}
	/**
	 * The updated new length of the hexagon sides
	 * @param newSides
	 */
	public void setSides(double newSides) {
		
		sides = newSides;
		
	}
	
	/**
	 * This method is to customize the introduction of hexagon
	 */
	@Override
	public String toString() {
		return super.toString()+"\nShape : Hexagon"+ "\nHexagon's side: " + this.sides;
	}
	
	
	/**
	 * This method is to calculate the area of  hexagon 
	 * formula is: (3√3)/2 * side^2
	 */
	public void computeArea() {
		
		double area = Math.sqrt(3)*3 /2 * Math.pow(this.getSides(), 2);
		area = Math.round(area);
		System.out.println(this.toString() + "\nArea: " + area);
	}
	

	public double getArea() {
		return Math.round(Math.sqrt(3)*3 /2 * Math.pow(this.getSides(), 2));
	}

}
