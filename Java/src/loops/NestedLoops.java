package loops;

public class NestedLoops {
	
	// Nested Loops by Tony Li 
	// Didn't get help on this one
	
	// prints the alphabet
	// constant
	public void aToZ() {
		
		for (int i = 65; i < 91; i++) {
			System.out.print((char)i);
		}
		System.out.println();
	}
	
	// prints multiplcation table from 1-12
	// constant
	public void multiplicationTable() {
		for (int i=1; i <= 10; i++) {
			for (int j=1; j<=12; j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
	}
	
	// prints prime numbers before x
	// quadratics
	public void primeNums(int x) {
		for(int i=2; i < x; i++){

            boolean primeNum = true;

            //check to see if the number is prime
            for(int j=2; j < i ; j++){

                    if(i % j == 0){
                            primeNum = false;
                            break;
                    }
            }
            // print the number
            if(primeNum)
                    System.out.print(i + " ");
		    }
		System.out.println();
	}
	
	// prints "X" of stars that is n rows tall
	// quadratics
	public void nStars(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j=0; j <= n; j++) {
				if (j*i == Math.pow(i, 2)  || (n-j+1)*i == Math.pow(i,2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
					
			}
			System.out.println();
		}
	}
	
	// runs the methods
	public static void main(String[] args) {
		NestedLoops runner = new NestedLoops();
		runner.aToZ();
		runner.multiplicationTable();
		runner.primeNums(100);
		runner.nStars(5); 
	}
}
