package loops;

import java.util.Scanner;

public class MoreNestedLoops {
	
	public void loopingBox(int x) {
		for (int i = 1; i < x+1; i++) {
			for (int j = 1; j < x+1; j++) {
				System.out.print(j);
			}
		System.out.println();
		}
	}
	
	
	public void triangleX () {
		Scanner triangleX = new Scanner(System.in);
		
		System.out.println("enter a number");
		int n = triangleX.nextInt();
		
		for (int i = 0; i < n+1; i++) {
			for (int j= 0; j < i; j++) {
				System.out.print('X');
			}
		System.out.println();
		}
	}
	
	public void whatPower(int x, int y) {
		
		for (int i = x; i < y; i++) {
			if (Math.pow(x, i) == y) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		MoreNestedLoops runner = new MoreNestedLoops();
		runner.loopingBox(5);
		runner.triangleX();
		runner.whatPower(2,8);
	}	
}