package com.generation.lojagames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.lojagames.model.Categoria;

@Repository  //importou a bliblioteca//
public interface CategoriaRepository extends JpaRepository <Categoria, Long> {
	public List <Categoria> findAllByTituloContainingIgnoreCase(@Param("tipo")String titulo);

	
}
