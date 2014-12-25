import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Zadatak: Napraviti prozor proizvoljnih dimenzija u koji se iscrta
 * pravougaonik proizvoljnih dimenzija
 * 
 * @author mustafaademovic
 *
 */

public class WriteSomething extends JPanel{

	public static void main(String[] args) {
		JFrame window = new JFrame("WriteSomething");//Pravimo prozor
		WriteSomething write = new WriteSomething();
		
		window.setContentPane(new WriteSomething());
		write.repaint();//Ispisuje pravougaonika u programu
		
		window.setSize(640, 480);//Dimenzije prozora
		window.setLocation(0, 0);//Koordinate prozora
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Kada kliknemo na x da izađemo iz programa i prekine program s radom
		window.setVisible(true);//Postavljamo prozor da je vidljiv

	}//Kraj maina

	/**
	 * Ova metoda ispisuje u prozoru pravougaonik na kooridnatama x 50 i y 50
	 * dimenzije 100 x 150 svaki put ispisuje ranodm boju
	 */
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.setColor(new Color((float)Math.random(),(float)Math.random(),(float)Math.random(),(float)Math.random()));
		g.fillRect(50, 50, 100, 150);
	}//Kraj metode paintComponent

}//Kraj klase WriteSomething
