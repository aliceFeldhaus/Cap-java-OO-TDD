package factorymathd;

public class FactoryMethod {

	public static IImposto getImposto(Eimposto imposto) {
		if (imposto == Eimposto.ICMS) {
			return new Icms();
		} else if (imposto == Eimposto.IPI) {
			return new Ipi();
		}

		return null;
	}
}
