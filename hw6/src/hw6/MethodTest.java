package hw6;

import java.util.ArrayList;
import java.util.List;
/**
 * Implement a generic method called count() to count the number of elements in a list of generic elements. 
 * Inside the main() method create an ArrayList of 5 String objects, 6 Integer objects, and 8 Double objects. 
 * Make three different calls to the count() method, once for each of the three lists, and print the result to command line. 
 * 
 * @author shengshenghuo
 *
 */

public class MethodTest {
	/**
	 * This is the generic count method for generic type of List
	 * @param <T>
	 * @param elements
	 */
	private static <T> void count(List<T> elements) {
		
		int counts = 0;
		
		for(T element : elements) {
			
			if(element!= null) {
				counts = counts + 1;
			}
			
		}
		System.out.println("Total number counts: " + counts);
			
		
	}

	public static void main(String[] args) {
		/**
		 * creating an string array list 
		 * and adding 5 elements in it
		 */
		
		List<String> str = new ArrayList<String>();
		str.add("pear");
		str.add("apple");
		str.add("strawberry");
		str.add("lemon");
		str.add("cherry");
		
		/**
		 * creating an integer numbers array list
		 * and adding 6 elements in it 
		 */
		List<Integer> num = new ArrayList<Integer>();
		for(int i = 0; i < 6;i++) {
			num.add(i);
		}
		
		
		/**
		 * creating an double numbers array list
		 * and adding 8 elements in it
		 */
		double[] doubleArray = {1.3,67.8,3.4,5.6,3.4,8.9,9.6, 12.23};
		List<Double> doubleNums = new ArrayList<Double>();
		
	
		for(int j = 0; j < doubleArray.length;j++) {
			doubleNums.add(doubleArray[j]);
		}
		
		
		/**
		 * using count() method to count the number of elements in the different type of array list 
		 */
		System.out.println("For String Objects: ");
		count(str);
		
		System.out.println();
		System.out.println("For Integer Objects: ");
		count(num);
		
		System.out.println();
		System.out.println("For Double Objects: ");
		count(doubleNums);
		
		
		
		

	}

}
