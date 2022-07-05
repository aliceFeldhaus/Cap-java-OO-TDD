import entidades.Pessoa;
import entidades.calculadora;
import heranca.motocicleta;
import heranca.veiculo;

public class Poo {

	public static void main(String[] args) {
		// criaPessoa();
		// criaObjetoCalculadora();
		// criaObjetoVeiculo();
		criaObjetoMotocicleta();
	}
	
	public static void criaObjetoMotocicleta() {
		motocicleta m1 = new motocicleta();
		m1.setCilindradas(190);
		m1.setMarca("Honda");
		m1.setModelo("XRE");
		m1.setPlaca("MFY2345");
		
		//System.out.println(m1.toString());
		m1.imprimirDados();
		
		
	}
	
	public static void criaObjetoVeiculo() {
		veiculo v1 = new veiculo("Chevrolet", "Corsa", "HRD1234");
		System.out.println(v1.toString());
	}
	
 	public static void criaObjetoCalculadora() {
		calculadora c1 = new calculadora();
		
		c1.x = 1000;
		c1.y = 20;
		
		int[] array1 = {10,20,30,40};
		
		System.out.println(c1.soma());
		System.out.println(c1.soma(300, 281));
		System.out.println(c1.soma(array1));
		
	}
	
	public static void criaPessoa() {
		Pessoa obj = new Pessoa();
		
		/*
		obj.setNome("Alice");
		obj.setEmail("alice@gmail.com");
		obj.setCpf("12345678910");

		System.out.println(obj.getNome());
		System.out.println(obj.getEmail());
		System.out.println(obj.getCpf());
		*/
		
		Pessoa obj1 = new Pessoa("Alice", "alice@gmail.com", "12345678910");
		System.out.println(obj1.getNome());
		System.out.println(obj1.getEmail());
		System.out.println(obj1.getCpf());
	}

}
