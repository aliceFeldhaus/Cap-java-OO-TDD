package iversaodependencia;

public class InversaoControle {

	public static void main(String[] args) {
		Conexao con = new Conexao();
		Contato ct = new Contato();
		ct.salvar(con);		
		
		DBOracle dbcon = new DBOracle();
		Contato ct2 = new Contato();
	}
}
