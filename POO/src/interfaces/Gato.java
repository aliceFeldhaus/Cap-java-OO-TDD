package interfaces;

public class Gato implements IAnimal, IMamifero{
	
	public void saltar() {
		System.out.println("Saltar do gato");
	}

	@Override
	public void sleep() {
		System.out.println("zzzzzz");
	}

	@Override
	public void barulho() {
		System.out.println("miau miau");
	}

	@Override
	public void qtdePatas(int qtdePatas) {
		System.out.println(qtdePatas);
	}

}
