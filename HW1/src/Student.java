/**
 * 
 * @author Shengsheng Huo
 * @since 2022-09-08
 * 
 * Student Program
 * <p>
 * This is Student program, the program display basic information
 * of a student, including his first name, last name, Age, GPA, major and department. 
 * <p> 
 * Compile as {@code java Test.java}
 * <p>
 * Run as {@code java Test}
 * 
 */

public class Student {
	
	private String FirstName;
	private String LastName;
	private int Age;
	private float GPA;
	private String Major;
	private String Department; 
	/**
	 * This is constructor 
	 * @param theFirstName
	 * @param theLastName
	 * @param theAge
	 * @param theGPA
	 * @param theMajor
	 * @param theDepartment
	 * @author Shengsheng Huo
	 * 
	 */
	
	public Student(String theFirstName, String theLastName,int theAge,
			float theGPA, String theMajor, String theDepartment) 
	{
		FirstName = theFirstName;
		LastName = theLastName;
		Age = theAge;
		GPA = theGPA;
		Major = theMajor;
		Department = theDepartment;
	}
	/**
	 * 
	 * @return the the fist name of the student 
	 */
	
	public String getFirstName() {
		return FirstName;
	}
	/**
	 * update the first name of the student 
	 * @param firstName
	 */


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	/**
	 * 
	 * @return last name of the student
	 */


	public String getLastName() {
		return LastName;
	}
	/**
	 * update the last name of the student 
	 * 
	 * @param new last name of the student 
	 */


	public void setLastName(String lastName) {
		LastName = lastName;
	}
	/**
	 * The age of the student 
	 * @return age of the student 
	 */


	public int getAge() {
		return Age;
	}
	/**
	 * update the age of the student 
	 * @param newAge is the updated age for the student
	 */


	public void setAge(int newAge) {
		Age = newAge;
	}
	/**
	 * The GPA of the student 
	 * @return GPA the academic performace of the student
	 */

	public float getGPA() {
		return GPA;
	}
	
	/**
	 * Update the GPA of the student
	 * @param gPA, new GPA of the student 
	 */
	public void setGPA(float gPA) {
		GPA = gPA;
	}
	/**
	 * The major department of the student
	 * @return Department
	 */


	public String getDepartment() {
		return Department;
	}
	/**
	 * update the major department of the student 
	 * @param department
	 */


	public void setDepartment(String department) {
		Department = department;
	}
	
	/**
	 * The major of the student 
	 * @return Major
	 */
	public String getMajor() {
		return Major;
	}
	
	
	/**
	 * update the major of the student 
	 * @param major
	 */

	public void setMajor(String major) {
		Major = major;
	}
	
	
	/**
	 * 
	 * @author Shengsheng Huo
	 * <p>
	 * This is the inner class of the student class.
	 * And printing the class schedule of the student. 
	 *
	 */
	class Course
	{
		/**
		 * This method is to print student's schedule.
		 */
		public void printSchedule()
		{
			System.out.print("CS151 Tue/Thur 6-7:15\n"
					+ "Eng101 Mon/Wed 10-11:15\n"
					+ "Hist100 Tue/Thur 1:30-2:45\n");
		}
	}

	

}
