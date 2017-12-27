package br.com.stefanini.midia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
