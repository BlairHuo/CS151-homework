
public class Dog implements Animal{
	
	public void bark(Animal a) {
		
		if(a instanceof Dog) {
			
			/*
			 * down casting:
			 * cast the Animal object " a " to be Dog object 
			 * Also here the Animal a in the bark method 
			 */
			Dog d = (Dog)a;
			System.out.println("Bark Bark_ Dog barking");
		}else {
			Dog d = (Dog)a;
			System.out.println("Bark, Bark, second method"); 
		}
		
	}

	public void eat() {
		System.out.println("Dog is eating");
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		/*
		 * Animal d = new Dog();
		 * this one is wrong and it doen't work  
		 */
		
		Dog d = new Dog();
		d.bark(d);
		Animal d2 = new Dog();
		System.out.println("I am " + d.getClass());
		System.out.println("I am " + d2.getClass());

	}

}
