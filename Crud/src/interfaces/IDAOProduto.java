package interfaces;

import java.util.List;

import entidades.Produto;

public interface IDAOProduto {

	boolean salvar(Produto ct);
	Produto getProduto(int id);
	List<Produto> getProduto();
	boolean alterar(Produto ct);
	boolean deletar(int id);
	
}
