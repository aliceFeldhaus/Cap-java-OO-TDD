package com.aulas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.aulas.entidades.Usuarios;
import com.aulas.interfaces.IDAO;
import com.aulas.utilidades.Conexao;

public class DaoUsuario implements IDAO<Usuarios>{

	//SALVAR
	
	@Override
	public boolean salvar(Usuarios obj) {
		String sql = "insert into usuarios(nome, email) values (?,?)";
		Connection con = Conexao.conectar();
		
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, obj.getNome());
			stm.setString(2, obj.getEmail());
			stm.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Conexao.closeConexao();
		}
		
		return true;
	}

	//PESQUISAR UM
	
	@Override
	public Usuarios getOne(int id) {
		Usuarios us = null;
		
		String sql = "select * from usuarios where id = ?";
		Connection con = Conexao.conectar();
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setInt(1,  id);
			ResultSet rs = stm.executeQuery();
			
			if (rs.next()) {
				us = new Usuarios();
				us.setId(rs.getInt("id"));
				us.setNome(rs.getString("nome"));
				us.setEmail(rs.getString("email"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Conexao.closeConexao();
		}
		
		return us;
	}

	//PESQUISAR TODOS
	
	@Override
	public List<Usuarios> getTodos() {
		List<Usuarios> lista = new ArrayList<Usuarios>();
		Connection con = Conexao.conectar();
		
		try {
			PreparedStatement stm = con.prepareStatement("select * from usuarios");
			ResultSet rs = stm.executeQuery();
			
			while (rs.next()) {
				Usuarios us = new Usuarios();
				us.setId(rs.getInt("id"));
				us.setNome(rs.getString("nome"));
				us.setEmail(rs.getString("email"));
				lista.add(us);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Conexao.closeConexao();
		}
		
		return lista;
	}

	//ALTERAR
	
	@Override
	public boolean alterar(Usuarios obj) {
		String sql = "update usuarios set nome = ?, email = ? where id = ?";
		Connection con = Conexao.conectar();
		
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, obj.getNome());
			stm.setString(2, obj.getEmail());
			stm.setInt(3, obj.getId());
			
			stm.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Conexao.closeConexao();
		}
		
		return true;
	}

	//DELETAR
	
	@Override
	public boolean deletar(int id) {
		Connection con = Conexao.conectar();
		
		try {
			PreparedStatement stm = con.prepareStatement("delete from usuarios where id = ?");
			stm.setInt(1, id);
			stm.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Conexao.closeConexao();
		}
		
		
		return false;
	}

	

}