package factorymathd;

public class TesteFactory {

	public static void main(String[] args) {
		/*Icms icms = new Icms();
		icms.calcular(500);
		
		Ipi ipi = new Ipi();
		ipi.calcular(500);*/
		
		IImposto icms = FactoryMethod.getImposto(Eimposto.ICMS);
		icms.calcular(500);
		
		IImposto ipi = FactoryMethod.getImposto(Eimposto.IPI);
		ipi.calcular(500);

	}

}
