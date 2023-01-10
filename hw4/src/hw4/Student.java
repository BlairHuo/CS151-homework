package hw4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * This program contains the basic information of a student
 * and also contain methods which are addCourse(),removeCourse(), 
 * and sortCourse(). 
 * 
 * 
 * @author shengshenghuo
 *
 */

public class Student {
	
	/*
	 * instance variables
	 */
	
	private String firstName;
	private String lastName;
	private int age;
	private float gpa;
	private String major;
	private String department;
	private LinkedList <Course>courses;
	
	/*
	 * empty constructor
	 */
	public Student() {
		courses = new LinkedList<Course>();
	}
	
	
	/**
	 * non empty constructor 
	 * 
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param gpa
	 * @param major
	 * @param department
	 */
	public Student(String firstName, String lastName, int age, float gpa, String major, String department) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		
		
	}
	
	/**
	 * non empty constructor 
	 * 
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param gpa
	 * @param major
	 * @param department
	 * @param course
	 */
	public Student(String firstName, String lastName, int age, float gpa, String major, String department,LinkedList <Course>courses) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		this.courses = courses;
		
		
	}
	
	/**
	 * The first name of the student
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * The last name of the student
	 * @return lastName
	 */
	
	public String getLastName() {
		return lastName;
	}
	/**
	 * The age of the student
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * The gpa of the student
	 * @return gpa
	 */
	public float getGpa() {
		return gpa;
	}
	/**
	 * The major of the student
	 * @return major
	 */
	public String getMajor() {
		return major;
	}
	/**
	 * The department of the student belongs to 
	 * @return department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * The bunch of the courses the students take
	 * @return courses
	 */
	public LinkedList<Course> getCourses() {
		return courses;
	}
	
	/**
	 * The new updated fist name of the student
	 * @param newFirstName
	 */
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	/**
	 * The new updated last name of the student
	 * @param newLastName
	 */
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
	/**
	 * The new updated age of the student
	 * @param newAge
	 */
	public void setAge(int newAge) {
		age = newAge;
	}
	/**
	 * The new updated GPA of the student
	 * @param newGpa
	 */
	public void setGpa(float newGpa) {
		gpa = newGpa;
	}
	/**
	 * The new updated major of the student
	 * @param newMajor
	 */
	public void setMajor(String newMajor) {
		major = newMajor;
	}
	/**
	 * The new updated department of the student belongs to 
	 * @param newDepartment
	 */
	public void setDeparment(String newDepartment) {
		department = newDepartment;
	}
	/**
	 * The new updated bunch of courses of the student takes
	 * @param newCourses
	 */
	public void setCourse(LinkedList<Course> newCourses) {
		courses = newCourses;
	}
	
	/**
	 * add a new course
	 * @param anotherCourse
	 */
	public void addCourse(Course anotherCourse) {
		
		if(! courses.contains(anotherCourse)) {
			
			this.courses.add(anotherCourse);
		}
	
	}
	/**
	 * remove a course
	 * @param theCourse
	 */
	public void removeCourse(Course theCourse) {
		if(courses.contains(theCourse)) {
			
			this.courses.remove(theCourse);
		}
		
	}
	/**
	 * Sort the list based on the attributes we put in 
	 * @param basedAttributes
	 * @param ascending
	 */
	public void sortCourse(String basedAttributes, boolean ascending) {
		
		Hashtable< String,Integer> myhash = new Hashtable<String,Integer>();
		
		myhash.put("Sunday", 0);
		myhash.put("Monday", 1);
		myhash.put("Tuesday", 2);
		myhash.put("Wednesday", 3);
		myhash.put("Thursday", 4);
		myhash.put("Friday", 5);
		myhash.put("Saturday", 6);
		
		Comparator<Course> mycomparator = new Comparator<Course>() {
			
			@Override
			public int compare(Course c1, Course c2) {
				
				switch(basedAttributes) {
				
				case "Course Name": 
					return c1.getCourseName().compareTo(c2.getCourseName());
					
				case "Department" :
					return c1.getDepartment().compareTo(c2.getCourseName());
					
				case "Description":
					return c1.getDescription().compareTo(c2.getDescription());
					
				case "Time" :
					return c1.getTime().compareTo(c2.getTime());
					
				case "Weekday" :
					return myhash.get(c1.getWeekday())- myhash.get(c2.getWeekday());
					
					
				}
				return c2.getCourseName().compareTo(c1.getCourseName());
			}
		};
		
		if(ascending) {
			
			Collections.sort(courses,mycomparator);
			
		}
		else {
			Collections.reverse(courses);
		}
		
		
		/*
		 * print it out 
		 */
		
		Iterator courseIterator = courses.iterator();
		while(courseIterator.hasNext()) {
			System.out.println(courseIterator.next());
			
		}
		
		
		
	}
	
	
}
