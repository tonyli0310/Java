package loops;

import java.util.Scanner;

public class StartingLoops {
	
	// Starting Loops by Tony Li
	// Did not get help on this one
	
	// prints all numbers between two integers
	// definite finite loop
	public void betweenInts(int num1, int num2) {
		
		while (num1 <= num2) {
			System.out.println(num1);
			num1++;
		}
		
		while (num2 <= num1) {
			System.out.println(num2);
			num2++;
		}
		
	}
	
	// prints out the first 6 terms of an exponential equation
	// definite finite loop
	public void exponentialSequence(double base, double coefficient) {
		
		int x = 0;
		while (x <= 5) {
			System.out.println(coefficient*Math.pow(base, x));
			x++;
		}
	}
	
	// prints out the square root of an integer if it is a perfect square
	// definite finite loop
	public void squareRoot(int num) {
		int x = 0, count = 0;
		while (x < num) {
			x++;
			if (x*x == num) {
				System.out.println(x);
				break;
			}
			else {
				count ++;
				continue;
			}
		}
		if (count == num) {
			System.out.println("does not have a root");
		}
	}
	
	// let user input the number of inputs they choose, and finds the largest input
	// definite finite loop
	public void largestInput() {
		Scanner largestInput = new Scanner(System.in);
		System.out.println("enter number of inputs");
		int n = largestInput.nextInt();
		
		int x = 0, max = 0;
		while (x < n) {
			x++;
			System.out.println("enter a number");
			int num = largestInput.nextInt();
			if (num > max) {
				max = num;
			}
		}
		System.out.println(max);
	}
	
	// runs the methods
	public static void main(String[] args) {
		StartingLoops runner = new StartingLoops();
		runner.betweenInts(7,3);
		runner.exponentialSequence(2,3);
		runner.squareRoot(25);
		runner.largestInput();
	}
}
