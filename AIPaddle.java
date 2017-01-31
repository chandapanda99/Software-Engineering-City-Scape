import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.*;

public class AIPaddle {

	int x;
	int y;
	int width = 20;
	int height = 100;
	double speed = 35;
	Random generator = new Random();

	boolean isTwoPlayer = false;

	Rectangle boundingBox;

	boolean goingUp = false;
	boolean goingDown = false;

	public AIPaddle(int x, int y) {
		this.x = x;
		this.y = y;

		boundingBox = new Rectangle(x, y, width, height);
		boundingBox.setBounds(x, y, width, height);
	}

	public void tick(Game game) {
		boundingBox.setBounds(x, y, width, height);

		if (!isTwoPlayer) {
			if (game.ball.y < y && y >= 0) {
				y -= speed;
			} else if (game.ball.y > y && y + height <= game.getHeight()) {
				y += speed;
			}
		} 
		else {
			if (goingUp) {
				y -= speed;
			} 
			else if (goingDown) {
				y += speed;
			}
		}
	}

	public void render(Graphics g) {
		g.setColor(new Color(generator.nextInt(256), generator.nextInt(256), generator.nextInt(256)));
		g.fillRect(x, y, width, height);
	}

}
