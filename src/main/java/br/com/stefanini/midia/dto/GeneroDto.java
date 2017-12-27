package br.com.stefanini.midia.dto;

import java.io.Serializable;

import br.com.stefanini.midia.model.Genero;

public class GeneroDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	
	public GeneroDto() {
		
	}
	
	public GeneroDto(Genero genero) {
		this.id = genero.getIdGenero();
		this.nome = genero.getNome();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
