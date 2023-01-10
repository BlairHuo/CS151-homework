
/**
 * this is the testing class for the animal class 
 * we testing four kinds of animals 
 * and also we are testing how each one of the animal 
 * normally sleep, eat, sound, scratch, greet human, etc. 
 * @author shengshenghuo
 *
 */
public class AnimalTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog ("Domestic", "Dog",6,"female","home",80);
		Cat cat = new Cat("Domestic", "Cat",3,"female","home",60);
		Raccon racoon = new Raccon("Wild","Racoon",7,"male","forest",40);   
	    Whale whale=new Whale("Aquatic","Whale",8,"male","ocean",70);
	    
	   
	    
       System.out.println("---------------------------------------------------------" + "\n");
       System.out.println(dog.toString());
       dog.move();
       dog.sound();
       dog.eat();
       dog.sleep();
       dog.bark();
       dog.walk();
       dog.greetHuman();
       
       System.out.println("---------------------------------------------------------"+ "\n");
       System.out.println(cat.toString());
       cat.move();
       cat.sound();
       cat.eat();
       cat.sleep();
       cat.walk();
       cat.greetHuman();
       cat.scratch();
       
       System.out.println("---------------------------------------------------------"+ "\n");
       System.out.println(racoon.toString());
       racoon.move();
       racoon.sound();
       racoon.eat();
       racoon.sleep();
       racoon.scratch();
       
       System.out.println("---------------------------------------------------------"+ "\n");
       System.out.println(whale.toString());
       whale.move();
       whale.sound();
       whale.eat();
       whale.sleep();
       whale.swim();
       
        
	    
	    
	  
	    
	    
	    
	    

	}

}
