
public class Test {
	/*
	 * class A
	 */
	public class A implements Printable{
		
		public void a() {
			System.out.println("a method");
		}
	}
	
	
	
	/*
	 * class B
	 */
	
	public class B implements Printable{
		
		public void b() {
			System.out.println("b method");
		}
	}
	
	
	
	
	/*
	 * class call
	 */
	public class Call{
		
		public void invoke(Printable p) {
			
			if(p instanceof A) {
				A a = (A) p;
				a.a();
			}
			
			if(p instanceof B) {
				B b = (B)p;
				b.b();
			}
			
		}
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Test outer = new Test();
		
		
		Printable p = outer.new B();
		
		// Test.Call c = outer.new Call();
		Call c = outer.new Call();
		
		c.invoke(p);

	}

}
