package SlenderGame;

import java.awt.Image;

import javax.swing.ImageIcon;


public class Slender {
	public int positionX, positionY, phase;
	public int threeMove;
	public boolean dead;
	private Image slender;
	
	
	public Slender() {
		this.positionX=14;
		this.positionY=14;
		this.phase=0; //0-rol indul, 4.-re randomot lep
		this.threeMove=0;
		this.dead = false;
		
		ImageIcon slenderPic = new ImageIcon(".\\slender.jpg");
		slender = slenderPic.getImage();
	}

	
	
	
	
	Generators gen = new Generators();

	public void move(int playerPositionX, int playerPositionY, int playerNotes){
		if(playerPositionX==this.positionX && playerPositionY==this.positionY) {
			die();
		}
		this.phase++;
		if(this.phase==4) {
			this.positionX = gen.randomBetween(0,14);
			this.positionY = gen.randomBetween(0,14);
			this.phase=0;
			return;
		}
		if(playerNotes<2&&playerNotes!=0) {
			int x=gen.randomBetween(0,14);
			int y=gen.randomBetween(0,14);
			if((x+y)-(playerPositionX+playerPositionY)>=5||(x+y)-(playerPositionX+playerPositionY)<=-5){
				this.positionX=x;
				this.positionY=y;
			}else {
				this.move(playerPositionX, playerPositionY, playerNotes);
			}
			
		}
		if(playerNotes<5&&playerNotes>=2) {
			int x=gen.randomBetween(0,14);
			int y=gen.randomBetween(0,14);
			if((x+y)-(playerPositionX+playerPositionY)<=5||(x+y)-(playerPositionX+playerPositionY)>=-5){
				this.positionX=x;
				this.positionY=y;
			}else {
				this.move(playerPositionX, playerPositionY, playerNotes);
			}
			if(this.threeRow(playerPositionX, playerPositionY) && gen.randomBetween(1,3)==1) {
				this.die();
			}
			
		}
		if(playerNotes<7&&playerNotes>=4) {
			int x=gen.randomBetween(0,14);
			int y=gen.randomBetween(0,14);
			if((x+y)-(playerPositionX+playerPositionY)<=4||(x+y)-(playerPositionX+playerPositionY)>=-4){
				this.positionX=x;
				this.positionY=y;
			}else {
				this.move(playerPositionX, playerPositionY, playerNotes);
			}
			if(this.threeRow(playerPositionX, playerPositionY) && gen.randomBetween(1,2)==1) {
				this.die();
			}
			
		}
		if(playerNotes>=6) {
			int x=gen.randomBetween(0,14);
			int y=gen.randomBetween(0,14);
			if((x+y)-(playerPositionX+playerPositionY)<=3||(x+y)-(playerPositionX+playerPositionY)>=-3){
				this.positionX=x;
				this.positionY=y;
			}else {
				this.move(playerPositionX, playerPositionY, playerNotes);
			}
			if(this.threeRow(playerPositionX, playerPositionY) && gen.randomBetween(1,3)!=1) {
				this.die();
			}
			
		}
		
	}
	
	public void die() {
		this.dead = true;
	}
	
	public boolean threeRow(int playerPositionX, int playerPositionY) {
		boolean almost=false;
		if(playerPositionX+playerPositionY-this.positionX-this.positionY==1||playerPositionX+playerPositionY-this.positionX-this.positionY==-1) {
			this.threeMove+=1;
		}else {
			threeMove=0;
		}
		if(this.threeMove>=3) {
			almost=true;
			return almost;
		}else {
			almost=false;
			return almost;
		}
	}
	
	
	
	//GET/SETTEREK
	
	public Image getImage() {
		return this.slender;
	}
	
	
	public int getPositionX() {
		return this.positionX;
	}
	
	public int getPositionY() {
		return this.positionY;
	}
	public boolean getDead() {
		return this.dead;
	}
	
}
