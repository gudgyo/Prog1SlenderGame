package SlenderGame;
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;


public class Generators {
	
	private Image grass;
	private Image barrel;
	private Image bigTree;
	private Image smallTree;
	private Image car1;
	private Image car2;
	private Image wall;
	private Image floor;
	private Image fog;
	private Image rock;
	private Image truck;
	private Image note;
	private Image victory;
	private Image defeat;
	
	
	
	public Generators() {
		ImageIcon imgGrass = new ImageIcon("field.jpg");
		grass = imgGrass.getImage();
		ImageIcon imgBarrel = new ImageIcon(".\\barrel.jpg");
		barrel = imgBarrel.getImage();
		ImageIcon imgBigTree = new ImageIcon(".\\bigTree.jpg");
		bigTree = imgBigTree.getImage();
		ImageIcon imgSmallTree = new ImageIcon(".\\smallTree.jpg");
		smallTree = imgSmallTree.getImage();
		ImageIcon imgCar1 = new ImageIcon(".\\car.jpg");
		car1 = imgCar1.getImage();
		ImageIcon imgCar2 = new ImageIcon(".\\car2.jpg");
		car2 = imgCar2.getImage();
		ImageIcon imgWall = new ImageIcon(".\\wall.jpg");
		wall = imgWall.getImage();
		ImageIcon imgFloor = new ImageIcon(".\\floor.jpg");
		floor = imgFloor.getImage();
		ImageIcon imgFog = new ImageIcon(".\\fog.jpg");
		fog = imgFog.getImage();
		ImageIcon imgRock = new ImageIcon(".\\rock.jpg");
		rock = imgRock.getImage();
		ImageIcon imgTruck = new ImageIcon(".\\truck.jpg");
		truck = imgTruck.getImage();
		ImageIcon imgNote = new ImageIcon(".\\note.jpg");
		note = imgNote.getImage();
		ImageIcon imgVictory = new ImageIcon(".\\victory.jpg");
		victory = imgVictory.getImage();
		ImageIcon imgDefeat = new ImageIcon(".\\gameOver.jpg");
		defeat = imgDefeat.getImage();
	}

	Random rand = new Random();			//random számot ad két érték között
	public int randomBetween(int alsohatar, int felsohatar) {
		int randomNum = rand.nextInt(felsohatar-alsohatar+1) + alsohatar;
		return randomNum;
	}
	
	
	
	Field[][] fields = new Field[15][15];
	public void generateFields() {
		for(int i=0;i<15;i++) {
			for(int j=0;j<15;j++) {
				fields[i][j] = new Field();
			}
		}
	}
	
	public void generateThings() {		//pályán lévõ tárgyakat generáló függvényeket indítja..
		this.generateFields();
		this.generateHouse();
		this.generateRock();
		this.generateRock();
		this.generateCar1();
		this.generateCar2();
		this.generateTruck();
		this.generateBarrel();
		for(int i=0;i<5;i++) {
			this.generateBigTree();
		}
		for(int i=0;i<11;i++) {
			this.generateSmallTree();
		}
		for(int i=0;i<9;i++) {
			this.noteSetter();
		}
		
	}


	public void generateHouse() {
		int tmpX=randomBetween(1,8);
		int tmpY=randomBetween(0,7);
		for(int i=tmpX;i<tmpX+7;i++) {
			for(int j=tmpY;j<tmpY+8;j++) {
				fields[i][j].setCanNote(true);
				fields[i][j].setBlock(true);
				fields[i][j].setUsed(true);
				fields[i][j].setPicName("Wall");
			}
		}
		fields[tmpX][tmpY+1].setCanNote(false);
		fields[tmpX][tmpY+1].setBlock(false);
		fields[tmpX][tmpY+1].setPicName("Floor");
		fields[tmpX+1][tmpY+1].setCanNote(false);
		fields[tmpX+1][tmpY+1].setBlock(false);
		fields[tmpX+1][tmpY+1].setPicName("Floor");
		fields[tmpX+1][tmpY+2].setCanNote(false);
		fields[tmpX+1][tmpY+2].setBlock(false);
		fields[tmpX+1][tmpY+2].setPicName("Floor");
		fields[tmpX+1][tmpY+3].setCanNote(false);
		fields[tmpX+1][tmpY+3].setBlock(false);
		fields[tmpX+1][tmpY+3].setPicName("Floor");
		fields[tmpX+1][tmpY+4].setCanNote(false);
		fields[tmpX+1][tmpY+4].setBlock(false);
		fields[tmpX+1][tmpY+4].setPicName("Floor");
		fields[tmpX+2][tmpY+4].setCanNote(false);
		fields[tmpX+2][tmpY+4].setBlock(false);
		fields[tmpX+2][tmpY+4].setPicName("Floor");
		fields[tmpX+3][tmpY+1].setCanNote(false);
		fields[tmpX+3][tmpY+1].setBlock(false);
		fields[tmpX+3][tmpY+1].setPicName("Floor");
		fields[tmpX+3][tmpY+2].setCanNote(false);
		fields[tmpX+3][tmpY+2].setBlock(false);
		fields[tmpX+3][tmpY+2].setPicName("Floor");
		fields[tmpX+3][tmpY+3].setCanNote(false);
		fields[tmpX+3][tmpY+3].setBlock(false);
		fields[tmpX+3][tmpY+3].setPicName("Floor");
		fields[tmpX+3][tmpY+4].setCanNote(false);
		fields[tmpX+3][tmpY+4].setBlock(false);
		fields[tmpX+3][tmpY+4].setPicName("Floor");
		fields[tmpX+4][tmpY+1].setCanNote(false);
		fields[tmpX+4][tmpY+1].setBlock(false);
		fields[tmpX+4][tmpY+1].setPicName("Floor");
		fields[tmpX+4][tmpY+2].setCanNote(false);
		fields[tmpX+4][tmpY+2].setBlock(false);
		fields[tmpX+4][tmpY+2].setPicName("Floor");
		fields[tmpX+4][tmpY+3].setCanNote(false);
		fields[tmpX+4][tmpY+3].setBlock(false);
		fields[tmpX+4][tmpY+3].setPicName("Floor");
		fields[tmpX+4][tmpY+4].setCanNote(false);
		fields[tmpX+4][tmpY+4].setBlock(false);
		fields[tmpX+4][tmpY+4].setPicName("Floor");
		fields[tmpX+4][tmpY+5].setCanNote(false);
		fields[tmpX+4][tmpY+5].setBlock(false);
		fields[tmpX+4][tmpY+5].setPicName("Floor");
		fields[tmpX+4][tmpY+6].setCanNote(false);
		fields[tmpX+4][tmpY+6].setBlock(false);
		fields[tmpX+4][tmpY+6].setPicName("Floor");
	}

	public void generateRock() {
		int tmpX=randomBetween(0,12);
		int tmpY=randomBetween(0,12);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(fields[tmpX+i][tmpY+j].isUsed() || tmpX+tmpY==0){
					generateRock();
					return;
				}
			}
		}
		fields[tmpX][tmpY].setPicName("Rock");
		for(int k=tmpX;k<tmpX+3;k++) {
			for(int p=tmpY;p<tmpY+3;p++) {
				fields[k][p].setCanNote(true);
				fields[k][p].setBlock(true);
				fields[k][p].setUsed(true);
			}
		}
	}
		
	
	public void generateCar1() {
		int tmpX=randomBetween(0,12);
		int tmpY=randomBetween(0,13);

		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				if(fields[tmpX+i][tmpY+j].isUsed() || tmpX+tmpY==0){
					generateCar1();
					return;
				}
			}
		}
		fields[tmpX][tmpY].setPicName("Car1");
		for(int k=tmpX;k<tmpX+3;k++) {
			for(int p=tmpY;p<tmpY+2;p++) {
				fields[k][p].setCanNote(true);
				fields[k][p].setBlock(true);
				fields[k][p].setUsed(true);
			}
		}
		
	}
	
	public void generateCar2() {
		int tmpX=randomBetween(0,13);
		int tmpY=randomBetween(0,12);

		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				if(fields[tmpX+i][tmpY+j].isUsed() || tmpX+tmpY==0){
					generateCar2();
					return;
				}
			}
		}
		fields[tmpX][tmpY].setPicName("Car2");
		for(int k=tmpX;k<tmpX+2;k++) {
			for(int p=tmpY;p<tmpY+3;p++) {
				fields[k][p].setCanNote(true);
				fields[k][p].setBlock(true);
				fields[k][p].setUsed(true);
			}
		}
		
	}
	
	public void generateTruck() {
		int tmpX=randomBetween(0,12);
		int tmpY=randomBetween(0,10);

		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				if(fields[tmpX+i][tmpY+j].isUsed() || tmpX+tmpY==0){
					generateTruck();
					return;
				}
			}
		}
		fields[tmpX][tmpY].setPicName("Truck");
		for(int k=tmpX;k<tmpX+3;k++) {
			for(int p=tmpY;p<tmpY+5;p++) {
				fields[k][p].setCanNote(true);
				fields[k][p].setBlock(true);
				fields[k][p].setUsed(true);
			}
		}		
	}
	
	public void generateBarrel() {
		int tmpX=randomBetween(0,11);
		int tmpY=randomBetween(0,13);

		for(int i=0;i<4;i++) {
			for(int j=0;j<2;j++) {
				if(fields[tmpX+i][tmpY+j].isUsed() || tmpX+tmpY==0){
					generateBarrel();
					return;
				}
			}
		}
		fields[tmpX][tmpY].setPicName("Barrel");
		for(int k=tmpX;k<tmpX+4;k++) {
			for(int p=tmpY;p<tmpY+2;p++) {
				fields[k][p].setCanNote(true);
				fields[k][p].setBlock(true);
				fields[k][p].setUsed(true);
			}
		}		
	}
	
	public void generateBigTree() {

		int tmpX=randomBetween(0,13);
		int tmpY=randomBetween(0,13);

		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				if(fields[tmpX+i][tmpY+j].isUsed()){
					generateBigTree();
					return;
				}
			}
		}
		fields[tmpX][tmpY].setPicName("BigTree");
		for(int k=tmpX;k<tmpX+2;k++) {
			for(int p=tmpY;p<tmpY+2;p++) {
				fields[k][p].setCanNote(true);
				fields[k][p].setUsed(true);
			}
		}
	}
	
	public void generateSmallTree() {
		int tmpX=randomBetween(0,14);
		int tmpY=randomBetween(0,14);
		if(fields[tmpX][tmpY].isUsed()) {
			generateSmallTree();
		}else {
			fields[tmpX][tmpY].setPicName("SmallTree");
			fields[tmpX][tmpY].setUsed(true);
		}
	}
	
	public void noteSetter() {
		int tmpX = randomBetween(0,14);
		int tmpY = randomBetween(0,14);
		
		if(fields[tmpX][tmpY].isCanNote() && !fields[tmpX][tmpY].isNote()) {
			for(int i=tmpX-1;i<tmpX+1;i++) {
				for(int k=tmpY-1;k<tmpY+1;k++) {
					if(i>=0 && i<=14 && k>=0 && k<=14) {
						if(!fields[i][k].isBlock()) {
							fields[tmpX][tmpY].setNote(true);
						}
					}
				}
			}
		}else {
			noteSetter();
		}
	}
	
	
	
	
	public void setVisibility(int playerPositionX, int playerPositionY) {//a karakter 4 mezõ távolságra lát
		for(int a=0;a<15;a++) {
			for(int b=0;b<15;b++) {
				fields[a][b].setVisible(false);
			}
		}
		for(int i=playerPositionX-2;i<playerPositionX+3;i++) {
			for(int k=playerPositionY-2;k<playerPositionY+3;k++) {
				if(i>=0 && i<=14 && k>=0 && k<=14) {
					fields[i][k].setVisible(true);
				}
			}
		}
	}

	public Image getGrass() {
		return this.grass;
	}
	public Image getWall() {
		return this.wall;
	}
	public Image getFloor() {
		return this.floor;
	}
	public Image getCar1() {
		return this.car1;
	}
	public Image getCar2() {
		return this.car2;
	}
	public Image getBarrel() {
		return this.barrel;
	}
	public Image getRock() {
		return this.rock;
	}
	public Image getTruck() {
		return this.truck;
	}
	public Image getBigTree() {
		return this.bigTree;
	}
	public Image getSmallTree() {
		return this.smallTree;
	}
	public Image getNote() {
		return this.note;
	}
	public Image getFog() {
		return this.fog;
	}
	public Image getVictory() {
		return this.victory;
	}
	public Image getDefeat() {
		return this.defeat;
	}
}