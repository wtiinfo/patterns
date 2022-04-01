package patterns.wtiinfo.designs.abstractfactory;

import java.awt.Graphics;

public class NotFillSquare extends TypeShape {

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.drawRect(0, 0, 100, 100);
	}

}
