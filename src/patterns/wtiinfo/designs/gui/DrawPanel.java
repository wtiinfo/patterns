package patterns.wtiinfo.designs.gui;

import java.awt.Graphics;

import javax.swing.JPanel;

import patterns.wtiinfo.designs.abstractfactory.TypeShape;

@SuppressWarnings("serial")
public class DrawPanel extends JPanel {

	private TypeShape shape;
	
	public void drawShape(TypeShape shape) {
		this.shape = shape;
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		if(shape != null) {
			shape.draw(g);
		}
	}

}
