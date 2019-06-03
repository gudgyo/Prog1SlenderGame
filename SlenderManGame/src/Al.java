/*package SlenderGame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Al extends KeyAdapter {


	public void keyPressed(KeyEvent keystroke) {
		int key = keystroke.getKeyCode();

		
		if (key == KeyEvent.VK_W) {
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
} */