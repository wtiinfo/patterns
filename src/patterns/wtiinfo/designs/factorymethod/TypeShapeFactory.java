package patterns.wtiinfo.designs.factorymethod;

public class TypeShapeFactory {
	
	public static TypeShape newShape() {
		return new Circle();
	}
	
	public static TypeShape newShape(int i) {
		if(i == 1) {
			return new Circle();
		} else if(i == 2) {
			return new Square();
		} else {
			return null;
		}
	}
	
	public static TypeShape newShape(Type type) {
		if(type.getValue().equals("circulo")) {
			return new Circle();
		} else if(type.getValue().equals("quadrado")) {
			return new Square();
		} else {
			return null;
		}
	}

}
