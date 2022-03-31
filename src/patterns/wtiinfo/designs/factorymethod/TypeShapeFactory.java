package patterns.wtiinfo.designs.factorymethod;

public class TypeShapeFactory {
	
	public static TypeShape newShape() {
		return new Square();
	}

}
