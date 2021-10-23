package graphics;

// Pong Game by Tony Li
// 'w' and 's' keys to move the left paddle up and down
// UP and DOWN keys to move the right paddle up and down
// '1' to activate 1-player mode (the left paddle becomes an AI)
// '2' to activate 2-player mode 
// Extra Feature #1: 'f' to activate to Frantic Mode and 'f' to deactivate it (increases ball speed by 1.5 times)
// Extra Feature #2: 'g' to activate Gravity Mode and 'h' to deactivate it (have paddles impacted by gravitational force)
// Extra Feature #3: 'a' to activate Hard Mode and 'l' to deactivate it (balls bigger and paddles shorter)

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pong extends JPanel implements KeyListener {
	
	// CONSTANTS
	
	// width and heights of the display window
	private final int WIDTH = 600, HEIGHT = 600, WINDOW_HEIGHT = 650;
	
	// speed of the paddles
	private final int PADDLE_SPEED = 4;
	
	// gravity of the paddles for the gravity mode
	private final int GRAVITY = 4;
	
	// INSTANCE VARIABLES
	
	// width and height of the paddles and diameter of the ball
	private int PADDLE_WIDTH = 20, PADDLE_HEIGHT = 100, DIAM = 10;
	
	// the starting coordinates of the ball
	private int ballX = WIDTH/2;
	private int ballY = HEIGHT/2;
	
	// the starting speed of the ball
	private int ballXSpeed = 3;
	private int ballYSpeed = 3;
	
	// the starting coordinates of the left paddle
	private int paddle1X = 0;
	private int paddle1Y = HEIGHT/2;
	
	// the starting coordinates of the right paddle
	private int paddle2X = WIDTH - PADDLE_WIDTH;
	private int paddle2Y = HEIGHT/2;
	
	// starting values of the score display
	private int scoreDisplay1 = 0;
	private int scoreDisplay2 = 0;
	
	// BOOLEANS
	
	// booleans that keep track of the direction of paddle movement
	private boolean up1, down1, up2, down2; 
	
	// boolean that pauses and restarts the game
	private boolean gamePause = false;
	
	// boolean that turns off and on the solo mode
	private boolean solo = false;
	
	// boolean that turns off and on the frantic mode
	private boolean frantic = false;
	
	// boolean that turns off and on the hard mode
	private boolean hard = false;
	
	// boolean that turns off and on gravity mode
	private boolean gravity = false;
	
	// move method of the ball at each time step
	public void move_ball() {

		ballX += ballXSpeed;
		ballY += ballYSpeed;
		
		// pauses the game
		if (gamePause == true) {
			ballXSpeed = 0;
			ballYSpeed = 0;
		}
		
		// sets up the frantic mode, which increases the ball speed by 1.5 times
		if (frantic == true) {
			ballXSpeed *= 1.5;
			ballYSpeed *= 1.5;
			frantic = false;
		}
		
		// sets up the hard mode, which makes the paddles shorter and the ball bigger
		if (hard == true) {
			DIAM = 20;
			PADDLE_HEIGHT = 50;
		}
	}
	
	
	// move method of the paddles at each time step
	public void move_paddles() {
		
		// sets up the random class
		Random speed = new Random();
		
		// sets up the upper limit of the random number
		int upperbound = 15;
		
		// corresponds the boolean to each direction of paddle movement
		if (up1 == true) {
			paddle1Y -= PADDLE_SPEED;
		}
		
		else if (down1 == true) {
			paddle1Y += PADDLE_SPEED;
		}
	
		if (up2 == true) {
			paddle2Y -= PADDLE_SPEED;
		}
		
		else if (down2 == true) {
			paddle2Y += PADDLE_SPEED;
		}
		
		if (gravity == true) {
			if (up1 != true && down1 != true && up2 != true && down2 != true) {
				paddle1Y += GRAVITY;
				paddle2Y += GRAVITY;
			}
		}
		
		// sets up the AI
		// makes it move in random speed not exceeding 15 so that it is beatable
		if (solo == true) {
			
			if (paddle1Y < ballY) {
				paddle1Y += speed.nextInt(upperbound);
			}
			
			else if (paddle1Y > ballY) {
				paddle1Y -= speed.nextInt(upperbound);
			}
			
			else {
				paddle1Y = paddle1Y;
			}
		}
	}
	
	
	// checks if the ball bounces off any walls or paddles
	public void check_collisions() {
		
		// if ball touches the right side of the screen, the left side wins a point
		// ball returns to starting position / game pauses until user presses Space
		if (ballX >= WIDTH - DIAM) {
			ballX = WIDTH/2;
			ballY = HEIGHT/2;
			scoreDisplay1 +=1;
			gamePause = true;			
		}
		
		// if ball touches left side of the screen, the right side wins a point
		// ball returns to starting position / game pauses until user presses Space
		else if (ballX <= 0) {
			ballX = WIDTH/2;
			ballY = HEIGHT/2;
			scoreDisplay2 +=1;
			gamePause = true;
		}
		
		// ball bounces off if it touches the top and bottom of the screen
		if (ballY >= HEIGHT - DIAM || ballY <= 0) {
			ballYSpeed *= -1;
		}
		
		// if ball touches the paddles, it bounces off
		if ((ballX <= paddle1X + PADDLE_WIDTH) && ((ballY >= paddle1Y - DIAM) && (ballY <= paddle1Y + PADDLE_HEIGHT))) {
		    ballXSpeed *= -1;
		}
		
		else if ((ballX >= paddle2X - DIAM) && ((ballY >= paddle2Y - DIAM) && (ballY <= paddle2Y + PADDLE_HEIGHT))) {
			ballXSpeed *= -1;
		}
		
		// paddles cannot pass through the bottom and top of the screen
		if (paddle1Y <= 0) {
			paddle1Y = 0;
		}
	
		else if (paddle1Y + PADDLE_HEIGHT >= HEIGHT) {
			paddle1Y = HEIGHT - PADDLE_HEIGHT;
		}
		
		if (paddle2Y <= 0) {
			paddle2Y = 0;
		}
		
		else if (paddle2Y + PADDLE_HEIGHT >= HEIGHT) {
			paddle2Y = HEIGHT - PADDLE_HEIGHT ;
		}
	}

	
	// draw method for the game
	public void paint(Graphics g) {
		
		// sets the background color to gray
		// defines display window with previously specified width and height
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		// sets up and draws the score display 
		Font f = new Font("Arial", Font.BOLD, 14);
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString("P1 Score: " + scoreDisplay1, WIDTH/5, 20);
		g.drawString("P2 Score: " + scoreDisplay2, WIDTH*3/5, 20);
		
		// gives the user instructions to press Space when game pauses
		if (gamePause == true) {
			g.drawString("Press Space to Play!", WIDTH*2/5, HEIGHT*1/3);
		}
			
		// draws the ball based on previously specified variables
		g.setColor(Color.blue);
		g.fillOval(ballX, ballY, DIAM, DIAM);
									
		// draws the paddle based on previously specified variables
		g.setColor(Color.orange);
		g.fillRect(paddle1X, paddle1Y, PADDLE_WIDTH, PADDLE_HEIGHT);
		g.fillRect(paddle2X, paddle2Y, PADDLE_WIDTH, PADDLE_HEIGHT);	
	}

	
	// defines what happens when certain keys are pressed
	public void keyPressed(KeyEvent e) {
		
		// initializes key functions
		int keyCode = e.getKeyCode();
		
		// changes paddle direction based on what button is pressed
		if (e.getKeyChar() == 'w') 

			up1 = true;
		
		if (e.getKeyChar() == 's') 

			down1 = true;

		if (keyCode == KeyEvent.VK_UP)

			up2 = true;

		if (keyCode == KeyEvent.VK_DOWN)

			down2 = true;
		
		
		// press Space button to continue the game whenever it is paused
		if ((keyCode == KeyEvent.VK_SPACE) && gamePause == true) {
			gamePause = false;
			ballXSpeed = 3;
			ballYSpeed = 3;
		}
		
		// turns on the solo mode when '1' is pressed
		if ((e.getKeyChar() == '1'))
			solo = true;
		
		// turns off the solo mode when '2' is pressed
		if ((e.getKeyChar() == '2'))
			solo = false;
		
		// turns on the frantic mode when 'f' is pressed
		if ((e.getKeyChar() == 'f')) 
			frantic = true;
		
		// turns off the frantic mode when 'j' is pressed
		if ((e.getKeyChar() == 'j')) {
			frantic = false;
			ballXSpeed /= 1.5;
			ballYSpeed /= 1.5;
		}		
		
		// turns on the gravity mode when 'g' is pressed
		if ((e.getKeyChar() == 'g')) {
			gravity = true;
		}
		
		// turns off the gravity mode when 'h' is pressed
		if ((e.getKeyChar() == 'h')) {
			gravity = false;
		}
		
		// turns on the hard mode when 'a' is pressed
		if ((e.getKeyChar() == 'a')) {
			hard = true;
		}
		
		// turns off the hard mode when 'l' is pressed
		if ((e.getKeyChar() == 'l')) {
			hard = false;
			DIAM = 10;
			PADDLE_HEIGHT = 100;
		}
	}	

	
	// defines what happens when certain keys are released
	public void keyReleased(KeyEvent e) {
		
		// initializes key functions
		int keyCode = e.getKeyCode();
		
		// stops paddle motion based on which button is released
		if (e.getKeyChar() == 'w') 
			
			up1 = false;
		
		if (e.getKeyChar() == 's') 
			
			down1 = false;

		if (keyCode == KeyEvent.VK_UP)
		
			up2 = false;

		if (keyCode == KeyEvent.VK_DOWN)
			
			down2 = false; 		
	}
	
	
	// restarts the game: sets the ball back to starting position / player scores return to 0
	// game pauses until use presses Space
	public void restart() {
		
		gamePause = true;
		ballX = WIDTH/2;
		ballY = HEIGHT/2;
		scoreDisplay1 = 0;
		scoreDisplay2 = 0;
	}

	//////////////////////////////////////
	//////////////////////////////////////
	
	// DON'T TOUCH THE BELOW CODE
	
	
	// this method runs the actual game.
	public void run() {

		// while(true) should rarely be used to avoid infinite loops, but here it is ok because
		// closing the graphics window will end the program
		while (true) {
	
			// draws the game
			repaint();
			
			// we move the ball, paddle, and check for collisions
			// every hundredth of a second
			move_ball();
			move_paddles();
			check_collisions();
			
			//rests for a hundredth of a second
			try {
				Thread.sleep(10);
			} catch (Exception ex) {}
		}
	}
	
	// very simple main method to get the game going
	public static void main(String[] args) {
		new Pong();
	}

	// does complicated stuff to initialize the graphics and key listeners
	// DO NOT CHANGE THIS CODE UNLESS YOU ARE EXPERIENCED WITH JAVA
	// GRAPHICS!
	public Pong() {
		JFrame frame = new JFrame();
		JButton button = new JButton("restart");
		frame.setSize(WIDTH, WINDOW_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		frame.add(button, BorderLayout.SOUTH);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				restart();
				Pong.this.requestFocus();
			}
		});
		this.addKeyListener(this);
		this.setFocusable(true);
		
		run();
	}
	
	// method does nothing
	public void keyTyped(KeyEvent e) {}
}