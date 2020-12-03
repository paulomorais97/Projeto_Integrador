package com.longevida.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.longevida.model.Produtos;

@Repository
public interface ProdutoRepository extends JpaRepository<Produtos,Long>{
	
	public List<Produtos> findAllByNameProdutoIgnoreCaseContaining(String produto);

}
