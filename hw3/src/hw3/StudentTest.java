package hw3;
/**
 * This is the test that testing student class and course class together
 * see if they can do shallow copy and deep copy
 * @author shengshenghuo
 *
 */
public class StudentTest {

	public static void main(String[] args) {
		
		//String Name, String Description, String Department,String startTime, String weekday
		Course course = new Course ("CS151", "Object Oriented Design and Programming","CS","6:00pm","Tue");
		
		//String firstName, String lastName, int age, float gpa, String major,String department, Course course
		Student person = new Student("John","Smith",20,(float)3.6,"Compurwe Science","School of Computer Science department",course);
		
		Student person2 = null;
		
		/** Part 1 
		 * shallow copying
		*/
		
	   // person2 = person;
	    
		
		// shallow copying too 
		try {
			person2 = (Student) person.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		/**
		 * print out to see if they are the same or not 
		 */
		//person.printInfo();
		//person2.printInfo();
		
		
		
		
		/**
		 * Part2
		 * change the attributes of the person 2 
		 */
		person2.setfirstName("Caleb");
		person2.setlasttName("Siow");
		
		Course course1 = new Course ("CS46B", "Programming","CS","8:00am","Wednesday");
		person2.setCourse(course1);
		
		
		/**
		 * print it out to see if it is deep copying 
		 */
		person.printInfo();
		person2.printInfo();
	

	}

}
