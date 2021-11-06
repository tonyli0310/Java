package loops;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JeopardyBoard {
	
	// Jeopardy Board by Tony Li
	// Got help from Mr.Friedman
	
	// width and heigh of the display window / height of the score window
	private int gridWidth = 800, gridHeight = 600, textHeight = 50;

	// number of questions and categories in the jeopardy (questions are rows and categories are columns)
	private final int NUMQUESTIONS = 5, NUMCATEGORIES = 5;
	
	// score starts at 0 in the beginning of the game
	private int score = 0;
	
	// sets the index of the point value that needs to change color to be -1
	// so that no point value changes color in the beginning of the game
	private int colorChangeI = -1;
	private int colorChangeJ = -1;
	
	// draw method
	public void draw(Graphics g) {
		
		// nested loop to go through every box
		for (int i = 0; i < NUMCATEGORIES; i++) {
			for (int j = 0; j < NUMQUESTIONS; j++) {
				
				// fills boxes in blue color (leaves a grid of the boxes in black color)
				g.setColor(Color.blue);
				g.fillRect(gridWidth/NUMCATEGORIES * i, gridHeight/NUMQUESTIONS * j, gridWidth/NUMCATEGORIES, gridHeight/NUMQUESTIONS);
				
				// draws boxes in black color
				g.setColor(Color.black);
				g.drawRect(gridWidth/NUMCATEGORIES * i, gridHeight/NUMQUESTIONS * j, gridWidth/NUMCATEGORIES, gridHeight/NUMQUESTIONS);
				
				// draws point values of the boxes in black color
				Font f = new Font("Arial", Font.BOLD, 14);
				g.setFont(f);
				g.setColor(Color.black);
				g.drawString ((j+1) * 100 + "", gridWidth/NUMCATEGORIES * i + gridWidth/(NUMCATEGORIES*2), gridHeight/NUMQUESTIONS * j + gridHeight/(NUMQUESTIONS*2));
				
				// draws the point value that is clicked in red color
				if (i == colorChangeI && j == colorChangeJ) {
					g.setColor(Color.red);
					g.drawString ((j+1) * 100 + "", gridWidth/NUMCATEGORIES * i + gridWidth/(NUMCATEGORIES*2), gridHeight/NUMQUESTIONS * j + gridHeight/(NUMQUESTIONS*2));
				}	
			}
		}
	}
	
	// checks if any point value should be added to the score
	public void click(int mouseX, int mouseY) {
		
		// nested loop to go through every box
		for (int i = 0; i < NUMCATEGORIES; i++) {
			for (int j = 0; j < NUMQUESTIONS; j++) {
	
				// if mouse is clicked in the domain of a box, the assigned value of the box should be added to the score
				if ((mouseX >= gridWidth/NUMCATEGORIES * i && mouseX <= gridWidth/NUMCATEGORIES * (i+1)) && (mouseY >= gridHeight/NUMQUESTIONS * j && mouseY <= gridHeight/NUMQUESTIONS * (j+1))) {
					score += (j+1) * 100;
					colorChangeI = i;
					colorChangeJ = j;
				}
			}	
		}	
	}
	
	
	// DO NOT TOUCH BELOW CODE //
	
	public JeopardyBoard() {
		
		JFrame window = new JFrame();
		window.setTitle("Jeopardy!");
		window.setSize(gridWidth, gridHeight + textHeight);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		
		JTextArea scoreDisplay = new JTextArea();
		scoreDisplay.setEditable(false);
		scoreDisplay.setText("\t\tScore: 0");
		
		JPanel canvas = new JPanel() {
			public void paint(Graphics g) {
				gridWidth = window.getWidth();
				gridHeight = window.getHeight() - textHeight;
				draw(g);
			}
		};
		
		canvas.setPreferredSize(new Dimension(gridWidth, gridHeight));
		
		canvas.addMouseListener(new MouseListener() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				click(e.getX(), e.getY());
				scoreDisplay.setText("\t\tScore: " + score);
				window.getContentPane().repaint();
			}

			@Override
			public void mouseClicked(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}
		});
		
		container.add(canvas);
		container.add(scoreDisplay);
		window.add(container);
		window.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JeopardyBoard();
	}

}

