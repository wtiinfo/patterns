package patterns.wtiinfo.designs.factorymethod;

import java.awt.Graphics;

public class Square extends TypeShape {

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.fillRect(0, 0, 100, 100);
	}

}
