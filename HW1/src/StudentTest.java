/**
 * 
 * @author Shengsheng Huo
 * @since 2022-09-08
 * 
 * Student Program
 * <p>
 * This is Student program, the program display basic information
 * of a student. 
 * <p> 
 * Compile as {@code java Test.java}
 * <p>
 * Run as {@code java Test}
 * <b> My previously defined Student class:</b>
 * <pre>{@code
 
public class Student {
	
	private String FirstName;
	private String LastName;
	private int Age;
	private float GPA;
	private String Major;
	private String Department; 
	
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
	
	
	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public float getGPA() {
		return GPA;
	}


	public void setGPA(float gPA) {
		GPA = gPA;
	}


	public String getDepartment() {
		return Department;
	}


	public void setDepartment(String department) {
		Department = department;
	}


	public String getMajor() {
		return Major;
	}


	public void setMajor(String major) {
		Major = major;
	}


	class Course
	{
		public void printSchedule()
		{
			System.out.print("CS151 Tue/Thur 6-7:15\n"
					+ "Eng101 Mon/Wed 10-11:15\n"
					+ "Hist100 Tue/Thur 1:30-2:45\n");
		}
	}
}<pre>
*
*/
public class StudentTest {

	public static void main(String[] args) {
		Student outer = new Student("John", "Smith", 20, (float) 3.6, "Computer_Science", "School of Computer Science" );
		
		//Outer_Demo outer = new Outer_Demo();
		//Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
		
		Student.Course inner = outer.new Course();
		
		inner.printSchedule();
		System.out.println(outer.getFirstName()+" "+ outer.getLastName()+" is "+ outer.getAge()+" year old.");
		System.out.println(outer.getFirstName()+" "+ outer.getLastName()+" is "+ outer.getMajor()+" Major.");
		
		
		
		

	}

}
