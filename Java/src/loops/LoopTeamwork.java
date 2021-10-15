package loops;
import java.util.Scanner;
public class LoopTeamwork {

	// Loop team work by Tony Li 
	// didn't get help on this one
	
	// prints the first n powers of x
	public void nPowers(double x, int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(Math.pow(x, i));
		}
	}
	
	// prints the sum of 1 to n
	public void sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	// input continues until the user enters -1
	// once -1 is entered, print the average of entered numbers, excluding -1
	public void inputUntil() {
		Scanner inputUntil = new Scanner(System.in);
		System.out.println("enter a number");
		double input = inputUntil.nextDouble();
		double num = 0;
		double count = 0;
		while(input != -1) {
			System.out.println("enter a number");
			num += input;
			input = inputUntil.nextInt();
			count++;
		}
		System.out.println(num/count);
	}
	
	// reverses the digits of a number
	public void reverseInt(int num) {
		int reverse = 0;
		
		while (num != 0) {
			int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println(reverse);
	}
	
	
	// decodes a number into groups of two digits
	// prints out each group as a letter
	public void decoder(int num) {
		 String codes = "" + num;
		 String decodes = "";
		   
		  for (int i=0; i < codes.length(); i=i+2) {
		   int x = num % 100;
		   num = (num-x)/100;
		   decodes = (char) x + decodes;
		  }
		  
		  System.out.print(decodes);
	}
	
	
	// runs the methods
	public static void main(String[] args) {
		LoopTeamwork runner = new LoopTeamwork();
		runner.nPowers(2,3);
		runner.sum(100);
		runner.inputUntil();
		runner.reverseInt(12345);
		runner.decoder(656770);
	}	
	
	

}
