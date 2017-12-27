package br.com.stefanini.midia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.stefanini.midia.model.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long>{

}
