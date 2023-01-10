package hw5;

import java.util.ArrayList;

/**
 * This is the testing program for shapes class 
 * we will test out the compute() method and max()
 * and min(). The result will be printed out when 
 * we execute the program. 
 * @author shengshenghuo
 *
 */

public class ShapeTest {

	public static void main(String[] args) {
		
		/*
		Shape triangle1 = new Triangle(8,6); 
		Shape triangle2 = new Triangle(12,9);
		Shape circle1 = new Circle(6);
		Shape circle2 = new Circle(8);
		Shape rectangle1 = new Rectangle(6,8);
		Shape rectangel2 = new Rectangle(8,9);
		Shape hexagon1 = new Hexagon(4); 
		Shape hexagon2 = new Hexagon(12);
		 */
		
		
		/*
		 * create an array list called list for shape class
		 */
		
		Shapes list = new Shapes(new ArrayList<Shape>());
		/*
		 * adding all kinds of shapes we want
		 */
		list.add(new Triangle(8,6));
		list.add(new Triangle(12,9));
		list.add(new Circle(6));
		list.add(new Circle(8));
		list.add(new Rectangle(6,8));
		list.add(new Rectangle(8,9));
		list.add(new Hexagon(4));
		list.add(new Hexagon(12));
		/*
		 * computing each object(shape)'s area and print it out the results synchronizedly
		 */
		list.compute();
		
		System.out.println("-------------------------------------");
		/*
		 * getting which object has the largest area and which one has smallest area in the array list named list. 
		 */
		list.Max();
		list.Min();
	
		
	

	}

}
