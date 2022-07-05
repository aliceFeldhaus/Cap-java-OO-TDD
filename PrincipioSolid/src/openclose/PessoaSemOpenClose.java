package openclose;

public class PessoaSemOpenClose {

	String nome;
	String identificacao;
	
	public void validaIdentificacao() {
		
		if(this.identificacao.length() == 11) {
			System.out.println("valida cpf");
		}
		
		if(this.identificacao.length() == 14) {
			System.out.println("valida cnpj");
		}
		
	}
	
}
