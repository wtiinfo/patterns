package patterns.wtiinfo.designs.abstractfactory;

import java.awt.Graphics;

public class FillSquare extends TypeShape {

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.fillRect(0, 0, 100, 100);
	}

}
