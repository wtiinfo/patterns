package patterns.wtiinfo.designs.templatemethod;

public abstract class Bebida {

	public void preparar() {
		
		adicionarAgua();
		
		adicionarSabor();
		
		if(porAcucar()) {
			adicionarAcucar();
		}
		
		misturar();
	}
	
	public abstract void adicionarAgua();
	public abstract void adicionarSabor();
	public abstract boolean porAcucar();
	public abstract void adicionarAcucar();
	public abstract void misturar();
}
