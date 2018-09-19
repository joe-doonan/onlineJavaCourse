package CharAndBoolean;

public class CharAndBoolean {
	public static void main(String[] args) {
		
		//width of 16 (2 bytes)
		char myChar = '\u00A9'; //works using only single quotes
		System.out.println(myChar);
		
		boolean myBoolean = false;
		boolean isMale = true;
		
		char registeredSymbol = '\u00AE';
		System.out.println("Registered symbol = " + registeredSymbol);
	}

}
