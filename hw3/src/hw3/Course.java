package hw3;

/**
 * This program is taking information of students' classes
 * Also this class contains setters and getter of its attributes
 * 
 * @author shengshenghuo
 *
 */
public class Course implements Cloneable {
	/**
	 * class Course is cloneable now too 
	 */
	
	private String Name;
	private String Description;
	private String Department;
	private String startTime;
	private String weekday;
	
	public Course() {
		
	}
	
	
	/**
	 * This is a first constructor of class Course
	 * @param Name
	 * @param Description
	 * @param Department
	 * @param startTime
	 * @param weekday
	 */
	public Course(String Name, String Description, String Department,String startTime, String weekday) {
		this.Name = Name;
		this.Description= Description;
		this.Department = Department;
		this.startTime = startTime;
		this.weekday = weekday;
		
	}
	/**
	 * This is the second constructor of the course
	 * for the shallow copy
	 */
	public Course(Course c) {
		this.Name = c.Name;
		this.Description = c.Description;
		this.Department = c.Department;
		this.startTime = c.startTime;
		this.weekday = c.weekday;
	}
	
	/**
	 * The name of the course 
	 * @return Name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * The description of the course
	 * @return Description
	 */
	public String getDescription() {
		return Description;
	}
	/**
	 * The department of the course
	 * @return Department
	 */
	
	public String getDepartment() {
		return Department;
	}
	
	/**
	 * The start time of the course
	 * @return startTme 
	 */
	public String getTime() {
		return startTime;
	}
	/**
	 * The weekday the course is held on 
	 * @return weekday
	 */
	public String getWeekday() {
		return weekday;
	}
	/**
	 * The update new course name of this course
	 * @param newName
	 */
	public void setName(String newName) {
		Name = newName;
	}
	/**
	 * The updated new description of the course
	 * @param newDescription
	 */
	public void setDescription(String newDescription) {
		Description = newDescription;
	}
	/**
	 * The updated new department of the course
	 * @param newDepartment
	 */
	public void setDepartment(String newDepartment) {
		Department = newDepartment;
	}
	
	/**
	 * The updated new start time of the course
	 * @param newTime
	 */
	public void setTime(String newTime) {
		startTime = newTime;
	}
	/**
	 * The updated new weekday of the course being held on
	 * @param newWeekday
	 */
	public void setWeekday(String newWeekday) {
		weekday = newWeekday;
	}
	
	
	
	
	/**
	 * using clone() method for SHALLOW Copying 
	 */
	protected Object clone() throws CloneNotSupportedException{
		// use default implementation of clone() in Object superclass
		return super.clone();
	}
	
	

	
	/**
	 * The customized schedule print out 
	 */
	
	
	// rewrite it in the form she requires 
	
	@Override
	public String toString() {
		return  this.Name + ", " + this.Description + 
				"," + this.startTime + ", " + this.weekday +"\n";		
	}
	
	
	

}