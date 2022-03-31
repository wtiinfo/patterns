package patterns.wtiinfo.designs;

import patterns.wtiinfo.designs.factorymethod.TypeShape;
import patterns.wtiinfo.designs.factorymethod.TypeShapeFactory;
import patterns.wtiinfo.designs.factorymethod.gui.Window;
import patterns.wtiinfo.designs.singleton.SecurityManagerSingleton;

public class AppMain {

	public static void main(String[] args) {
		SecurityManagerSingleton sms = SecurityManagerSingleton.getInstance();
		sms.imprimirObj();
		
		Window w = new Window("Type Shape: FactoryMethod", 300, 300);
		w.show();
		
		TypeShape shape = TypeShapeFactory.newShape();
		
		w.drawShape(shape);
	}

}
