package estrutura;

public class main {
	
	public static void main (String[] args) {
		Conta cc = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();
		
		cc.depositar(100);
		cc.transferir(95, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}


}
