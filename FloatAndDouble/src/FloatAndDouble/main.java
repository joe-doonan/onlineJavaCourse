package FloatAndDouble;

public class main {
	
	public static void main(String[] args) {
		// width of int = 32 (4 bytes).
		int myIntValue = 5 / 2; //only an integer so can't display a decimal point in console
		
		//width of float = 32 (4 bytes).
		float myFloatValue = 5f / 3f; //could use (float) instead of "f" at the end of number to tell it, it is a float
		
		//width of double = 64 (8 bytes).
		double myDoubleValue = 5d / 3d; //could use (double) instead of "d" at the end of number to tell it, it is a double
		
		System.out.println("myIntValue = " + myIntValue);
		System.out.println("myFloatValue = " + myFloatValue);
		System.out.println("myDoubleValue = " + myDoubleValue);
		
		double numPounds = 200d;
		double convertedKilos = numPounds * 0.45359237d;
		System.out.println("Kilograms = " + convertedKilos);
		//90.7185
	}
}
