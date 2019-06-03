package SlenderGame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.*;
import javax.swing.*;

class Game extends JPanel implements ActionListener {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Player player;
	private Slender slender;
	private Generators generator;
	private Timer timer;
	private Image note;
	
	public Game() {
		player = new Player();
		slender = new Slender();
		generator = new Generators();
		generator.generateThings();
		//addKeyListener(new Al());
		this.setFocusable(true);
		//graph = getGraphics();
		timer = new Timer(50, this);
		timer.start();
		
		
		generator.setVisibility(player.positionX, player.positionY);
	}
	
	public void actionPerformed(ActionEvent keystroke) {
		for(int i=-1;i<2;i++) {
			for(int k=-1;k<2;k++) {
				if(player.getPositionX()+i>=0 && player.getPositionX()+i<=14 && player.getPositionY()+k>=0 && player.getPositionY()+k<=14) {
					if (generator.fields[player.getPositionX()+i][player.getPositionY()+k].isNote()) {
						player.setNotes();
						generator.fields[player.getPositionX()+i][player.getPositionY()+k].setNote(false);
					}
				}
				
			}
		}
		


		if (slender.getDead() == true) {
			setFocusable(false);
		}
		repaint();
	}
	
	
	public void paint(Graphics graph) {
		
		
		ImageIcon imgNote = new ImageIcon(".\\remaining"+player.getNotes()+".jpg");
		note = imgNote.getImage();
		super.paint(graph);
		graph.drawImage(generator.getGrass(),0*750,0*750, null);
		for(int i=0;i<15;i++) {
			for(int j=0;j<15;j++) {
				if(!generator.fields[i][j].getPicName().equals("Grass")){
					switch(generator.fields[i][j].getPicName()) {
					case "Wall":
						graph.drawImage(generator.getWall(),i*50,j*50,null);
						break;
					case "SmallTree":
						graph.drawImage(generator.getSmallTree(),i*50,j*50,null);
						break;
					case "BigTree":
						graph.drawImage(generator.getBigTree(),i*50,j*50,null);
						break;
					case "Floor":
						graph.drawImage(generator.getFloor(),i*50,j*50,null);
						break;
					case "Barrel":
						graph.drawImage(generator.getBarrel(),i*50,j*50,null);
						break;
					case "Truck":
						graph.drawImage(generator.getTruck(),i*50,j*50,null);
						break;
					case "Rock":
						graph.drawImage(generator.getRock(),i*50,j*50,null);
						break;
					case "Car1":
						graph.drawImage(generator.getCar1(),i*50,j*50,null);
						break;
					case "Car2":
						graph.drawImage(generator.getCar2(),i*50,j*50,null);
						break;
					}
				}
			}
		}

		for(int i=0;i<15;i++) {
			for(int j=0;j<15;j++) {
				if(generator.fields[i][j].isNote()) {
					graph.drawImage(generator.getNote(),i*50,j*50,null);
				}
			}
		}
		
		graph.drawImage(player.getPlayerImage(),player.getPositionX()*50,player.getPositionY()*50,null);
		graph.drawImage(slender.getImage(),slender.getPositionX()*50,slender.getPositionY()*50,null);
		for(int i=0;i<15;i++) {
			for(int j=0;j<15;j++) {
				if(!generator.fields[i][j].isVisible()) {
					graph.drawImage(generator.getFog(),i*50,j*50,null);
				}
			}
		}
		graph.drawImage(note,0*1000,0*25,null);
		if(slender.getDead()) {
			graph.drawImage(generator.getDefeat(),0*750,0*750,null);
		}
		if(player.getNotes()==8) {
			graph.drawImage(generator.getVictory(),0*750,0*750,null);
		}
		
	}
}
/*	
	public void keyPressed(KeyEvent keystroke) {
		int key = keystroke.getKeyCode();

		
		if (key == KeyEvent.VK_W) {
			player.move('w',generator.fields[player.getPositionX()][player.getPositionY()-1].isBlock());
			slender.move(player.getPositionX(),player.getPositionY(),player.getNotes());
			generator.setVisibility(player.getPositionX(),player.getPositionY());
	        repaint();
		}

		if ( key == KeyEvent.VK_S) {
			player.move('s',generator.fields[player.getPositionX()][player.getPositionY()+1].isBlock());
			slender.move(player.getPositionX(),player.getPositionY(),player.getNotes());
			generator.setVisibility(player.getPositionX(),player.getPositionY());
		}

		if (key == KeyEvent.VK_A) {
			player.move('a',generator.fields[player.getPositionX()-1][player.getPositionY()].isBlock());
			slender.move(player.getPositionX(),player.getPositionY(),player.getNotes());
			generator.setVisibility(player.getPositionX(),player.getPositionY());
		}

		if (key == KeyEvent.VK_D) {
			player.move('d',generator.fields[player.getPositionX()][player.getPositionY()].isBlock());
			slender.move(player.getPositionX(),player.getPositionY(),player.getNotes());
			generator.setVisibility(player.getPositionX(),player.getPositionY());
		}
	}

	
} */
/*
public class Al extends KeyAdapter {

Player player;
Slender slender;
Generators generate;

	public void keyPressed(KeyEvent keystroke) {
		int key = keystroke.getKeyCode();

		
		if (keystroke.getKeyChar() == 'w') {
			player.move('w',generate.fields[player.getPositionX()][player.getPositionY()-1].isBlock());
			slender.move(player.getPositionX(),player.getPositionY(),player.getNotes());
			generate.setVisibility(player.getPositionX(),player.getPositionY());
		}

		if ( key == KeyEvent.VK_S) {
			player.move('s',generate.fields[player.getPositionX()][player.getPositionY()+1].isBlock());
			slender.move(player.getPositionX(),player.getPositionY(),player.getNotes());
			generate.setVisibility(player.getPositionX(),player.getPositionY());
		}

		if (key == KeyEvent.VK_A) {
			player.move('a',generate.fields[player.getPositionX()-1][player.getPositionY()].isBlock());
			slender.move(player.getPositionX(),player.getPositionY(),player.getNotes());
			generate.setVisibility(player.getPositionX(),player.getPositionY());
		}

		if (key == KeyEvent.VK_D) {
			player.move('d',generate.fields[player.getPositionX()][player.getPositionY()].isBlock());
			slender.move(player.getPositionX(),player.getPositionY(),player.getNotes());
			generate.setVisibility(player.getPositionX(),player.getPositionY());
		}
	}
	
}*/