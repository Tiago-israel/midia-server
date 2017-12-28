package br.com.stefanini.midia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.stefanini.midia.dto.FilmeDto;
import br.com.stefanini.midia.dto.GeneroDto;
import br.com.stefanini.midia.service.GeneroService;

@CrossOrigin
@RestController
@RequestMapping("midia/api/generos")
public class GeneroController {
	
	@Autowired
	private GeneroService generoService;
	
	
	
	
	@GetMapping
	public List<GeneroDto>findAll(){
		return generoService.findAll();
	}
	
	@GetMapping("/{id}")
	public GeneroDto FilmeDtofindById(@PathVariable("id") Long id){
		return generoService.findByIdDto(id);
	}
	
	
	@PostMapping
	public GeneroDto save(@RequestBody GeneroDto generoDto) {
		return this.generoService.save(generoDto);
	}
	
}
