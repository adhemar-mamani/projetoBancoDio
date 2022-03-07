
public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	public Cliente cliente;
	private static int SEQUENCIAL = 0;

	public Conta(Cliente cliente) {
	
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {

		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		
		saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		
		this.sacar(valor);
		contaDestino.depositar(valor);
		
		System.out.println("------ Origem ----- ");
		System.out.println(this.cliente.nome);
		System.out.println(this.cliente.cpf);
		System.out.println("Valor enviado: "+valor);
		System.out.println("----- Destino -----");
		System.out.println(contaDestino.cliente.nome);
		System.out.println(contaDestino.cliente.cpf);
		System.out.println("");

	}
	
	protected void imprimirInfoComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.nome));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	
	
}
