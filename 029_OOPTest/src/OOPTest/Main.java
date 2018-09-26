package OOPTest;

public class Main {

	public static void main(String[] args) {
		
		// normal hamburger
		
		Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
		double price = hamburger.itemizeHamburger();
		
		hamburger.addHamburgerAddition1("Tomato", 0.27);
		hamburger.addHamburgerAddition2("Lettuce", 0.75);
		hamburger.addHamburgerAddition3("Cheese", 1.13);

		System.out.println("Total burger price = " + hamburger.itemizeHamburger());
		
		// healthy hamburger
		
		HealthyHamburger healthyHamburger = new HealthyHamburger("Bacon", 5.67);
	
		healthyHamburger.addHamburgerAddition1("Egg", 5.43);
		
		healthyHamburger.addHealthAddition1("Lentils", 3.41);
		
		System.out.println("Total Healthy Burger price is " + healthyHamburger.itemizeHamburger());
		
		DeluxeHamburger db = new DeluxeHamburger();
		db.itemizeHamburger();
	}

}
