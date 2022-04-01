package estrutura;

public class ContaPoupanca extends Conta{

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("\n=== Extrato Conta Poupança ===");
		super.imprimirInfComuns();
	}
	
}
