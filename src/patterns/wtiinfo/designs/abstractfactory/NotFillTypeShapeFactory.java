package patterns.wtiinfo.designs.abstractfactory;

public class NotFillTypeShapeFactory extends TypeShapeAbstractFactory {

	@Override
	public TypeShape newShape(String type) {
		if(type.equals("circle")) {
			return new NotFillCircle();
		} else if(type.equals("square")) {
			return new NotFillSquare();
		} 
		return null;
	}
}
