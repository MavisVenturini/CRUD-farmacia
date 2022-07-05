package com.example.farmacia.farmaciaa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.farmacia.farmaciaa.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);

}
