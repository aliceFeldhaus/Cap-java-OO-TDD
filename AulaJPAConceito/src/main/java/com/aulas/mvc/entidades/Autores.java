package com.aulas.mvc.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Autores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	
	@ManyToMany( mappedBy = "Autores" )
	private List<Livro> livro;

	public Autores(int id, String nome, List<Livro> livro) {
		this.id = id;
		this.nome = nome;
		this.livro = livro;
	}
	
	public Autores(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Autores() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Livro> getLivro() {
		return livro;
	}

	public void setLivro(List<Livro> livro) {
		this.livro = livro;
	}

}
