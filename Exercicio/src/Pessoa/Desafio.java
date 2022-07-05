package Pessoa;

public class Desafio {

	public static void main(String[] args) {
	
		/* PessoaFisica pf = new PessoaFisica();
		pf.setId(10);
		pf.setNome("Maria");
		pf.setContato("23456789");
		pf.setCpf("12345678910");
		pf.display(); */

		PessoaFisica pf2 = new PessoaFisica (2, "Jose", "jose@gmail.com", "12312312312");
		pf2.display();
		
		/* PessoaJuridica pj = new PessoaJuridica();
		pj.setId(11);
		pj.setNome("Maria");
		pj.setContato("23456789");
		pj.setCnpj("12345678910");
		pj.display(); */
		
		PessoaJuridica pj2 = new PessoaJuridica(1, "Google", "google.com", "1234004");
		pj2.display();
		
		
	}

}
