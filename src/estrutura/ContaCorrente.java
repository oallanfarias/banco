package estrutura;

public class ContaCorrente extends Conta{

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("\n=== Extrato Conta Corrente ===");
		super.imprimirInfComuns();
	}



}
