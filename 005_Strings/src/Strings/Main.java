package Strings;


public class Main {
	
	public static void main(String[] args) {
		
		String myString = "This is a string";
		System.out.println(myString);
		
		myString = myString + ", and this is more.";
		System.out.println(myString);
		
		String numberString = "250.55";
		numberString = numberString + "49.95"; //hasn't done any actual calculations due to it adding two strings rather than two integers etc
		System.out.println("The result is " + numberString);
		
		String lastString = "10";
		int myInt = 50;
		lastString = lastString + myInt;
		System.out.println("LastString is equal to " + lastString);//lastString treated as text my computer even though it looks like "1050"
		
		double doubleNumber = 120.47;
		lastString = lastString + doubleNumber;
		System.out.println("LastString value " + lastString);
		
	}
}
