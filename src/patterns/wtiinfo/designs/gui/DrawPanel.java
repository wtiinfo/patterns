package patterns.wtiinfo.designs.gui;

import java.awt.Graphics;

import javax.swing.JPanel;

import patterns.wtiinfo.designs.abstractfactory.TypeShape;
import patterns.wtiinfo.designs.decorator.Shape;

@SuppressWarnings("serial")
public class DrawPanel extends JPanel {

	private TypeShape shape;
	
	private Shape shapeDecorator;
	
	public void drawShape(TypeShape shape) {
		this.shape = shape;
		repaint();
	}
	
	public void drawShapeDecorator(Shape shapeDecorator) {
		this.shapeDecorator = shapeDecorator;
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		if(shapeDecorator != null) {
			shapeDecorator.draw(g);
		}
	}
	
	public void paintDecorator(Graphics g) {
		if(shapeDecorator != null) {
			shapeDecorator.draw(g);
		}
	}

}
