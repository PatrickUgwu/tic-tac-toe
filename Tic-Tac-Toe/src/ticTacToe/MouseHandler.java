package ticTacToe;

import java.awt.Insets;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseHandler implements MouseListener {

	public static int moveSelect = 1;
	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Insets insets = Frame.getFrameInsets();
		int adjustedX = e.getX() - insets.left;
		int adjustedY = e.getY() - insets.top;
		Point adjustedPoint = new Point(adjustedX, adjustedY);

		if(!Draw.won) {
			for(int i = 0; i < 9; i++) {
				if(Main.allFields[i].contains(adjustedPoint) && Main.currentField[i] == 0) {
					Main.currentField[i]= moveSelect;
					if(moveSelect == 1) {
						moveSelect = 2;
					}
					else {
						moveSelect = 1;
					}
					Draw.isWon();

				}
			}
		}
		else {
			
			for(int j = 0; j < 9; j++) {
				Main.currentField[j] = 0;
		
			}
			Draw.won = false;
		
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
