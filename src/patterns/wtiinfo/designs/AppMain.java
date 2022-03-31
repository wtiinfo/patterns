package patterns.wtiinfo.designs;

import patterns.wtiinfo.designs.patterns.SecurityManagerSingleton;

public class AppMain {

	public static void main(String[] args) {
		SecurityManagerSingleton sms1 = SecurityManagerSingleton.getInstance();
		sms1.imprimirObj();
		
		SecurityManagerSingleton sms2 = SecurityManagerSingleton.getInstance();
		sms2.imprimirObj();
	}

}
