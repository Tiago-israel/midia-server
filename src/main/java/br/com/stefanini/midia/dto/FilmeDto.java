package br.com.stefanini.midia.dto;

import java.io.Serializable;

import br.com.stefanini.midia.model.Filme;
import br.com.stefanini.midia.utils.GeneroConversor;

public class FilmeDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idFilme;
	private String titulo;
	private Integer duracao;
	private GeneroDto genero;

	public FilmeDto() {

	}

	public FilmeDto(Filme filme) {
		this.idFilme = filme.getIdFilme();
		this.titulo = filme.getTitulo();
		this.duracao = filme.getDuracao();
		this.genero = GeneroConversor.generoModelParaDto(filme.getGenero());
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

	public GeneroDto getGenero() {
		return genero;
	}

	public void GeneroDto(GeneroDto genero) {
		this.genero = genero;
	}

}
