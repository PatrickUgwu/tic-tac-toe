package ticTacToe;

import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Class for setting up the game window
 * @author Patrick
 *
 */
public class Frame {
	static public int frameHeight = 600;
	static public int frameWidth = 600;

	/**
	 * setting up the game window
	 */
	public void createFrame() {

		JFrame frame = new JFrame("Tic-Tac-Toe");
		frame.setSize(frameWidth, frameHeight);
		Draw draw = new Draw();
		draw.setVisible(true);
		frame.add(draw);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
		
		frame.addMouseListener(new MouseHandler());
		draw.declareFields();
		
	}
	public static Insets getFrameInsets() {
	    return JFrame.getFrames()[0].getInsets(); 
	}

}
