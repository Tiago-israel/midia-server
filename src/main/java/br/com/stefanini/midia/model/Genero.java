package br.com.stefanini.midia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.stefanini.midia.dto.GeneroDto;

@Entity
@Table
public class Genero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_genero")
	private Long idGenero;
	@Column
	private String nome;
	@OneToMany(mappedBy = "genero", cascade = CascadeType.ALL)
	private List<Filme> filmes;
	
	public Genero() {
		
	}

	public Genero(GeneroDto generoDto) {
		this.idGenero = generoDto.getId();
		this.nome = generoDto.getNome();
	}

	public Long getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(Long idGenero) {
		this.idGenero = idGenero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}

}
