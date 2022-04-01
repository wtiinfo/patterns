package patterns.wtiinfo.designs.factorymethod;

public class TypeShapeFactory {
	
	public static TypeShape newShape() {
		try {
			String shapeClass = Props.getString("shapeClass");
			@SuppressWarnings("deprecation")
			TypeShape shape = (TypeShape) Class.forName(shapeClass).newInstance();
			String[] color = Props.getString("color").split(",");
			shape.defineColor(Integer.parseInt(color[0]), Integer.parseInt(color[1]), Integer.parseInt(color[2]));
			
			return shape;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			throw new RuntimeException();
		}
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
