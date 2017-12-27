package br.com.stefanini.midia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.stefanini.midia.model.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long>{

	List<Filme>findByTituloContaining(@Param("busca") String busca);
	
	
}
