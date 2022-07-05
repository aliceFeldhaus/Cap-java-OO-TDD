package decorator;

public class TestDecorator {
	
	public static void main(String[] args) {
		Funcionario f = new Funcionario("Jose", 10.50, 40);
		CalculoSalario c = new CalculoSalario();
		System.out.println(c.calculaSalario(f));
		
		Isalario decoratorSalario = new DecoratorSalario(new CalculoSalario());
		System.out.println(decoratorSalario.calculaSalario(f));
		
	}

}