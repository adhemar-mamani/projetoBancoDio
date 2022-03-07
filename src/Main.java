
public class Main {

	public static void main(String[] args) {

		


		Cliente adhemar = new Cliente();
		adhemar.setNome("Adhemar");
		adhemar.setCpf("123.456.789-00");
		Cliente isabella = new Cliente();
		isabella.setNome("Isabella");
		isabella.setCpf("987.654.321.11");
		
		Conta cc = new ContaCorrente(adhemar);
		Conta contaPoupanca = new ContaPoupanca(isabella);
		
		cc.depositar(100);
		
		
		contaPoupanca.depositar(20);


		cc.imprimirExtrato();
		
		cc.transferir(100, contaPoupanca);
		
		contaPoupanca.imprimirExtrato();

	}

}
