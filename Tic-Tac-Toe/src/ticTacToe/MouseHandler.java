package ticTacToe;

import java.awt.Insets;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Handles the user input
 * 
 * @author Patrick Ugwu
 */
public class MouseHandler implements MouseListener {

	// track whose turn it is (1 for 'X', 2 for 'O')
	public static int moveSelect = 1;
	
	public void mouseClicked(MouseEvent e) {
		// Not used
		
	}

	/**
     * Handles mouse presses to select and fill game fields or reset the game when it's already won.
     *
     * @param e the mouse event
     */
	@Override
	public void mousePressed(MouseEvent e) {
		Insets insets = Frame.getFrameInsets();
		// correct mouse position
		int adjustedX = e.getX() - insets.left;
		int adjustedY = e.getY() - insets.top;
		Point adjustedPoint = new Point(adjustedX, adjustedY);

		if(!Draw.won) {
			// find clicked field
			for(int i = 0; i < 9; i++) {
				if(Main.allFields[i].contains(adjustedPoint) && Main.currentField[i] == 0) {
					Main.currentField[i]= moveSelect;
					// next turn
					if(moveSelect == 1) {
						moveSelect = 2;
					}
					else {
						moveSelect = 1;
					}
					// check if game is now won
					Draw.isWon();
				}
			}
		}
		else {
			// restart game
			for(int j = 0; j < 9; j++) {
				Main.currentField[j] = 0;
			}
			Draw.won = false;
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Not used
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Not used
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Not used
		
	}

}
