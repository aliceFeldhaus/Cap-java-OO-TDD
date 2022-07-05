package iversaodependencia.solucao;

public class ContatoComAbstracao {

	public void salvar(IDBconexao con) {
    	con.conectar();
    	System.out.println("Salvar");
    }
	
}
