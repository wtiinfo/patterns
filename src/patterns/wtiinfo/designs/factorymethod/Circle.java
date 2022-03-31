package patterns.wtiinfo.designs.factorymethod;

import java.awt.Graphics;

public class Circle extends TypeShape {

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.fillOval(0, 0, 50, 50);
	}

}
