package br.com.stefanini.midia.utils;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.midia.dto.GeneroDto;
import br.com.stefanini.midia.model.Genero;


public class GeneroConversor {
	public static GeneroDto generoModelParaDto(Genero genero) {
		return new GeneroDto(genero);
	}

	public static List<GeneroDto> generoModelParaDto(List<Genero> generos) {
		List<GeneroDto> generosDto = new ArrayList<GeneroDto>();
		generos.forEach(genero -> {
			generosDto.add(generoModelParaDto(genero));
		});
		return generosDto;
	}
	
	

	public static Genero generoDtoParaModel(GeneroDto generoDto) {
		return new Genero(generoDto);
	}

	public static List<Genero> filmeDtoParaModel(List<GeneroDto> generosDto) {
		List<Genero> generos = new ArrayList<>();
		generosDto.forEach(genero -> {
			generos.add(generoDtoParaModel(genero));
		});
		return generos;
	}
}
