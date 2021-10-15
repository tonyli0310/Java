package loops;

import java.util.Scanner;

public class MoreLoops {
	
	// More Loops by Tony Li
	// Didn't get help on this one
	
	// allows the user to guess a number repeatedly until they are correct
	// indefinite loop / other
	public void guessNumber(int num) {
		
		Scanner guessNumber = new Scanner(System.in);
		System.out.println("enter a number");
		int x = guessNumber.nextInt();
		
		while (x != num) {
			System.out.println("enter a number");
			x = guessNumber.nextInt();
			
			if (x == num) {
				System.out.println("you are correct");
				break;
			}
		}
	}
	
	// prints all numbers from -n to n, n being a integer
	// definite finite loop / linear
	public void negToPos() {
		
		Scanner negToPos = new Scanner(System.in);
		System.out.println("enter a number");
		int x = negToPos.nextInt();
		
		for (int i = -x; i <= x; i++) {
			System.out.println(i);
		}
		
	}
	
	// prints out the factorial of a number
	// definite finite loop / linear
	public void factorial() {
		
		Scanner factorial = new Scanner(System.in);
		System.out.println("enter a number");
		int x = factorial.nextInt();
		
		int num = 1;
		for (int i = 1; i <= x; i++) {
			num *= i;
		}
		System.out.println(num);
	}
	
	// asks the user if they want to keep playing the game / keep asking if they answer "yes
	// stop the game if they answer "no"
	// indefinite loop / other
	public void stopGame() {
		
		Scanner stopGame = new Scanner(System.in);
		System.out.println("Do you want to keep playing?");
		String answer = stopGame.nextLine();
		
		while (answer.equals("yes")) {
			System.out.println("Do you want to keep playing?");
			answer = stopGame.nextLine();
			if (answer.equals("no")) {
				System.out.println("game over");
				break;
			}
		}
	}
	
	// prints out the greatest common divisor of two integers
	// definite finite loop / linear
	public void commonDivisor() {
		
		Scanner commonDivisor = new Scanner(System.in);
		System.out.println("enter a number");
		int num1 = commonDivisor.nextInt();
		System.out.println("enter another number");
		int num2 = commonDivisor.nextInt();
		
		int gcd = 1;
		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		
		}
		
		System.out.println(gcd);
	}
	
	// prints out the least common multiple of two integers
	// definite finite loop / linear
	public void commonMultiple() {
		
		Scanner commonMultiple = new Scanner(System.in);
		System.out.println("enter a number");
		int num1 = commonMultiple.nextInt();
		System.out.println("enter another number");
		int num2 = commonMultiple.nextInt();
		
		for (int i = Math.max(num1, num2); i <= num1*num2; i+= Math.max(num1,  num2)) {
			if (i % num1 == 0) {
				System.out.println(i);
				break;
			}
		}
	}
		
		
	// runs the methods
	public static void main(String[] args) {
		MoreLoops runner = new MoreLoops();
		runner.guessNumber(15);
		runner.negToPos();
		runner.factorial();
		runner.stopGame();
		runner.commonDivisor();
		runner.commonMultiple();
	}
	
}
