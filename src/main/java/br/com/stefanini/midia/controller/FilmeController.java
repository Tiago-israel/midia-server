package br.com.stefanini.midia.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.stefanini.midia.dto.FilmeDto;
import br.com.stefanini.midia.service.FilmeService;
import br.com.stefanini.midia.utils.FilmeConversor;

@CrossOrigin
@RestController
@RequestMapping("midia/api/filmes")
public class FilmeController {
	
	@Autowired
	private FilmeService filmeService;
	
	@GetMapping
	public List<FilmeDto>findAll(Pageable pageable){
		return filmeService.findAll(pageable);
	}
	
	@GetMapping("/busca/{nome}")
	public List<FilmeDto>buscarFilmesPorTitulo(@PathVariable("nome") Optional<String> busca){
		return filmeService.buscarFilmesPorTitulo(busca.get());
	}
	
	@GetMapping("/{id}")
	public FilmeDto FilmeDtofindById(@PathVariable("id") Long id){
		return filmeService.findByIdDto(id);
	}
	
	@PostMapping
	public FilmeDto save(@RequestBody FilmeDto filmeDto) {
		return filmeService.save(FilmeConversor.filmeDtoParaModel(filmeDto));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		filmeService.delete(id);
	}
	
}
