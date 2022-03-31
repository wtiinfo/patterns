package patterns.wtiinfo.designs.singleton;

public class SecurityManagerSingleton {

	private static SecurityManagerSingleton instance;
	
	private SecurityManagerSingleton() {}
	
	public static SecurityManagerSingleton getInstance() {
		
		if(instance == null) {
			instance = new SecurityManagerSingleton();
		}
		
		return instance;
	}
	
	public void imprimirObj() {
		System.out.println("Objeto SecurityManager: " + instance +"\n");
	}
}
