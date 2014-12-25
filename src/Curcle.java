import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class Curcle {
	private int x;
	private int y;
	private int r;
	private boolean isfilled;
	private Color color;
	private int speedX;
	private int speedY;
	private Dimension windowDimension;

	public Curcle(int x, int y, int r, boolean isfilled, Color color,
			int speedX, int speedY, Dimension windowDimension) {
		this.x = x;
		this.y = y;
		this.r = r;
		this.isfilled = isfilled;
		this.color = color;
		this.speedX = speedX;
		this.speedY = speedY;
		this.windowDimension = windowDimension;
	}

	public void drow(Graphics g) {
		move();
		g.setColor(color);

		if (isfilled == true) {

			g.fillOval(x, y, r, r);
		} else {

			g.drawOval(x, y, r, r);
		}
	}

	private void move() {
		if (x < 0) {
			speedX *= -1;
		}
		if (x + r >= windowDimension.getWidth()) {
			speedX *= -1;
		}
		if (y < 0) {
			speedY *= -1;
		}
		if (y + r + 24 >= windowDimension.getHeight()) {
			speedY *= -1;
		}

		x = x + speedX;
		y = y + speedY;

	}

}
