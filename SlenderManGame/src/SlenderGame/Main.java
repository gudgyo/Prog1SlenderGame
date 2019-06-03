package SlenderGame;
/*
 *@author Gudmon Gyorgy
 *@neptun XZT19N
 *@feladat 3. feladat - JSlender: The eight pages
 */
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
			JFrame Window = new JFrame();
					Window.add(new Game());
					Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					Window.setSize(750,750);
					Window.setVisible(true);
					Window.setTitle("Slender Game");
					
	}
}
