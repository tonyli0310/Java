package introUnit;

public class Clock {
	
	// Clock by Tony Li
	// Didn't use help on this one
	
	
	// sets the instance variable
	private int time;
	
	
	// create your methods here
	// set the time as a instance variable	
	public void setTime(int startTime) {
		time = startTime;
	}
	
	// set the time to add by one second for every tick
	public void tick() {
		time = (time + 1)%60;
		
	}
	
	// display the new time after every tick
	public void displayTime() {
		System.out.println(time);
	}

	// runs the methods
	public static void main(String[] args) {
		Clock tester = new Clock();
		
		// should display the time to be 56, 57, 58, 59, 0, 1, etc.
		tester.setTime(56);
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
	}
}
