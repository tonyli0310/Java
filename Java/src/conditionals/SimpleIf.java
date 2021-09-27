package conditionals;

public class SimpleIf {
	
	// Simple If Students by Tony Li
	// Didn't get any help on this one
	
	// determines if an integer is positive or negative
	public void positiveInt(int x) {
		if (x > 0) {
			System.out.println("yes");
			
		}
		
		else {
			System.out.println("no");
		}
	}
	
	// determines if an integer is even or odd
	public void evenOdd(int x) {
		if (x%2 == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}
	
	// determines if a character is upper case, lower case, or neither
	public void capitalChar(char letter) {
		if (letter >= 65 && letter < 97) {
			System.out.println("upper case");
		}
		else if (letter >= 97) {
			System.out.println("lower case");
		}
		else {
			System.out.println("neither");
		}
	}
	
	// determines if an integer is a multiple of 10
	public void multipleOfTen(int num) {
		if (num%10 == 0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	
	// determines which of the three numbers is the biggest
	public void biggestNum(double num1, double num2, double num3) {
		if (num1 > num2 && num1 > num3) {
			System.out.println("num1");
		}
		else if (num2 > 1 && num2 > num3) {
			System.out.println("num2");
		}
		else if (num3 > num2 && num3 > num1) {
			System.out.println("num3");
		}
	}
	
	// determines if a double is a whole number or not
	public void doubleWhole(double num) {
		if ((int)num/1 == num) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	
	// runs the methods
	public static void main(String args[]) {
		
		SimpleIf tester = new SimpleIf();
		
		tester.positiveInt(-9);
		tester.evenOdd(19);
		tester.capitalChar('9');
		tester.multipleOfTen(477);
		tester.biggestNum(10,9879,34507);
		tester.doubleWhole(47569.8);
		
	}
}
		