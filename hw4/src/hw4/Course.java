package hw4;
/**
 * This class contain the following fields: course name, course description, department, time the course starts, 
 * weekday the course is held on (for simplicity, let us assume the course only meets once a week). 
 * 
 * This class is all about the basic information of a class
 * @author shengshenghuo
 *
 */
public class Course {
	/**
	 * instance variables 
	 */
	private String courseName;
	private String description;
	private String department;
	private String time;
	private String weekday;
	
	/**
	 * empty constructor
	 */
	public Course() {
		
	}
	
	/**
	 * non empty constructor
	 * 
	 * @param courseName
	 * @param description
	 * @param department
	 * @param time
	 * @param weekday
	 */
	
	public Course(String courseName, String description, String department, String time, String weekday) {
		
		this.courseName = courseName;
		this.description = description;
		this.department = department;
		this.time = time;
		this.weekday = weekday;
		
	}
	
	/**
	 * The name of the course
	 * @return courseName
	 */
	
	public String getCourseName() {
		return courseName;
	}
	/**
	 * The description of the class
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * The department of the class belong to 
	 * @return department
	 */
	
	public String getDepartment() {
		return department;
	}
	/**
	 * The time of the class starts
	 * @return time
	 */
	
	public String getTime() {
		return time;
	}
	/**
	 * The weekday of the class start
	 * @return weekday
	 */
	public String getWeekday() {
		return weekday;
	}
	
	
	/**
	 * The new updated name of the course
	 * @param newCourseName
	 */
	public void setCourseName(String newCourseName) {
		courseName = newCourseName;
	}
	/**
	 * The new updated description of the course
	 * @param newDescription
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}
	/**
	 * The new updated department of the course belongs to 
	 * @param newDepartment
	 */
	public void setDepartment(String newDepartment) {
		department = newDepartment;
	}
	/**
	 * The new updated time of the class start
	 * @param newTime
	 */
	public void setTime(String newTime) {
		time = newTime;
	}
	/**
	 * The new updated weekday of the course
	 * @param newWeekday
	 */
	public void setWeekday(String newWeekday) {
		weekday = newWeekday;
		
	}
	
	@Override
	/**
	 * customized information of the class into String type
	 */
	public String toString() {
		return "\n Couse Name: "+this.courseName + "\n Description: " + this.description + "\n Department: " + this.department + "\n Time: " + this.time + "\n Weekday: " + this.weekday + "\n";
	}
	
	
	
	

}
