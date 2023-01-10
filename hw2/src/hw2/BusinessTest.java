package hw2;

public class BusinessTest {

	public static void main(String[] args) {
		/**
		 * all the streets objects list here for  later use 
		 */
		
		Address ad1 = new Address (111, "oak street", "San Jose", "95123", "California");
		Address ad2 = new Address (342, "pink ocean", "San Jose", "95136", "California");
		Address ad3 = new Address (333, "Blair Street", "moraga", "94556", "California");
		Address ad4 = new Address (123, "water street", "Santa Cruz", "92798", "California");
		Address ad5 = new Address (567, "center street", "San Jose", "96722", "California");
		Address ad6 = new Address (789, "pine street", "morgan hill", "94555", "California");
		Address ad7 = new Address (484, "sweater street", "san francisco", "93444", "California");
		Address ad8 = new Address (666, "wooden street", "San Jose", "92791", "California");
		Address ad9 = new Address (221, "love street", "San Jose", "96124", "California");
		Address ad10 = new Address (481, "Jack Street", "San Fransico", "96156", "California");
		
		
		
		
		Executive exe1 = new Executive("Sheng Sheng ", "Huo", ad1,30, 012345, 20.0, 22, "100-888-9999");
		Executive exe2 = new Executive("Sharon", "Le", ad2, 35,123999, 19.0, 25.0, "999-999-9999");
		exe1.introduce(false);
		exe2.introduce(true);
		exe1.computePay();
		exe2.computePay();
		
		FullTimeSalaried fts1 = new FullTimeSalaried("Rafa padilla", "perez", ad3, 99999, 29.0, "666-666-6666");
		FullTimeSalaried fts2 = new FullTimeSalaried("Caleb", "Siow", ad4, 333333, 99.9, "111-111-1111");
		fts1.introduce(true);
		fts2.introduce(false);
		fts1.computePay(8);//weeks
		fts2.computePay(9);
		
		
		FullTimeHourly fth1 =  new FullTimeHourly("Johnson", "Bao", ad5, 767676, 50.0, 70.0, "000-000-0000");
		FullTimeHourly fth2 = new FullTimeHourly("Simone", "lofaso", ad6, 989898, 88.0, 90.0, "222-222-2222");
		fth1.introduce(false);
		fth2.introduce(true);
		fth1.computePay(97); //hours
		fth2.computePay(90);
		
		PartTimeHourly pth1 = new PartTimeHourly("Jack", "chak", ad7,60, 1515281, 45.0, "213-213-4123");
		PartTimeHourly pth2 = new PartTimeHourly("Nathan", "Duong", ad8, 57,213201, 99.0, "762-131-2451" );
		pth1.introduce(true);
		pth1.introduce(false);
		pth1.computePay(70);
		pth1.computePay(25);
		
		Contractor c1 = new Contractor("Micaheal", "Gay", ad8, 12380121, "213-909-0000",85);
		Contractor c2 = new Contractor("Chinamay", "G", ad10, 39201371, "232-532-7652",100);
		c1.introduce(true);
		c2.introduce(false);
		c1.computePay(34);
		c2.computePay(28);
		
		
		//String firstName, String lastName, int age, String ssn, Address address, int customerID, String payPreference
		
		Customer cust1 = new Customer("Joe", "Mama",34,"999-111-2222", ad1, 231981,  "Cash");
		Customer cust2 = new Customer("Joe", "Papa", 50,"111-000-9999",ad9, 231000,  "Card");
		cust1.introduce(true);
		cust2.introduce(false);
		cust1.makePayment();
		cust2.makePayment();
		
		
        

	}

}
