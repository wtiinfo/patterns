package patterns.wtiinfo.designs;

import patterns.wtiinfo.designs.abstractfactory.TypeShape;
import patterns.wtiinfo.designs.abstractfactory.TypeShapeAbstractFactory;
import patterns.wtiinfo.designs.abstractfactory.TypeShapeFactoryProducer;
import patterns.wtiinfo.designs.adapter.MicroSDClassAdapter;
import patterns.wtiinfo.designs.adapter.MicroSDObjectAdapter;
import patterns.wtiinfo.designs.adapter.USB;
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
		
		MicroSDClassAdapter  adapter = new MicroSDClassAdapter();
		adapter.setBytes((byte) 10);
		System.out.println(adapter.getBytes());
		System.out.println(adapter.getValueInByte() + "\n");
		
		USB usb = new USB();
		usb.setBytes((byte) 20);
		MicroSDObjectAdapter object = new MicroSDObjectAdapter(usb);
		System.out.println(object.getBytes());
		System.out.println(usb.getBytes());
	}

}
