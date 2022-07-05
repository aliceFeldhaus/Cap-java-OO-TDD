package com.aulas.mvc.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String titulo;
	
	@ManyToMany
	private List<Autores> Autores;

	
	public Livro(int id, String titulo, List<com.aulas.mvc.entidades.Autores> autores) {
		this.id = id;
		this.titulo = titulo;

		Autores = autores;
	}

	public Livro() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Autores> getAutores() {
		return Autores;
	}

	public void setAutores(List<Autores> autores) {
		Autores = autores;
	}

}
