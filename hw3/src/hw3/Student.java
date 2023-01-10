package hw3;

/**
 * This program contain basic information of the student
 * This class includes all attributes(getters and setters) of a students  
 * 
 * @author shengshenghuo
 *
 */
public class Student implements Cloneable{
	/**
	 * instance variables
	 */
	private String firstName;
	private String lastName;
	private int age;
	private float gpa;
	private String major;
	private String department;
	private Course course;
	
	/**
	 * The constructor of the class Student
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param gpa
	 * @param major
	 * @param department
	 * @param course
	 */
	public Student(String firstName, String lastName, int age, float gpa, String major,String department, Course course) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		this.course = course;
	}
	
	/**
	 * The first name of the student
	 * @return firstName
	 */
	public String getfirstName() {
		return firstName;
	}
	/**
	 * The lastName of the student
	 * @return lastName
	 */
	public String getlastName() {
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
	 * The GPA of the student 
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
	 * The major department of the student belongs to 
	 * @return department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * The courses the students are taking
	 * @return course
	 */
	public Course getCourse() {
		return course;
	}
	
	/**
	 * The updated new first name of the student
	 * @param newFirst
	 */
	public void setfirstName(String newFirst) {
		firstName = newFirst;
	}
	/**
	 * The updated new last name of the student
	 * @param newLast
	 */
	public void setlasttName(String newLast) {
		lastName = newLast;
	}
	/**
	 * The updated new age of the student 
	 * @param newAge
	 */
	public void setAge(int newAge) {
		age = newAge;
	}
	/**
	 * The updated new gpa of the student
	 * @param newGpa
	 */
	public void setGpa(int newGpa) {
		gpa = newGpa;
	}
	/**
	 * The updated new major of the student 
	 * @param newMajor
	 */
	public void setMajor(String newMajor) {
		major = newMajor;
	}
	/**
	 * The updated new department of the student
	 * @param newDepartment
	 */
	public void setDepartment(String newDepartment) {
		department = newDepartment;
	}
	/**
	 * The updated new course of the student
	 * @param newC
	 */
	public void setCourse(Course newC) {
		course = newC;
	}
	
	/**
	 * print out the information of the student 
	 */
	
	public void printInfo() {
		System.out.print("First Name: " + this.firstName + "\nLast Name: " + this.lastName + "\nAge: " + this.age + " years old." +
				"\nGPA: " + this.gpa + "\nMajor: " + this.major + "\nDepartment: " + this.department + "\nCourse Info: " + this.course + "\n" );
	}
	
	/**
	 * This method can enable us to do deep copying and also shallow copying. 
	 * This method can let us to clone/copy all the attributes.
	 */
	public Object clone() throws CloneNotSupportedException{
		
		// clone all attributes
		Student person = (Student) super.clone();
		person.course = (Course) course.clone();
		return person;
	}
	


	

}
