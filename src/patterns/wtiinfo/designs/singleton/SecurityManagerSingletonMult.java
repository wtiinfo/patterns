package patterns.wtiinfo.designs.singleton;

public class SecurityManagerSingletonMult {

	private static SecurityManagerSingletonMult instance;

	private SecurityManagerSingletonMult() {
	}

	public static SecurityManagerSingletonMult getInstance() {

		if (instance == null) {
			synchronized (SecurityManagerSingletonMult.class) {
				if (instance == null) {
					instance = new SecurityManagerSingletonMult();
				}
			}
		}

		return instance;
	}

	public void imprimirObj() {
		System.out.println("Objeto SecurityManager: " + instance + "\n");
	}
}
