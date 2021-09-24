package introUnit;

public class SA4 {
		
	// SA4 by Tony Li
	// Didn't use help on this one
	
	// create your methods here
	// finds the distance between 2 coordinates
	public void distance(double num1, double num2, double num3, double num4) {
		System.out.println(Math.sqrt(Math.pow(num3-num1, 2)+ Math.pow(num4-num2, 2)));
		
	}
	
	// finds the solutions of a quadratic equation
	public void quadratic(int a, int b, int c) {
		System.out.println((-1*b + Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a);
		System.out.println((-1*b - Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a);
		
	}	
	
	// finds the average of two characters
	public void charAverage(char letter1, char letter2) {
		System.out.println((char)((letter1 + letter2)/2));
	}
	
	// runs the methods
	public static void main(String[] args) {
			
		SA4 tester = new SA4();
			
		// prints out the distance between two points
		// output should be 6.83
		tester.distance(1, -2.5, 3.1, 4);
			
		// prints out a solution to y = ax^2 + bx + c, where the 
		// three parameters are a, b, and c. Use the quadratic equation
		// output should be 2 or -2 (challenge: give both solutions)
		tester.quadratic(1, 0, -4);
			
		// prints out the 'average' of two characters
		// output should be 'W'
		tester.charAverage('m', 'A');
		
	}

}
	


