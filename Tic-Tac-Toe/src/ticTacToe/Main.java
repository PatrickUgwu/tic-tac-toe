package ticTacToe;

import java.awt.Rectangle;

/**
 * The main class for the Tic Tac Toe application.
 * 
 * This class serves as the entry point of the program, initializing and launching the game UI.
 * 
 * @author Patrick Ugwu
 */
public class Main {
	// current Tic-Tac-Toe board
	static int [] currentField = new int[9] ;
	// rectangle for each field for drawing the board
	static Rectangle [] allFields = new Rectangle[9];
	
	/**
	 * This method creates the game frame and starts the user interface.
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.createFrame();
		
	}
	
}
