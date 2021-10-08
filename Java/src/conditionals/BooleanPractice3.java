package conditionals;

public class BooleanPractice3 {

	// Boolean Practice 3 Problems by Tony Li
	// Didn't get help on this one
	
	// prints out the smalles integer out of the three
	public void smallestNum(int num1, int num2, int num3) {
		if (num1 < num2 && num1 < num3) {
			System.out.println(num1);
		}
		else if (num2 < num1 && num2 < num3) {
			System.out.println(num2);
		}
		else if (num3 < num2 && num3 < num1) {
			System.out.println(num3);
		}
	}
	
	// ignoring case, prints out true if the two characters are within two apart
	// if not, prints out false
	public void charDifference(char char1, char char2) {
		if ((char1 - char2 <= 2 && char1 - char2 >= 0)||(char2 - char1 <= 2 && char2 - char1 >= 0)) {
			System.out.println("true");
		}
		else if ((char1-32-char2 <= 2 && char1-32-char2 >= 0)|| (char2-32-char1 <= 2 && char2-32-char1 >= 0)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	
	// runs the method
	public static void main(String args[]) {
		
		BooleanPractice3 tester = new BooleanPractice3();
		
		tester.smallestNum(1,-1,3);
		tester.charDifference('H','e');
		
	}
}
