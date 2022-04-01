package patterns.wtiinfo.designs.abstractfactory;

public class FillTypeShapeFactory extends TypeShapeAbstractFactory {

	@Override
	public TypeShape newShape(String type) {
		if(type.equals("circle")) {
			return new FillCircle();
		} else if(type.equals("square")) {
			return new FillSquare();
		} 
		return null;
	}
}
