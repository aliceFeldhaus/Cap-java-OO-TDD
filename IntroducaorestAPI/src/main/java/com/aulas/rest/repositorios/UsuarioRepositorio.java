package com.aulas.rest.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulas.rest.entidades.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{

	
	
}
