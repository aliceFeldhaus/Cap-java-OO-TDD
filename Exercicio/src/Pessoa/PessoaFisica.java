package Pessoa;

public class PessoaFisica extends Pessoa{

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(cpf.length() == 11) {
			this.cpf = cpf;
		}
		else {
			System.out.println("CPF invalido");
		}
	}
	
	public void display() {
		super.display();
		System.out.println("CPF: " + this.cpf);
	}

	public PessoaFisica(int id, String nome, String contato, String cpf) {
		super(id, nome, contato);
		this.setCpf(cpf);
	}
}
