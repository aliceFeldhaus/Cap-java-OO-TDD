package crud;

import java.util.List;

import dao.DaoUsuario;
import entidades.Usuarios;

public class Crud {

	public static void main(String[] args) {
		// chamaSalvar();
		// chamaBuscaPorId();
		// chamarPegarTodos();
		// chamarDelete();
		 chamarUpdate();
	}

	//SALVAR
	
	public static void chamaSalvar() {
		Usuarios us = new Usuarios();

		us.setNome("Mario Silva");
		us.setEmail("mario@gmail.com");

		DaoUsuario du = new DaoUsuario();

		if (du.salvar(us)) {
			System.out.println("Usuario salvo com sucesso!");
		}

	}

	//PESQUISAR UM
	
	public static void chamaBuscaPorId(int id) {
		Usuarios us = new DaoUsuario().getOne(2);
		if(us != null) {
			System.out.println(us.toString());
		}
	}

	//PESQUISAR TODOS
	
	public static void chamarPegarTodos() {
		List<Usuarios> lista = new DaoUsuario().getTodos();
		for(Usuarios us : lista) {
			System.out.println(us.toString());
		}
	}

	//DELETAR
	
	public static void chamarDelete() {
		if(new DaoUsuario().deletar(4)) {
			System.out.println("Registro excluido com sucesso");
		}
	}

	//ALTERAR
	
	public static void chamarUpdate() {
		Usuarios us = new DaoUsuario().getOne(5);
		if (us != null) {
			System.out.println(us.toString());
		}
		
		us.setNome("Mario Pedroso");
		us.setEmail("mario@gmail.com");
		
		if(new DaoUsuario().alterar(us)) {
			System.out.println("Registro alterado com sucesso");
		}
		
		Usuarios us2 = new DaoUsuario().getOne(5);
		if(us != null) {
			System.out.println(us2.toString());
		}
	}

}
