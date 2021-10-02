package conditionals;

import java.util.Scanner;

public class Scanners {
	
	// scanners and harder conditionals by Tony Li
	// got help from Mr.Friedman
	
	// prints a number from the four digits given by the use
	public void fourDigits () {
		
		Scanner fourDigits = new Scanner(System.in);
		
		System.out.println("enter an integer");
		int num1 = fourDigits.nextInt();
		
		System.out.println("enter an integer");
		int num2 = fourDigits.nextInt();
		
		System.out.println("enter an integer");
		int num3 = fourDigits.nextInt();
		
		System.out.println("enter an integer");
		int num4 = fourDigits.nextInt();
		
		System.out.println(num1 + num2*10 + num3*100 + num4*1000);
	}
	
	// performs calculation if the string is a mathematical operator
	// otherwise turn integers into characters and attach them to the string
	public void numString () {
		
		Scanner numString = new Scanner(System.in);
		
		System.out.println("enter a string");
		String x = numString.nextLine();
		
		System.out.println("enter an integer");
		int num1 = numString.nextInt();
		
		System.out.println("enter an integer");
		int num2 = numString.nextInt();
		
		
		if (x.equals("+")) {
			System.out.println(num1+num2);
		}
		
		else if (x.equals("-")) {
			System.out.println(num1-num2);
		}
		
		else if (x.equals("*")) {
			System.out.println(num1*num2);
		}
		
		else if (x.equals("/")) {
			System.out.println((double) num1/num2);
		}
		
		else if (x.equals("%")) {
			System.out.println(num1%num2);
		}
		else {
			System.out.println(x + (char)(num1) + (char)(num2));
		}
	}
	
	// checks if the score entered is possible with the given touch downs and field goals
	// don't have to use all touch downs and field goals
	public void footballPoints () {
		
		Scanner footballPoints = new Scanner(System.in);
		
		System.out.println("Enter the number of touchdowns");
		int touchdowns = footballPoints.nextInt();
		
		System.out.println("Enter the number of field goals");
		int fieldGoals = footballPoints.nextInt();
		
		System.out.println("Enter the score");
		int totalScore = footballPoints.nextInt();
		
		int possibleTouchdowns=totalScore/7;
		
		int touchdownsDifference=touchdowns-possibleTouchdowns;
		
		if (touchdownsDifference<0) {
			System.out.println("no");
		}
		
		totalScore=totalScore-(possibleTouchdowns*7);
		
		int possibleFieldGoals=totalScore/3;
		
		int differenceInFieldGoals=fieldGoals-possibleFieldGoals;
		
		if (differenceInFieldGoals<0 || totalScore%(possibleFieldGoals*3)!=0) {
			System.out.println("no");
		}
		
		else {
		System.out.println("yes");
		}

	}
	
	// finds the greatest digit of a number between [0,999]
	public void greatestDigit () {
		
		Scanner greatestDigit = new Scanner(System.in);
		
		System.out.println("enter a number");
		int num = greatestDigit.nextInt();
		
		int a = num/100;
		int b = (num%100)/10;
		int c = num%10;
		
		if (a>b && a>c) {
			System.out.println(a);
		}
		
		else if (b>a && b>c) {
			System.out.println(b);
		}
		
		else {
			System.out.println(c);
		}
		
	}
	
	// runs the methods
	public static void main(String[] args) {
		Scanners runner = new Scanners();
		runner.fourDigits();
		runner.numString();
		runner.footballPoints();
		runner.greatestDigit();
	}

	
}