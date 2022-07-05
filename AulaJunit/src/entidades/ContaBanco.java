package entidades;

public class ContaBanco {

	private int id;
	private double saldo;

	//metodos
	public void sacar(double valor) throws Exception {
		if (valor > saldo) {
			throw new Exception("Saldo insuficiente");
		}
		saldo -= valor;
	}
	
	public void depositar(double valor) throws Exception {
		if(valor < 0) {
			throw new Exception("O deposito não pode ser negativo");
		}
		saldo += valor;
	}
	
	public ContaBanco(int id, double saldo) {
		this.id = id;
		this.saldo = saldo;
	}

	public ContaBanco() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
}
