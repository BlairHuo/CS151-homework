package hw4;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This program has different comparator objects based on different attributes we put in 
 * and also , this program also demonstrate the example sorting the array list based on the comparator. 
 * 
 * @author shengshenghuo
 *
 */

public class PersonTest {

	public static void main(String[] args) {
		/**
		 * This comparator object sorts the list based on its attributes "age" in  descending order
		 */
		Comparator<Person> myC = new Comparator<Person>() {
			
			@Override 
			public int compare(Person ppl1, Person ppl2) {
				return (int)ppl2.getAge()-ppl1.getAge();
				
			}
		};
		
		/**
		 * This comparator object sorts the list based on its attributes "age" in  ascending order
		 */
		Comparator<Person> myC2 = new Comparator<Person>() {
			
			@Override 
			public int compare(Person ppl1, Person ppl2) {
				return (int)ppl1.getAge()-ppl2.getAge();
				
			}
		};
		/**
		 * This comparator object sorts the list based on its attributes "fist name" in  alphabetically ascending order
		 */
		Comparator<Person> myC3 = new Comparator<Person>() {
			
			@Override 
			public int compare(Person ppl1, Person ppl2) {
				return ppl1.getFirst().compareTo(ppl2.getFirst());
				
			}
		};
		
		/**
		 * This comparator object sorts the list based on its attributes "fist name" in  alphabetically descending order
		 */
		Comparator<Person> myC4 = new Comparator<Person>() {
			
			@Override 
			public int compare(Person ppl1, Person ppl2) {
				return ppl2.getFirst().compareTo(ppl1.getFirst());
				
			}
		};
		
		/**
		 * This comparator object sorts the list based on its attributes "last name" in   ascending order
		 */
		Comparator<Person> myC5 = new Comparator<Person>() {
			
			@Override 
			public int compare(Person ppl1, Person ppl2) {
				return Integer.compare(ppl1.getLast().length(),ppl2.getLast().length());
				
			}
		};
		
		/**
		 * This comparator object sorts the list based on its attributes "last name" in  descending order
		 */
		Comparator<Person> myC6 = new Comparator<Person>() {
			
			@Override 
			public int compare(Person ppl1, Person ppl2) {
				return Integer.compare(ppl2.getLast().length(),ppl1.getLast().length());
				
			}
		};
		
		
		
		ArrayList<Person> list = new ArrayList<Person> ();
		
		list.add(new Person("Joe","Smith",40));
		list.add(new Person("Amy","Gold",32));
		list.add(new Person("Tony","Stock",21));
		list.add(new Person("Sean","Irish",24));
		list.add(new Person("Tina","Brock",28));
		list.add(new Person("Lenny","Hep",18));
		
	
		
		Collections.sort(list,myC);// sort the based on age descending
		System.out.println( "This comparator object sorts the list based on its attributes \"age\" in  descending order");
		for(int i = 0; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		
		Collections.sort(list,myC2);// sort the based on age ascending
		System.out.println( "This comparator object sorts the list based on its attributes \"age\" in  ascending order");
		for(int i = 0; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		
		
		Collections.sort(list,myC3);//sort the based on first name alphabetically ascending
		System.out.println( "This comparator object sorts the list based on its attributes \"first name\" in  alphabetically ascending order");
		for(int i = 0; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		
		Collections.sort(list,myC4);//sort the based on first name alphabetically descending
		System.out.println( "This comparator object sorts the list based on its attributes \"first name\" in alphabetically descending order");
		for(int i = 0; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		
		Collections.sort(list,myC5);//sort the based on last name's length ascending
		System.out.println( "This comparator object sorts the list based on its attributes \"last name\" in ascending order");
		for(int i = 0; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		
		
		Collections.sort(list,myC6);//sort the based on last name 's length descending
		System.out.println( "This comparator object sorts the list based on its attributes \"last name\" in  descending order");
		for(int i = 0; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		
		
		
		
	}

}
