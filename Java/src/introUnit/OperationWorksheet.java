package introUnit;

public class OperationWorksheet {
	public void numToChar (int input_number) {
		System.out.println((char)input_number);
		
	}
	
	public void lastDigit (int num) {
		System.out.println ((int)num % 10);
	
	}
	
	public void exactAvg (double num1, double num2) {
		System.out.println ((num1 + num2)/2);
	}
	
	public static void main(String[] args) {
		OperationWorksheet runner = new OperationWorksheet();
		runner.numToChar(97);
		runner.lastDigit (79);
		runner.exactAvg (1,5);
	
	}
}
