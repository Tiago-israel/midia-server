package br.com.stefanini.midia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.stefanini.midia.dto.GeneroDto;
import br.com.stefanini.midia.model.Genero;
import br.com.stefanini.midia.repository.GeneroRepository;
import br.com.stefanini.midia.utils.GeneroConversor;

@Service
public class GeneroService {

	@Autowired
	private GeneroRepository generoRepository;
	
	public void save(GeneroDto genero) {
		generoRepository.save(GeneroConversor.generoDtoParaModel(genero));
	}
	
	public void delete(Long id) {
		Genero genero = findById(id);
		if(genero != null) {
			generoRepository.delete(genero);
		}
	}
	
	public List<GeneroDto> findAll(){
		return GeneroConversor.generoModelParaDto(generoRepository.findAll());
	}
	
	public Genero findById(Long id) {
		Optional<Genero> genero = generoRepository.findById(id);
		return genero.isPresent() ? genero.get() : null;
	}
}
