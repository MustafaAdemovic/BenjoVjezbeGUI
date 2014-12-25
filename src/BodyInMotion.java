

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class BodyInMotion extends JPanel{
	int frame = 0;

	public static void main(String[] args) {
		JFrame window = new JFrame("New Window");

		Jesenko drawPanel = new Jesenko(new Dimension(600,400));
		window.setContentPane(drawPanel);
		drawPanel.repaint();

		window.setSize(600, 400);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		Timer time = new Timer(10, drawPanel);
		time.start();

	}



}
