package graphics;

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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import loops.MoreNestedLoops;

public class GraphicalLoops extends JPanel {
	
	// Graphical Loops by Tony Li
	// Didn't get help on this one
	
	// constants that are predefined and won't change as the program runs
	private final int WIDTH = 1000, HEIGHT = 590;

	// defines what we want to happen anytime we draw the graphics
	public void paint(Graphics g) {
		
		// background color is gray
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, WIDTH, HEIGHT);
	}

	
	// draws n circles across the screen
	public void nCircles(int n, Graphics g) {
		for (int i = 0; i < n; i ++) {
			g.setColor(Color.blue);
			g.fillOval(10*i, 0 , 5, 5);
		}
	}
	
	// draws circles that start small, grow bigger, and then shrink again
	public void changeCircles(Graphics g) {
		for (int i = 0; i < 10; i ++) {
			if (i < 5) {
				g.setColor(Color.blue);
				g.fillOval(100*i, 10, 10 + 10*i, 10 + 10*i);
			}
			else {
				g.setColor(Color.blue);
				g.fillOval(100*i, 10, 10 + 10*(10-i), 10 + 10*(10-i));
			}
		}
	}
	
	// draws 10 rows of 10 circles each
	public void tenCircles(Graphics g) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				g.setColor(Color.blue);
				g.fillOval(10*j, 10*i, 10, 10);
			}
		}
	}
	
	// draws a checker board with lines
	public void checkerBoard(Graphics g) {
		for (int i = 0; i < 10; i++) {
			g.drawLine(10, i*25, 210, i*25);
			
			for (int j = 0; j < 10; j++) {
				g.drawLine(j*25, 10, j*25, 210);
			}
		}
	}
	
	
	// draws a circle, a square, then a triangle, and then repeats
	public void geometricPattern(Graphics g) {
		for (int i = 0; i < 2; i++) {
			g.setColor(Color.blue);
			g.fillOval(60*i, 0, 5, 5);
			
			g.setColor(Color.blue);
			g.drawRect(10+10*i, 0, 5, 5);
			
			g.setColor(Color.blue);
			g.drawPolygon(new int[] {)
		}
	}
	
	
	

	//////////////////////////////////////
	//////////////////////////////////////
	
	// DON'T TOUCH THE BELOW CODE
	
	
	// this method runs the actual program.
	public void run() {

		// while(true) should rarely be used to avoid infinite loops, but here it is ok because
		// closing the graphics window will end the program
		while (true) {
	
			// draws
			repaint();
			
			//rests for a hundredth of a second
			try {
				Thread.sleep(10);
			} catch (Exception ex) {}
		}
	}
	
	// very simple main method to get the game going
	public static void main(String[] args) {
		new GraphicalLoops();
		//runner.nCircles(5, null);
		//runner.changeCircles(null);
		//runner.tenCircles(null);
		//runner.checkerBoard(null);
		//runner.geometricPattern(null);
		
		
	}
 
	// does complicated stuff to initialize the graphics and key listeners
	// DO NOT CHANGE THIS CODE UNLESS YOU ARE EXPERIENCED WITH JAVA
	// GRAPHICS!
	public GraphicalLoops() {
		JFrame frame = new JFrame();
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		this.setFocusable(true);
		
		run();
	}
}