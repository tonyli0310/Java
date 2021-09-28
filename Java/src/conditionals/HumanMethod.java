package conditionals;

public class HumanMethod {

	// Human Method by Tony Li
	// didn't get any help on this one
	
	// sets age and gender as instance variables
	private int age;
	private char gender;
	
	// sets the age
	public void setAge(int x) {
		age = x;
	}
	
	// sets the gender
	public void setGender(char y) {
		gender = y;
		
	}
	
	// determines if a person could vote (18 or above)
	public void vote() {
		if (age >= 18) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	
	// determines if a person gets tetanus shot (every four years starting form 0)
	public void tetanusShot() {
		if (age % 4 == 0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	
	// determines if a person is toddler boy (younger than 4), toddler girl (younger than 4), or not a toddler
	public void toddler() {
		if (age < 4 && gender == 'b') {
			System.out.println("toddler boy");
		}
		else if (age < 4 && gender == 'g') {
			System.out.println("toddler girl");
		}
		else {
			System.out.println("not a toddler");
		}
	}
	
	// determines if a person gets movie discount (younger than 12 or older than 65)
	public void movieDiscount() {
		if (age < 12 || age > 65) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	
	// determines if a person is teenager (between 12 and 18)
	public void teenager() {
		if (age < 18 && age > 12) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}
	
	// runs the methods
	public static void main(String args []) {
		
		HumanMethod tester = new HumanMethod();
		
		tester.setAge(2);
		tester.setGender('b');
		tester.vote();
		tester.tetanusShot();
		tester.toddler();
		tester.movieDiscount();
		tester.teenager();
	}
	
	
}
