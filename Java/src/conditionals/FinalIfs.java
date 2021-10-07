package conditionals;

import java.util.Scanner;

public class FinalIfs {
	
	// Final Ifs by Tony Li
	// didn't get help on this one
	
	// calculates the base-ten value of a binary code
	public void baseTen(int num1, int num2, int num3, int num4, int num5) {
		System.out.println(num1*Math.pow(2, 4) + num2*Math.pow(2, 3) + num3*Math.pow(2, 2) + num4*Math.pow(2, 1) + num5*Math.pow(2, 0));
	}
	
	// switches the value of two strings
	public void switchStrings() {
		Scanner switchStrings = new Scanner(System.in);
		System.out.println("enter a string");
		String str1 = switchStrings.nextLine();
		System.out.println("enter a string");
		String str2 = switchStrings.nextLine();
		
		String str3 = str1;
		str1 = str2;
		str2 = str3;
	
		System.out.println(str1);
		System.out.println(str2);
	}
	
	// calculates the remainder of the first two digits divided by each of the last three digits
	public void modDigits(int num) {
		int a = num%10;
		int b = num%100;
		int c = num%1000;
		int d = num%10000;
		
		int answer1 = (num - c)/1000 % a;
		int answer2 = (num - c)/1000 % (b/10);
		int answer3 = (num - c)/1000 % (c/100);
		
		System.out.println(answer1);
		System.out.println(answer2);
		System.out.println(answer3);
		

	}
	
	// runs the methods
	public static void main(String[] args) {
		FinalIfs runner = new FinalIfs();
		runner.baseTen(1,0,1,1,1);
		runner.switchStrings();
		runner.modDigits(34924);
	
	}

}
