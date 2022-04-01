package patterns.wtiinfo.designs.abstractfactory;

public class TypeShapeFactoryProducer {

	public static TypeShapeAbstractFactory getFactory(boolean fill) {
		// O ideal aqui seria usar Singleton para estas instancias
		if(fill) {
			return new FillTypeShapeFactory();
		} else {
			return new NotFillTypeShapeFactory();
		}
	}
}
