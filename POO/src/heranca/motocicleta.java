package heranca;

public class motocicleta extends veiculo{

	private int cilindradas;

	
	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return "veiculo [marca=" + this.getMarca() + ", modelo=" + this.getModelo() + ", placa=" + this.getPlaca() + ", cilindradas=" + this.getCilindradas() + "]";
	}	
	
	public void imprimirDados() {
		System.out.println("Cilindradas: " + this.cilindradas);
	}
}
