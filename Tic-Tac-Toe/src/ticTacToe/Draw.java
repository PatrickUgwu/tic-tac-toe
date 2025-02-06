package ticTacToe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JLabel;


public class Draw extends JLabel{
	static boolean won = false;
	static int offset=10;
	static int offset2=5;
	Color color = new Color(0,255,255);
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		// draw grid
		for(int i = 0; i < getWidth(); i+=(getWidth()/3) ) {
			g2.drawLine(i, 0, i,getHeight());
		}
		for(int i = 0; i < getHeight(); i+=(getHeight()/3) ) {
			g2.drawLine(0, i, getWidth(),i);
		}
		//draw X or O
		for(int i = 0;i < 9;i++) {
			if (Main.currentField[i]==1) {
				drawX(g2,i);
			}
			else if (Main.currentField[i]==2) {
				drawO(g2,i);	
			}
		}
		
		// won?
		if (won) {
			String endScreenText = "has won." ;
			g2.fillRect(0, 0, getWidth(), getHeight());
			g2.setColor(color);
			Font stringFont = new Font( "SansSerif", Font.PLAIN, 30 ); 
			g2.setFont( stringFont );
			if (MouseHandler.moveSelect==2) {
				endScreenText = ("X : " + endScreenText);
			}
			else {
				endScreenText = ("O : " + endScreenText);
			}
			g2.drawString(endScreenText, getWidth()/3, getHeight()/2);
			endScreenText = "Click to restart.";
			g2.drawString(endScreenText, getWidth()/3-15, getHeight()/2+50);
		}
		repaint();
		
	}
	
	public void declareFields() {

		Main.allFields[0] = new Rectangle(0,0,getWidth()/3,getHeight()/3);
		Main.allFields[1] = new Rectangle(getWidth()/3,0,getWidth()/3,getHeight()/3);
		Main.allFields[2] = new Rectangle(2*getWidth()/3,0,getWidth()/3,getHeight()/3);
		Main.allFields[3] = new Rectangle(0,getHeight()/3,getWidth()/3,getHeight()/3);
		Main.allFields[4] = new Rectangle(getWidth()/3,getHeight()/3,getWidth()/3,getHeight()/3);
		Main.allFields[5] = new Rectangle(2*getWidth()/3,getHeight()/3,getWidth()/3,getHeight()/3);
		Main.allFields[6] = new Rectangle(0,2*getHeight()/3,getWidth()/3,getHeight()/3);
		Main.allFields[7] = new Rectangle(getWidth()/3,2*getHeight()/3,getWidth()/3,getHeight()/3);
		Main.allFields[8] = new Rectangle(2*getWidth()/3,2*getHeight()/3,getWidth()/3,getHeight()/3);
		
	}	

	public void drawX(Graphics2D g2,int i) {
		g2.drawLine(Main.allFields[i].x+offset,Main.allFields[i].y+offset,Main.allFields[i].x+getWidth()/3-offset,Main.allFields[i].y+getHeight()/3-offset);
		g2.drawLine(Main.allFields[i].x+offset,Main.allFields[i].y+getHeight()/3-offset,Main.allFields[i].x+getWidth()/3-offset,Main.allFields[i].y+offset);
	}
	
	public void drawO(Graphics2D g2, int i) {
		g2.drawOval(Main.allFields[i].x+offset2, Main.allFields[i].y+offset2, getWidth()/3-offset, getHeight()/3-offset);
	}
	
	
	public static boolean isWon() {
		for(int i = 0; i<3;i++) {
			if(Main.currentField[i] != 0 ) {
				if(Main.currentField[i] == Main.currentField[i+3] 
					&& Main.currentField[i] == Main.currentField[i+6]) {
				won = true;
				break;
				}
			}
		}
		
		for(int i = 0; i<9;i+=3) {
			if(Main.currentField[i] != 0 ) {
				if(Main.currentField[i] == Main.currentField[i+1] 
					&& Main.currentField[i] == Main.currentField[i+2]) {
				won = true;
				break;
				}
			}
		}
		
		
		if(Main.currentField[0] != 0 ) {
			if(Main.currentField[0] == Main.currentField[4] 
				&& Main.currentField[0] == Main.currentField[8]) {
			won = true;
			
			}
		}
		
		if(Main.currentField[2] != 0 ) {
			if(Main.currentField[2] == Main.currentField[4] 
				&& Main.currentField[2] == Main.currentField[6]) {
			won = true;
			
			}
		}
		return won;
	}
	
	
	

}
