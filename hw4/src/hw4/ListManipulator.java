package hw4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
/**
 * This class is all about the method show us how to manipulating among list/map in Java
 * @author shengshenghuo
 *
 */

public class ListManipulator {
	/**
	 * Accepts an array list of integers and sorts it in ascending or descending order.
	 *  Make sure to account for cases with duplicate values. The method returns the sorted list.
	 *  
	 * @param myLst
	 * @param ascending
	 * @return number 
	 */
	
	public ArrayList<Integer> sort(ArrayList<Integer>myLst, Boolean ascending){
		
		ArrayList<Integer> number = (ArrayList<Integer>) myLst.clone();
		
		if(ascending) {
			Collections.sort(number);

		}
		else {
			Collections.sort(number, Collections.reverseOrder());

		}
		return number;
		
	}
	
	
	/**
	 * Accept an array list of integers and swamps positions of the largest and the smallest elements.
	 * If multiple values representing largest/smallest elements are present then pick the first position. 
	 * The method returns the modified list.
	 * @param myLst
	 * @return number2
	 */
	
	public static ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> number2){
		// this method need to rewrite it 
		
		int max = Collections.max(number2);
		int min = Collections.min(number2);
		Collections.swap(number2, max, min);
	
		
		
		
		 //Collections.swap(number2, indexOfMax, indexOfMin);
		
		return number2;
		
		
		// we can do collection.sort(list, theNumberOfMax, theNumberOfMin);
		
	}
	
	
	/**
	 * 
	 * Accepts an array list of integers, creates a table of unique values , 
	 * and the number of times each value occurs, sorts this table, 
	 * and outputs it to command line.
	 * 
	 * @param myLst
	 */
	
	public void table(ArrayList<Integer> myLst) {
		
		Map<Integer, Integer> freq = new HashMap<>(); 
		
		for(int i = 0; i < myLst.size();i++) {
			
			int listValue= myLst.get(i);
			
			if(!freq.containsKey(listValue)) {
				freq.put(listValue,1);
				
			}
			else {
				freq.put(listValue, freq.get(listValue)+1);
			}
			
		}
		
		freq.forEach((k,v) -> System.out.println("Key = "+ k +"  Frequency = " + v));
		
	}
	
	
	
	
	
	
	
	public static void main(String arg[]) {
		
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		for(int i = 0; i < 11;i++) {
			
			number.add(i);
			
		}
		System.out.println(number);
	
		/*
		 * start with swapping process
		 */
		
		
		int indexOfMax = 0;
		int Max = number.get(0);
		
		for (int i = 1; i < number.size();i++) {
			
			if(number.get(i)> number.get(indexOfMax)) {
				Max = number.get(i);
				indexOfMax = i;
			}
		}
		System.out.println(Max);
		
		
		int Min = number.get(0);
		int indexOfMin =0;
		
		for(int j = 1; j <number.size();j++) {
			
			if(number.get(indexOfMin) > number.get(j)) {
				Min = number.get(j);
				indexOfMin = j;
			}
			
		}
		System.out.println(Min);
		
		
		
		
		/*
		 * swapping the value of the Max and the value of the Min
		 */
		 int temp =  Max ;
		 
		 number.set( indexOfMax,Min );
		 
		 number.set(indexOfMin, temp ) ;
		
		
		System.out.println(number);
		
		/*
		 * testing out the swapLargestSmall() method above
		 */
		
		
		ArrayList<Integer> test = new ArrayList<Integer>();
		
		for(int i = 0; i < 11;i++) {
			
			test.add(i);
		}
		
		ArrayList<Integer> myLst;
		myLst = swapLargestSmallest(test);
		System.out.println(myLst);
		
		
		
		
		
		
	}
	
	

}
