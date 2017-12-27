package br.com.stefanini.midia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.stefanini.midia.dto.FilmeDto;
import br.com.stefanini.midia.model.Filme;
import br.com.stefanini.midia.repository.FilmeRepository;
import br.com.stefanini.midia.utils.FilmeConversor;

@Service
public class FilmeService {
	
	@Autowired
	private FilmeRepository filmeRepository;
	
	
	public FilmeDto save(Filme filme) {
		return FilmeConversor.filmeModelParaDto(filmeRepository.save(filme));
	}
	
	public void delete(Long id) {
		Filme filme = this.findById(id);
		if( filme != null) {
			filmeRepository.delete(filme);
		}
	}
	
	
	public List<FilmeDto>buscarFilmesPorTitulo(String busca){
		busca = this.validarBusca(busca);
		return FilmeConversor.filmeModelParaDto(filmeRepository.findByTituloContaining(busca));
	}
	
	public List<FilmeDto>findAll(){
		return FilmeConversor.filmeModelParaDto(filmeRepository.findAll());			
	}
	
	public FilmeDto findByIdDto(Long id) {
		Filme filme = this.findById(id);
		if( filme != null) {
			return FilmeConversor.filmeModelParaDto(filme);
		}
		return null;
	}
	
	private Filme findById(Long id) {
		Optional<Filme> filme = filmeRepository.findById(id);
		return filme.isPresent() ? filme.get() : null;
	}
	
	private String validarBusca(String busca) {
		if(busca.equals("undefined")) {
			return "";
		}
		return busca;
	}
}
