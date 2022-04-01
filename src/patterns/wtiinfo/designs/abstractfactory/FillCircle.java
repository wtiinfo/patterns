package patterns.wtiinfo.designs.abstractfactory;

import java.awt.Graphics;

public class FillCircle extends TypeShape {

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.fillOval(0, 0, 50, 50);
	}

}
