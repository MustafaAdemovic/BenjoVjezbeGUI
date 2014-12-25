import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Jesenko extends JPanel implements ActionListener {
	Dimension windowSize;
	Curcle curcle1;
	Curcle curcle2;

	public Jesenko(Dimension windowSize ) {
		this.windowSize = windowSize;
		curcle1 = new Curcle(100, 170, 59, true, Color.BLUE, 1, 2, windowSize);
		curcle2 = new Curcle(360, 250, 69, false, Color.GREEN, 1, 3, windowSize);

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		curcle1.drow(g);
		curcle2.drow(g);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		repaint();

	}

}
