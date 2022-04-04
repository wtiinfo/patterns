package patterns.wtiinfo.designs.templatemethod;

public class Suco extends Bebida{

	@Override
	public void adicionarAgua() {
		System.out.println("Adicionando �gua");
	}

	@Override
	public void adicionarSabor() {
		System.out.println("Adicionando o sabor do suco");
	}

	@Override
	public boolean porAcucar() {
		return true;
	}

	@Override
	public void adicionarAcucar() {
		System.out.println("Adicionando a�ucar ao suco");
	}

	@Override
	public void misturar() {
		System.out.println("Misturando os ingredientes");
	}

}
