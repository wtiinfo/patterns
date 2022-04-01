package patterns.wtiinfo.designs;

import patterns.wtiinfo.designs.abstractfactory.TypeShape;
import patterns.wtiinfo.designs.abstractfactory.TypeShapeAbstractFactory;
import patterns.wtiinfo.designs.abstractfactory.TypeShapeFactoryProducer;
import patterns.wtiinfo.designs.factorymethod.gui.Window;
import patterns.wtiinfo.designs.singleton.SecurityManagerSingleton;

public class AppMain {

	public static void main(String[] args) {
		SecurityManagerSingleton sms = SecurityManagerSingleton.getInstance();
		sms.imprimirObj();
		
		Window w = new Window("Type Shape: Abstract Factory", 400, 400);
		w.show();
		
		TypeShapeAbstractFactory factory = TypeShapeFactoryProducer.getFactory(false);
		TypeShape shape = factory.newShape("circle");
		
		w.drawShape(shape);
	}

}
