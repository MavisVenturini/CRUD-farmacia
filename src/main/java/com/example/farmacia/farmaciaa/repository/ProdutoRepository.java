package com.example.farmacia.farmaciaa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.farmacia.farmaciaa.model.Produto;

@Repository
public interface ProdutoRepository  extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByLaboratorioContainingIgnoreCase( String laboratorio);
}
