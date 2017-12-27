package br.com.stefanini.midia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.stefanini.midia.dto.FilmeDto;
import br.com.stefanini.midia.utils.GeneroConversor;

@Entity
@Table(name = "filme")
public class Filme {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_filme")
	private Long idFilme;
	@Column
	private String titulo;
	@Column
	private Integer duracao;

	@JoinColumn(name = "genero_id", referencedColumnName = "id_genero")
	@ManyToOne()
	private Genero genero;

	public Filme() {

	}

	public Filme(String titulo, Integer duracao, Genero genero) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.genero = genero;
	}

	public Filme(FilmeDto filmeDto) {
		this.idFilme = filmeDto.getIdFilme();
		this.titulo = filmeDto.getTitulo();
		this.duracao = filmeDto.getDuracao();
		this.genero = GeneroConversor.generoDtoParaModel(filmeDto.getGenero());
	}

	public Long getIdFilme() {
		return idFilme;
	}

	public void setIdFilme(Long idFilme) {
		this.idFilme = idFilme;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

}
