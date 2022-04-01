package patterns.wtiinfo.designs;

import patterns.wtiinfo.designs.abstractfactory.TypeShape;
import patterns.wtiinfo.designs.abstractfactory.TypeShapeAbstractFactory;
import patterns.wtiinfo.designs.abstractfactory.TypeShapeFactoryProducer;
import patterns.wtiinfo.designs.adapter.MicroSDClassAdapter;
import patterns.wtiinfo.designs.adapter.MicroSDObjectAdapter;
import patterns.wtiinfo.designs.adapter.USB;
import patterns.wtiinfo.designs.composite.Rectangle;
import patterns.wtiinfo.designs.composite.SceneGroupComposite;
import patterns.wtiinfo.designs.composite.Triangle;
import patterns.wtiinfo.designs.gui.Window;
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
		System.out.println(usb.getBytes() + "\n");
		
		SceneGroupComposite groupRoot = new SceneGroupComposite();
		SceneGroupComposite groupOne = new SceneGroupComposite();
		SceneGroupComposite groupTwo = new SceneGroupComposite();
		
		groupRoot.add(new Triangle());
		groupRoot.add(groupOne);
		
		groupOne.add(new Triangle());
		groupOne.add(new Rectangle());
		
		groupTwo.add(new Rectangle());
		groupTwo.add(new Rectangle());
		
		groupOne.add(groupTwo);
		
		groupRoot.draw();
		
	}

}
