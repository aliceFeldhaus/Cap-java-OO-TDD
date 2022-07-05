package openclose;

public class PessoaJuridica extends PessoaOpenClose {

	@Override
	public void validaIdentificacao() {
		System.out.println("valida cnpj");
	}

}
