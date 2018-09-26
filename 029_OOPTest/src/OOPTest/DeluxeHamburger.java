package OOPTest;

public class DeluxeHamburger  extends Hamburger{
		
	public DeluxeHamburger() {
		super("Deluxe", "Sausage & Bacon", 14.54, "White");
		super.addHamburgerAddition1("Chips", 2.75);
		super.addHamburgerAddition2("Drink", 1.81);
	}
	
	
}
