package patterns.wtiinfo.designs.abstractfactory;

import java.awt.Graphics;

public class NotFillCircle extends TypeShape {

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.drawOval(0, 0, 50, 50);
	}

}
