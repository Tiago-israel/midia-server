package br.com.stefanini.midia.utils;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.midia.dto.FilmeDto;
import br.com.stefanini.midia.model.Filme;

public class FilmeConversor {

	public static FilmeDto filmeModelParaDto(Filme filme) {
		return new FilmeDto(filme);
	}

	public static List<FilmeDto> filmeModelParaDto(List<Filme> filmes) {
		List<FilmeDto> filmesDto = new ArrayList<FilmeDto>();
		filmes.forEach(filme -> {
			filmesDto.add(filmeModelParaDto(filme));
		});
		return filmesDto;
	}
	
	

	public static Filme filmeDtoParaModel(FilmeDto filmeDto) {
		return new Filme(filmeDto);
	}

	public static List<Filme> filmeDtoParaModel(List<FilmeDto> filmesDto) {
		List<Filme> filmes = new ArrayList<>();
		filmesDto.forEach(filme -> {
			filmes.add(filmeDtoParaModel(filme));
		});
		return filmes;
	}
}
