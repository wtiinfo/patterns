package patterns.wtiinfo.designs.factorymethod;

public enum Type {
	
	CIRCLE("circulo"), SQUARE("quadrado");
	
	private String value;
	
	Type(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
