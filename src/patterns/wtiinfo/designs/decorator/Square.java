package patterns.wtiinfo.designs.decorator;

import java.awt.Graphics;

public class Square implements Shape{

	@Override
	public void draw(Graphics g) {
		g.drawRect(0, 0, 50, 50);
	}

}
