package dao;

import java.util.List;

import entidades.Produto;
import interfaces.IDAO;

public class DaoProduto implements IDAO<Produto>{

	@Override
	public boolean salvar(Produto obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Produto getOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> getTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean alterar(Produto obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletar(int id) {
		// TODO Auto-generated method stub
		return false;
	}



}
