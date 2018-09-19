package statementsWhitespacingAndIdentation;

public class Main {
	
	public static void main(String[] args) {
		
		int myVariable = 50;
		myVariable ++;
		myVariable --;
		System.out.println("This is a test" + 
				" another" +
				" still more."); // java allows it on separate lines as long as there are appropriate "+" signs etc
		
		int anotherVariable = 50; myVariable--; System.out.println("This is another one");// Java accepts this as long as the separator ";" is there
		
		
	}
}
