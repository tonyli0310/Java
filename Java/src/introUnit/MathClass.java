package introUnit;

public class MathClass {
	
	// Math Class by Tony Li
	// Got help from Mr.Friedman
	
	// sets an instance variable
	private int one;
	
	// an example method to use as a guideline
	// halves a number
	public void halve(double x) {
		System.out.println(x/2);
	}
	
	// I'll give you the first method's outline to fill in. For the rest, you're in charge of 
	// declaring the entire method.
	//squares a number
	public void square(int x) {
		
		// your code here
		System.out.println(Math.pow(x,2));
	}
	
	// create your own methods here
	// calculates the average of five number
	public void averageFive(double num1, double num2, double num3, double num4, double num5) {
		System.out.println((num1+num2+num3+num4+num5)/5);
	}
	
	// raise a number to the fourth power
	public void raiseToTheFourth (int x) {
		System.out.println(Math.pow(x,4));
	}
	
	// sets an instance variable
	public void setKey(int x) {
		one = x;
	}
	
	// multiplies a number by the instance variable
	public void multiplyByKey(int x) {
		System.out.println(one*x);
	}
	
	// cubes the instance variable
	public void keyCubed() {
		System.out.println(Math.pow(one, 3));
	}
	
	// makes a number an integer
	public void makeInteger(double x) {
		System.out.println((int)(x/1));
	}
	
	// rounds a number to the nearest whole
	public void roundToNearestWhole(double x) {
		System.out.println((int)(x+0.5)/1);
	}
	
	// runs the methods
	public static void main(String args[]) {
		
		MathClass tester = new MathClass();
		
		// example method
		// output: 4
		tester.halve(8);
		
		// you are in charge of making the rest of these work
		
		// output: 49
		tester.square(7);
		
		// output: 7
		tester.averageFive(7,10,5,7,6);
		
		// output: 81
		tester.raiseToTheFourth(3);
		
		// output: nothing, just save the number 4 as an instance variable
		tester.setKey(4);
		
		// output: 28
		tester.multiplyByKey(7);
		
		// output: 64
		tester.keyCubed();
		
		// output: 3
		tester.makeInteger(3.756);
		
		// output: 8
		tester.roundToNearestWhole(7.8);
	}

}
