package SlenderGame;
import java.awt.Image;

import javax.swing.ImageIcon;
public class Player {
	int positionX, positionY, notes, facing,x,y;
	Generators generate = new Generators();
	private Image down;
	private Image up;
	private Image left;
	private Image right;
	

	public Player() {
		this.positionX=0;
		this.positionY=0;
		this.notes=0;
		this.facing=3;	//1-eszakranez, 2-keletre, 3-delre, 4-nyugatra
		ImageIcon imgDown = new ImageIcon(".\\characterDown.jpg"); // kep olvasas
		down = imgDown.getImage(); //kep tarolas
		ImageIcon imgUp = new ImageIcon(".\\characterUp.jpg");
		up = imgUp.getImage();
		ImageIcon imgLeft = new ImageIcon(".\\characterLeft.jpg");
		left = imgLeft.getImage();
		ImageIcon imgRight = new ImageIcon(".\\characterRight.jpg");
		right = imgRight.getImage();
	}
	
	
	

	
	
	public void move(char arrow, boolean fieldBlock){ //fields[positionX][PositionY].isBlockot var
		if(arrow=='w') {
			if(this.positionY!=0 && !fieldBlock) {
				this.positionY-=1;	
			}
			this.facing=1;
		}
		
		if(arrow=='s') {
			if(this.positionY!=14 && !fieldBlock) {
				this.positionY+=1;
			}
			this.facing=3;
		}
		
		if(arrow=='a') {
			if(this.positionX!=0 && !fieldBlock) {
				this.positionX-=1;	
			}
			this.facing=4;
		}
		
		if(arrow=='d') {
			if(this.positionX!=14 && !fieldBlock) {
				this.positionX+=1;
			}
			this.facing=2;
		}
	}

	void pickNote(){
		
	}
	
	
	
	
	//GET/SETTEREK
	public Image getPlayerImage() {	// kep lekerdezese memoriabol
		if(this.facing==1) {
			return this.up;
		}
		if(this.facing==2) {
			return right;
		}
		if(this.facing==3) {
			return this.down;
		}
		if(this.facing==4) {
			return this.left;
		}
		return this.up;
	}
	
	
	
	public int getPositionX() {
		return this.positionX;
	}
	
	public int getPositionY() {
		return this.positionY;
	}
	public int getNotes() {
		return this.notes;
	}
	public void setNotes() {
		this.notes++;
	}
}
