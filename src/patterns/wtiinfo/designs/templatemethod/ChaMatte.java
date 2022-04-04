package patterns.wtiinfo.designs.templatemethod;

public class ChaMatte extends Bebida{

	@Override
	public void adicionarAgua() {
		System.out.println("Adicionando �gua fervida ao ch�");
	}

	@Override
	public void adicionarSabor() {
		System.out.println("Adicionando erva matte");
	}

	@Override
	public boolean porAcucar() {
		return false;
	}

	@Override
	public void adicionarAcucar() {
	}

	@Override
	public void misturar() {
		System.out.println("Misturando os ingredientes");
	}

}
