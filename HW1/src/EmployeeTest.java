
public class EmployeeTest {

	public static void main(String[] args) {
		/**
		 * Example 1
		 * Joe Smith, a contractor, pay is $60/hr, should get paid or working 30 hours.
		 */

		Employee ppl = new Employee( (int)9087, "Contractor", 60,"Joe", "Smith", 30, "1121 Pine Street,San Jose,CA", "789-908-0098", "Female", (float)80.99);
        ppl.introduce();
        System.out.println("Employee earnings: $" + ppl.calculatePay("contractor", 60,30));
        System.out.println();
        
        /**
		 * Example 2
		 * Lisa Gray, a full time employee, pay is $110,000/yr, should get paid or working 2 weeks.
		 */
        
        Employee ppl1 = new Employee( (int)3344, "Full-Time", 11000,"Lisa", "Gary", 35, "2232 Love Street,San Jose,CA", "888-998-1000", "Male", (float)65);
        ppl1.introduce();
        System.out.println("Employee earnings: $" + ppl1.calculatePay("FullTime", 11000,2));
        System.out.println();
        
        /**
		 * Example 3 George Wallace,a part time employee, pay is $20/hr, should get paid or working 25 hours.
		 */
        
        Employee ppl2 = new Employee( (int)8899, "Contractor", 106,"George", "Wallace", 28, "2232 Wall Street,San Jose,CA", "333-777-2222", "Male", (float)100);
        ppl2.introduce();
        System.out.println("Employee earnings: $" + ppl2.calculatePay("PartTime", 25,20));
        System.out.println();
        
        /**
         * Example 4 
         * Timothy Briggs, a full time employee, pay is $80,000/yr, should get paid or working 4 weeks.
         */
        Employee ppl3 = new Employee( (int)1122, "Full-Time", 80000,"Timothy", "Briggs", 38, "2200 Middle Street,San Jose,CA", "333-668-1111", "Male", (float)109);
        ppl3.introduce();
        System.out.println("Employee earnings: $" + ppl3.calculatePay("FullTime", 80000,4));
        System.out.println();
        
        /**
         * Example 5 
         * Amy Student, a contractor employee, pay is $45/hr, should get paid or working 45 hours. 
         */
        
        Employee ppl4 = new Employee( (int)6640, "Contractor", 60,"Amy", "Student", 30, "1221 End Street,San Jose,CA", "789-908-0098", "Female", (float)79);
        ppl4.introduce();
        System.out.println("Employee earnings: $" + ppl4.calculatePay("contractor", 45,45));
        System.out.println();
       
	}

}
