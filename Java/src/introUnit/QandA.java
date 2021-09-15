package introUnit;

public class QandA {
public static void main(String[] args) {
		
	// QandA by Tony Li
	// Didn't comment on this one because it is pretty self-explanatory
	// Didn't use any help on this one
	
		System.out.println("What is your name?");
		sleep(500);
		System.out.println("Tony (Shuoxuan) Li");
		
		System.out.println("");
		sleep(1000);
		
		System.out.println("Where are you from?");
		sleep(500);
		System.out.println("I am from Beijing, China. However, I have lived in Hong Kong for the past "
				+ "three years.");
		
		System.out.println("");
		sleep(1000);
		
		System.out.println("What are your hobbies?");
		sleep(500);
		System.out.println("For sports, I play basketball and golf. I also know how to swim. Except for that,"
				+ " I am a debater, actor, and pianist. I also enjoy video games and delicious food.");
		
		System.out.println("");
		sleep(1000);
		
		System.out.println("Have any siblings?");
		sleep(500);
		System.out.println("Yes, I have a sister younger than me by three years who goes to Indian Mountan School, "
				+ "which is a junior boarding school in Lakeville, Connecticut. She is currently a seventh grader.");
		
		System.out.println("");
		sleep(1000);
		
		System.out.println("What do you like to do during free time?");
		sleep(500);
		System.out.println("I like to play video games and watch movies. My favorite movies are the Marvel Series "
				+ "horror movies of any kind.");
		
		System.out.println("");
		sleep(1000);
		
		System.out.println("What is your favorite food?");
		sleep(500);
		System.out.println("My favorite food would definitely be Chinese food. I love to savor any kind of dumplings,"
				+ "meat buns and noodles. They remind me of my cultural background and childhood. Besides Chinese"
				+ "cuisine, I am also a fan of foreign food like cheeseburgers and tacos.");
		
		System.out.println("");
		sleep(1000);
		
		System.out.println("What did you do during the Summer?");
		sleep(500);
		System.out.println("Summer was quite fruitful for me. I took a diplomacy and college writing couse"
				+ "at Harvard Precollege, which totaled a period of four weeks. I also attended a Greek Philosophy"
				+ "session at Stanford Humanities Institued. Of course, I also spent quality time with my family "
				+ "as we traveled to Shanghai. I also relaxed a little bit on myself, playing video games and"
				+ "watching TV, which left me with intensive SAT prep to do during this school year.");
		
		System.out.println("");
		sleep(1000);
		
		System.out.println("Anything else?");
		sleep(500);
		System.out.println("I would also like to say that it is quite strange to be back on campus after being"
				+ "remote for a whole year, especially since I was a new sophomore last year. It feels like I know"
				+ "people but at the same time I don't really know much about them. Anyways, hope this school year"
				+ "will not get interrupted by the pandemic like the last one!");
		

	}
	
	// makes the program pause for a certain period of time
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

