package ticTacToe;

import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Class for setting up the game window
 * 
 * @author Patrick Ugwu
 * @see Main
 *
 */
public class Frame {
	static public int frameHeight = 600;
	static public int frameWidth = 600;

	/**
	 * Setting up the game window
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
	/**
	 * Gets the insets (borders) of the first frame in the application.
	 *
	 * @return the insets (space around the frame) of the first frame
	 */
	public static Insets getFrameInsets() {
	    return JFrame.getFrames()[0].getInsets(); 
	}

}
